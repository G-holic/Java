package com.itcast.exam;

import java.util.Scanner;

/*
2、从键盘输入年份，循环输出这年12个月每个月的总天数。
输出格式如下：
1月->31天
2月->平年28天，闰年29天
3月->31天
...
 */
public class Exam2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("请输入年份： ");
        int year = input.nextInt();

        boolean lean_year = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
        for (int month = 1; month <= 12; month++) {
            if (month == 2) {
                if (lean_year) {
                    System.out.println(month + "月有29天");
                }
                else {
                    System.out.println(month + "月有28天");

                }
            } else if (month ==4||month==6||month==9||month==11) {
                System.out.println(month + "月有30天");
            }
            else {
                System.out.println(month + "月有31天");

            }
        }
    }
}
