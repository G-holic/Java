package cn.itcast.io_IO流;

import org.junit.Test;

import java.util.Scanner;

/*
1、什么是IO？
I：Input，数据的读取，数据的输入
    数据的输入，可以是从键盘输入、从文件读取、从网络接收...
O：Output，写数据，数据的输出
    输出的输出，可以是输出到控制台、写到文件、发送到网络中...

2、在Java中要进行IO操作需要使用IO流类来完成。
现在讲的是传统的IO，阻塞式IO。
后面大家还会接触到NIO（非阻塞式IO）和AIO（异步IO）。

基础阶段的IO流类：
（1）按照方向分
输入流类：
    InputStream、Reader系列
输出流类：
    OutputStream、Writer系列
（2）按照操作数据的方式，单位分：
字节流：
    InputStream、OutputStream系列
字符流
    Reader、Writer
（3）按照角色不同
节点流：
    和数据的源头/目的地连接的IO流：
        FileInputStream、FileOutputStream、FileReader、FileWriter：读写文件（以它为例讲解）
        ByteArrayInputStream、ByteArrayOutputStream、CharArrayReader、CharArrayWriter：读写数组
        ....
处理流/包装流/装饰流：
    它是在其他IO流基础上，增加功能用的。
        BufferedInputStream、BufferedOutputStream、BufferedReader、BufferedWriter，给其他IO流增加缓冲功能
        InputStreamReader、OutputStreamWriter，给其他IO流转换类型用的，或者给其他IO编码、解码用的
        ....

区分它们的依据是创建它们的对象的方式，如果是处理流，创建调用它们的构造器创建对象时，必须传入另一个IO流对象。
    FileInputStream(String name) ：参数不是IO流类型
    BufferedInputStream(InputStream in)：参数是IO流类型

 2、IO流类的四个基类，四个超类、四个父类，其他的IO流都是从他们演变过来，是他们的子类。
    字节输入流：InputStream
    字节输出流：OutputStream
    字符输入流：Reader
    字符输出流：Writer
 */
public class TestIO {
    @Test
    public void test01(){
        System.out.println("hello");// 这个也是IO的操作，把数据输出到控制台
    }
    @Test
    public void test02(){
        Scanner input = new Scanner(System.in);//从键盘输入
        System.out.print("输入一个姓名:");
        String name = input.next();
        System.out.println("name = " + name);
        input.close();
    }
}
