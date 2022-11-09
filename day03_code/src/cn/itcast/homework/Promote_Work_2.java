package cn.itcast.homework;

import java.util.Scanner;

/*
*
* ## 2、判断打鱼还是晒网

从键盘输入年、月、日，假设从这一年的1月1日开始执行三天打鱼两天晒网，
* 那么你输入的这一天是在打鱼还是晒网。
* */
public class Promote_Work_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("请输入日期： ");
        System.out.print("请输入年： ");
        int year = input.nextInt();

        System.out.print("请输入月： ");
        int month = input.nextInt();

        System.out.print("请输入日： ");
        int day = input.nextInt();

        boolean sign = false;

        boolean leap_year = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
        if (year >= 0) {
            if (month >= 1 && month <= 12) {
                // 定义变量存储month月天数
                int days;

                if (month == 2) {
                    if (leap_year) {
                        days = 29;
                    } else {
                        days = 28;
                    }
                } else if (month % 2 == 0 && month != 8) {
                    days = 30;
                } else {
                    days = 31;
                }
                if (day >= 1 && day <= days) {
                    sign = true;
                } else {
                    System.out.println("输入的日期有误！");
                }
            } else {
                System.out.println("输入的月份有误！（温馨提示：请输入1~12的整数）");
            }
        } else {
            System.out.println("输入的年份有误！（温馨提示：请输入正整数）");
        }

        if (sign) {
            int days = 0;
            switch (month) {
                case 12:
                    //累加的1-11月
                    days += 30; //这个30是代表11月份的满月天数
                    //这里没有break，继续往下走
                case 11:
                    //累加的1-10月
                    days += 31;//这个31是代表11月份的满月天数
                    //这里没有break，继续往下走
                case 10:
                    days += 30; //9月
                case 9:
                    days += 31; //8月
                case 8:
                    days += 31; //7月
                case 7:
                    days += 30; //6月
                case 6:
                    days += 31; //5月

                case 5:
                    days += 30; //4月
                case 4:
                    days += 31; //3月
                case 3: //2月
                    if (leap_year) {
                        days += 29;
                    } else {
                        days += 28;
                    }
                case 2:
                    days += 31; //1月
                case 1:
                    days += day; //第month月的第day天
            }
            System.out.print(year + "年" + month + "月" + day + "天是");
            System.out.println(days % 5 == 0 || days % 5 == 4 ? "晒网" : "打鱼");
        }
        input.close();
    }
}
