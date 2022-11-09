package cn.itcast.transfer_解码和编码;

import org.junit.Test;

import java.io.*;

/*
7、编码与解码问题
使用FileReader和FileWriter去操作和当前程序编码不一致的文件时，就会出现乱码的问题，怎么解决？

InputStreamReader：输入流
OutputStreamWriter：输出流

构造方法摘要
InputStreamReader(InputStream in)
          创建一个使用默认字符集的 InputStreamReader。
InputStreamReader(InputStream in, Charset cs)
          创建使用给定字符集的 InputStreamReader。
InputStreamReader(InputStream in, CharsetDecoder dec)
          创建使用给定字符集解码器的 InputStreamReader。
InputStreamReader(InputStream in, String charsetName)
          创建使用指定字符集的 InputStreamReader。

 */
public class TestInputStreamReader {
    // 此时1.txt里是我叫李四，ansi编码（即GBK）
    @Test
    public void test01() throws IOException {
        FileReader fr = new FileReader("1.txt");
        char[] data = new char[10];
        int len;
        while ((len=fr.read(data))!=-1){
            System.out.println(new String(data,0,len)); // 乱码
        }
        fr.close();
    }
    @Test
    public void test02() throws IOException{
        FileInputStream fis = new FileInputStream("1.txt");
        InputStreamReader isr = new InputStreamReader(fis,"GBK");//文件的编码是GBK，用GBK解从文件读取的数据

        char[] data = new char[10];
        int len;
        while ((len=isr.read(data))!=-1){
            System.out.println(new String(data,0,len)); // 我叫李四
        }
        isr.close();
        fis.close();
    }
    @Test
    public void test03() throws IOException{
        // 输出李四太棒了
        FileOutputStream fos = new FileOutputStream("1.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos,"GBK");//把字符数据用GBK编码转为字节数据输出

        osw.write("李四太棒了");
        osw.close();
        fos.close();
    }
    @Test
    public void test04() throws IOException {
        // 输出李四太棒了到GBK编码的1.txt文件中
        // 加入缓冲流提高效率
        FileOutputStream fos = new FileOutputStream("1.txt");
        //(1)可以加入这个位置
        BufferedOutputStream bos = new BufferedOutputStream(fos);//因为被包装的fos是字节流
        OutputStreamWriter osw = new OutputStreamWriter(bos,"GBK");//把字符数据用GBK编码转为字节数据输出
        //(2)也可以加入这儿
        BufferedWriter bw = new BufferedWriter(osw);//因为osw是字符流

        bw.write("李四太棒了");

        bw.close();
        osw.close();
        bos.close();
        fos.close();

    }
}
