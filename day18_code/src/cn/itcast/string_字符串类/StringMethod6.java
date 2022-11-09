package cn.itcast.string_字符串类;

import org.junit.Test;

/*
系列6：开头与结尾
（26）boolean startsWith(xx)：是否以xx开头
（27）boolean endsWith(xx)：是否以xx结尾
 */
public class StringMethod6 {
    @Test
    public void test01(){
        String str = "张三";
        System.out.println(str.startsWith("张"));
    }
    @Test
    public void test02(){
        String fileName = "Hello.txt";
        System.out.println(fileName.endsWith(".java"));//判断某个文件是否是Java的源文件，依据是后缀名是否是".java"
    }
}
