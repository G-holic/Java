package cn.itcast.io_IO流;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

/*
3、文件IO流
（1）FileInputStream类
    如果文件不存在，会报错java.io.FileNotFoundException: 1.txt (系统找不到指定的文件。)

父类：InputStream类（字节输入流）
- public int read()： 从输入流读取一个字节。返回读取的字节值。虽然读取了一个字节，但是会自动提升为int类型。
            如果已经到达流末尾，没有数据可读，则返回-1。
- public int read(byte[] b)： 从输入流中读取一些字节数，并将它们存储到字节数组 b中 。每次最多读取b.length个字节。
        返回实际读取的字节个数。如果已经到达流末尾，没有数据可读，则返回-1。
- public int read(byte[] b,int off,int len)：从输入流中读取一些字节数，并将它们存储到字节数组 b中，从b[off]开始存储，每次最多读取len个字节 。
    返回实际读取的字节个数。如果已经到达流末尾，没有数据可读，则返回-1。
`public void close()` ：关闭此输入流并释放与此流相关联的任何系统资源。

4、IO流操作的步骤：
A：先选择合适的IO流类，创建它的对象
B：读或写操作
C：关闭IO流
    因为IO流类的对象会在JVM内存中开辟空间。这个部分的内存，可以由JVM的GC自动回收。
    但是IO流的操作还会在JVM内存的外部开辟空间，因为IO操作需要用到操作系统的一些函数，这些内存GC是无法回收的。
    那么要通过调用close方法，通知操作系统释放对应的内存。
 */
public class TestFileInputStream {
    @Test
    public void test01() throws IOException {
        /*
        要以字节的方式读取一个文件：当前模块下的文件1.txt
         */
        FileInputStream fis = new FileInputStream("1.txt");// 相对路径
        // 1.txt  abc

        System.out.println(fis.read());// 97
        System.out.println(fis.read());// 98
        System.out.println(fis.read());// 99
        System.out.println(fis.read());// -1

        fis.close();
    }

    @Test
    public void test02() throws IOException {
        /*
        要以字节的方式读取一个文件：当前模块下的文件1.txt
         */
        FileInputStream fis = new FileInputStream("1.txt");// 相对路径
        // 1.txt  abc

        byte[] data = new byte[2];
        int len = fis.read(data);//数据读取到data字节数组中
        System.out.println("len = " + len);//2
        System.out.println(Arrays.toString(data));//[97,98]

        len = fis.read(data);
        System.out.println("len = " + len);//1
        System.out.println(Arrays.toString(data));//[99, 98]   这个98是上次读取的，本次只读取了一个字节

        len = fis.read(data);
        System.out.println("len = " + len);//-1
        System.out.println(Arrays.toString(data));//[99, 98]   这个99,98是上次读取的，本次只读取了一个字节


        fis.close();
    }

    @Test
    public void test03() throws IOException {
        FileInputStream fis = new FileInputStream("1.txt");
        while (true) {
            int len = fis.read();
            if (len == -1) {
                break;
            }
            System.out.println(len);
        }
        fis.close();
    }

    @Test
    public void test04() throws IOException {
        FileInputStream fis = new FileInputStream("1.txt");

        byte[] data = new byte[2];
        while (true) {
            int len = fis.read(data);// 数据读取到data字节数组中
            if (len == -1) {
                break;
            }
            System.out.println("len = " + len);
//            System.out.println(Arrays.toString(data));
            System.out.println(new String(data, 0, len));//本次读取了几个字节，就用几个字节构造字符串

        }
        fis.close();
    }
}
