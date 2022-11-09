package cn.itcast.junit;

import org.junit.Test;

import java.util.Scanner;

/*
使用JUnit的步骤：
1、在项目根路径下，创建一个junitlibs文件夹，把两个jar包放进去
2、IDEA中项目设置-->libraries-->+->java->junitlibs文件夹，将库应用到对应模块上
3、代码中使用@Test标记一个方法，就可以测试这个方法了

@Test注解，标记的方法有严格的要求：
（1）所在类必须是public的类，而且只能有唯一的无参构造方法。
（2）@Test标记的方法必须是public, void ,()的方法，非静态的

@Test标记的方法中，默认不支持键盘输入
 */
public class TestJUnit {
    @Test
    public void test1(){
        System.out.println("hello junit");
    }

    @Test
    public void test2(){
        System.out.println("hello java");
    }
    @Test
    public void test3(){
//        Scanner input = new Scanner(System.in);
//        System.out.print("请输入一个单词：");
//        String word = input.nextLine();
//        System.out.println("word = " + word);
//        input.close();
    }
}
