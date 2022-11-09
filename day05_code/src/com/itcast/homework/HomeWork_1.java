package com.itcast.homework;

import java.util.Scanner;

//用一个数组，保存12个月的英语单词，从键盘输入1-12，显示对应的单词。
public class HomeWork_1 {
    public static void main(String[] args) {
        String[] months = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("请输入月份数字： ");
            int num = input.nextInt();
            if (num < 1 || num > 12) {
                System.out.println("输入错误！请输入【1，12】的数字！");
            } else {
                System.out.println(num + "对应的月份英语单词是： " + months[num - 1]);
                break;
            }
        }


    }
}
