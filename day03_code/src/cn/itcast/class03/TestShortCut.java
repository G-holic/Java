package cn.itcast.class03;

import java.util.Arrays;
import java.util.Scanner;

public class TestShortCut {
    public static void main(String[] args) {
        Scanner input;
        System.out.println("HELLO");
        int age = 18;
        System.out.println("age = " + age);
        System.out.println("ShortCut.main");
        System.out.println("args = " + Arrays.deepToString(args));

        double result = Math.sqrt(9);
        System.out.println(age);
        System.out.println("age = " + age);
        System.out.println(age);
        System.out.println(age);
        System.out.println(age);
        System.out.println(age);
        System.out.println(age);

        System.out.println(age);
        System.out.println(age);
        System.out.println("hello");


    }

    public static void method(){
        System.out.println("method");
    }
}
