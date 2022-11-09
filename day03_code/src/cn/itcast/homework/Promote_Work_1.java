package cn.itcast.homework;

import java.util.Scanner;

/*
* ## 1、判断年、月、日是否合法

  从键盘输入年、月、日，要求年份必须是正整数，月份范围是[1,12]，
* 日期也必须在本月总天数范围内，如果输入正确，输出“年-月-日”结果，否则提示输入错误。
* */
public class Promote_Work_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("请输入日期： ");
        System.out.print("年： ");
        int year = input.nextInt();

        System.out.print("月： ");
        int month = input.nextInt();

        System.out.print("日： ");
        int day = input.nextInt();

        if (year > 0) {
            if (month >= 1 && month <= 12) {
                // 定义days变量存储month月天数
                int days;
                if (month == 2) {
                    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                        days = 29;
                    } else {
                        days = 28;
                    }
                } else if (month ==4||month==6||month==9||month==11) {
                    days = 30;
                } else {
                    days = 31;
                }

                if (day >= 1 && day <= days) {
                    System.out.println(year + "-" + month + "-" + day);
                } else {
                    System.out.println("输入的日期有误！");
                }
            } else {
                System.out.println("输入的月份有误！");
            }
        } else {
            System.out.println("输入的年份有误！");
        }
        input.close();
    }
}
