package cn.itcast.io_IO流;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

/*
3、文件IO流
（1）FileInputStream类
    如果文件不存在，会报错java.io.FileNotFoundException: 1.txt (系统找不到指定的文件。)
（2）FileOutputStream类
    如果文件不存在，会自动创建
    如果文件已存在，会覆盖原来的内容
    如果要追加，在创建FileOutputStream类对象时，加一个参数true
（3）FileReader类

父类 Reader类：
- `public int read()`： 从输入流读取一个字符。 虽然读取了一个字符，但是会自动提升为int类型。返回该字符的Unicode编码值。如果已经到达流末尾了，则返回-1。
- `public int read(char[] cbuf)`： 从输入流中读取一些字符，并将它们存储到字符数组 cbuf中 。每次最多读取cbuf.length个字符。返回实际读取的字符个数。如果已经到达流末尾，没有数据可读，则返回-1。
- `public int read(char[] cbuf,int off,int len)`：从输入流中读取一些字符，并将它们存储到字符数组 cbuf中，从cbuf[off]开始的位置存储。每次最多读取len个字符。返回实际读取的字符个数。如果已经到达流末尾，没有数据可读，则返回-1。
- `public void close()` ：关闭此流并释放与此流相关联的任何系统资源。
 */
public class TestFileReader {
    @Test
    public void test02() throws IOException {
        FileReader fis = new FileReader("1.txt");
         /*
        要以字符的方式读取一个文件：当前模块下的文件1.txt 内容是：我叫李四
         */
        char[] data = new char[4];
        while (true) {
            int len = fis.read(data);
            if (len == -1) {
                break;
            }

            System.out.println(new String(data, 0, len));//本次读取了几个字节，就用几个字节构造字符串
            // 发现以字符读没乱码
        }
        fis.close();
    }
    @Test
    public void test01() throws IOException {
        FileInputStream fis = new FileInputStream("1.txt");
         /*
        要以字节的方式读取一个文件：当前模块下的文件1.txt 内容是：我叫李四
         */
        byte[] data = new byte[2];
        while (true) {
            int len = fis.read(data);
            if (len == -1) {
                break;
            }

            System.out.println(new String(data, 0, len));//本次读取了几个字节，就用几个字节构造字符串
            //new String就是解码操作，但是发现乱码了
        }
        fis.close();
    }
}
