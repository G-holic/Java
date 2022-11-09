package com.itcast.homework;

import java.util.Scanner;

// 1、打鱼还是晒网
/*
*假设张三从1990年1月1日开始执行三天打鱼两天晒网，5天一个周期，风雨无阻，
* 那么李四想要找张三玩，需要从键盘输入年，月，日后，判断这一天张三是在打鱼还是晒网。

开发提示：

使用一个数组存储平年的总天数和12个月的总天数
* */
public class PromoteWork_1 {
    public static void main(String[] args) {
        int[] totalDays = {365, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Scanner input = new Scanner(System.in);


        int year;
        while (true) {
            System.out.print("请输入年份： ");
            year = input.nextInt();
            if (year >= 1990) {
                break;
            } else {
                System.out.println("年份必须大于1990年");
            }
        }

        int month;
        while (true) {
            System.out.print("请输入月份： ");
            month = input.nextInt();
            if (month >= 1 && month <= 12) {
                break;
            } else {
                System.out.println("输入的月份范围在[1,12]");
            }
        }

        boolean lean_year = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
        //如果第year年是闰年，那么2月份总天数是29
        if (lean_year) {
            totalDays[2] = 29; // 闰年是29天
        }

        int day;
        while (true) {
            System.out.print("日： ");
            day = input.nextInt();
            if (day >= 1 && day <= totalDays[month]) {
                break;
            } else {
                System.out.println(year + "年" + month + "月" + day + "这一天的范围必须在[1," + totalDays[month] + "]内");
            }
        }

        //累加[1990, year-1]年的总天数
        int days = 0;
        for (int i = 1990; i < year; i++) {//这个i代表年份
            days += totalDays[0];
            if (lean_year) {
                days++;
            }
        }
        //累加第year年[1, month-1]月的满月天数
        for (int i = 1; i < month; i++) {
            days += totalDays[i];
        }
        //累加第year年month月的day天
        days += day;

        // 判断
        System.out.print(year + "年" + month + "月" + day + "日，这一天在");
        boolean flag = days % 5 == 1 || days % 5 == 2 || days % 5 == 3;
        System.out.print(flag ? "打鱼" : "晒网");
    }
}
