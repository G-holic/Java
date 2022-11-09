package cn.itcast06.class06;

import java.util.Scanner;

/*
对象的创建：
    new 类名()

    new 类名(实参列表)

匿名对象，如果没有把对象赋值给一个变量，那么这样的对象称为匿名对象。
如果希望这个对象反复使用，那么最好把这个对象给一个变量。

类名  变量名 = new 类名();
 */
public class Test12CreateObject {
    public static void main(String[] args) {
        System.out.println(new Student());
        // cn.itcast06.class06.Student@1b6d3586 Student前面的是包名，Student代表对象的类型，@1b6d3586是hashCode值

        Student s1 = new Student();//创建Student类的对象
        //s1既是变量名，它是Student类型的，通过又可以称它为对象名
        System.out.println(s1); // cn.itcast06.class06.Student@4554617c

        Scanner input = new Scanner(System.in);//创建Scanner类的对象

        int[] arr = new int[5];//创建数组对象

    }
}
