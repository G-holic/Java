package cn.itcast.io_IO流;

import org.junit.Test;

import java.io.FileOutputStream;
import java.io.IOException;

/*
3、文件IO流
（1）FileInputStream类
    如果文件不存在，会报错java.io.FileNotFoundException: 1.txt (系统找不到指定的文件。)
（2）FileOutputStream类
    如果文件不存在，会自动创建
    如果文件已存在，会覆盖原来的内容
    如果要追加，在创建FileOutputStream类对象时，加一个参数true

它的父类是OutputStream类，字节输出流

- public void write(int b) ：将指定的字节输出流。虽然参数为int类型四个字节，但是只会保留一个字节的信息写出。
- public void write(byte[] b)：将 b.length字节从指定的字节数组写入此输出流。
- public void write(byte[] b, int off, int len)：从指定的字节数组写入 len字节，从偏移量 off开始输出到此输出流。
`public void close()` ：关闭此输出流并释放与此流相关联的任何系统资源。

 */
public class TestFileOutputStream {
    @Test
    public void test01() throws IOException {
        // 输出lisi到1.txt
        FileOutputStream fos = new FileOutputStream("1.txt");

        // 把字符串转为字节数组
        fos.write("lisi".getBytes());// 会覆盖原来的内容

        fos.close();
    }
    @Test
    public void test02() throws IOException {
        // 输出hello到1.txt，接着原来内容写
        FileOutputStream fos = new FileOutputStream("1.txt",true);// true 表示追加

        // 把字符串转为字节数组
        fos.write("hello".getBytes());

        fos.close();
    }

}
