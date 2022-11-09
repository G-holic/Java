package cn.itcast.io_IO流;

import org.junit.Test;

import java.io.FileWriter;
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
（4）FileWriter类

父类Writer类
- `public void write(int c)` 写入单个字符。
- `public void write(char[] cbuf) `写入字符数组。
- `public void write(char[] cbuf, int off, int len) `写入字符数组的某一部分,off数组的开始索引,len写的字符个数。
- `public void write(String str) `写入字符串。
- `public void write(String str, int off, int len)` 写入字符串的某一部分,off字符串的开始索引,len写的字符个数。
- `public void flush() `刷新该流的缓冲。
- `public void close()` 关闭此流，但要先刷新它。
 */
public class TestFileWriter {
    @Test
    public void test()throws IOException {
        //输出一句话到1.txt
        FileWriter fw = new FileWriter("1.txt",true);//true表示追加
        fw.write("我爱你");
        System.out.println(fw);
        fw.close();
    }
}
