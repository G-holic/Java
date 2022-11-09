package cn.itcast.buffer_缓冲流;

import org.junit.Test;

import java.io.*;

/*
6、缓冲流：
    作用是给其他IO流增加缓冲区，提高效率。

  缓冲流的使用必须基于其他的IO流，也就是说，缓冲流它只能是装饰（包装）别的流。
  BufferedInputStream：只能包装InputStream系列的IO流
  BufferedOutputStream：只能包装OutputStream系列的IO流
  BufferedReader：只能包装Reader系列的IO流
  BufferedWriter  ：只能包装Writer系列的IO流

  原理：所有的缓冲流在内部会开辟一块更大的缓冲区，默认大小是8192字节/字符（本质就是一个8192长度的byte/char数组）


    另外，对于BufferedReader和BufferedWriter来说，它除了提高效率之外，
    还可以使用下面两个方法，使得读写更方便：
    BufferedReader类String readLine()
    BufferedWriter类void newLine()
 */
public class TestBuffered {
    @Test
    public void test01() throws IOException {
        long start = System.currentTimeMillis();
        /*
        演示 BufferedInputStream包装FileInputStream
             BufferedOutputStream包装FileOutputStream
         来完成复制文件。
         D:\BaiduNetdiskDownload\IDEA安装及破解.zip
        * */
        FileInputStream fis = new FileInputStream("D:\\BaiduNetdiskDownload\\IDEA安装及破解.zip");

        FileOutputStream fos = new FileOutputStream("D:\\download\\IDEA安装及破解1.zip");
        byte[] data = new byte[1024];
//                byte[] data = new byte[10240];
        int len;
        while ((len = fis.read(data)) != -1) {
            fos.write(data, 0, len);
        }
        fis.close();
        fos.close();

        long end = System.currentTimeMillis();
        System.out.println("用了：" + (end - start) + "毫秒");// 15083毫秒 (文件670mb）
    }

    // 运用缓冲流
    @Test
    public void test02() throws IOException {
        long start = System.currentTimeMillis();
        /*
        演示 BufferedInputStream包装FileInputStream
             BufferedOutputStream包装FileOutputStream
         来完成复制文件。
         D:\BaiduNetdiskDownload\IDEA安装及破解.zip
        * */
        FileInputStream fis = new FileInputStream("D:\\BaiduNetdiskDownload\\IDEA安装及破解.zip");
        BufferedInputStream bis = new BufferedInputStream(fis);

        FileOutputStream fos = new FileOutputStream("D:\\download\\IDEA安装及破解2.zip");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        byte[] data = new byte[1024];
        int len;
        while ((len = bis.read(data)) != -1) {
            bos.write(data, 0, len);
        }
        fis.close();
        fos.close();

        long end = System.currentTimeMillis();
        System.out.println("用了：" + (end - start) + "毫秒");// 用了：3540毫秒
    }

    @Test
    public void test03() throws IOException {
        /*
        1.txt 手动改成以下内容（有空格）
        李四是Java讲师
            另外，对于BufferedReader和BufferedWriter来说，它除了提高效率之外，
            还可以使用下面两个方法，使得读写更方便：
            BufferedReader类String readLine()
            BufferedWriter类void newLine()
        * */
        FileReader fr = new FileReader("1.txt");
        // 一行一行读
        BufferedReader br = new BufferedReader(fr);// 包装fr
        String str;
        while ((str = br.readLine()) != null) {
            System.out.println(str);
        }
        fr.close();
    }

    @Test
    public void test04() throws IOException {
        // 一行一行的写数据
        FileWriter fw = new FileWriter("1.txt");
        fw.write("hello");
        fw.write("\r\n");
        fw.write("java");
        fw.write("\r\n");
        fw.write("world");
        fw.write("\r\n");
        fw.write("aa");
        fw.close();
    }

    @Test
    public void test05() throws IOException {
        // 一行一行的写数据
        FileWriter fw = new FileWriter("1.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("hello");
        bw.newLine();
        bw.write("java");
        bw.newLine();
        bw.write("world");
        bw.newLine();
        bw.write("aaa");
        bw.close();
        fw.close();
    }
}
