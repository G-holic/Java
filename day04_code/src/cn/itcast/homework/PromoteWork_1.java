package cn.itcast.homework;

import java.util.Scanner;

/*
 * 1、计算这一天是这一年的第几天
 *案例需求：从键盘分别输入年、月、日，判断这一天是当年的第几天。并增加输入值的合法性判断，确保输入的年份值必须大于0，月份值必须在[1,12]之间，日期值必须在[1, 当月最大日期值]范围内。
 * */
public class PromoteWork_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //如果要考虑输入非法值的情况，代码就比较复杂
        System.out.println("请输入日期：");

        int year;
        while (true) {
            System.out.print("年： ");
            year = input.nextInt();
            if (year > 0) {
                break;
            }
            System.out.println("年份必须大于0");
        }

        int month;
        while (true) {
            System.out.print("月： ");
            month = input.nextInt();
            if (month >= 1 && month <= 12) {
                break;
            }
            System.out.println("月份值必须在[1,12]之间");
        }

        //计算某月的总天数
        int totalDaysMonth;
        boolean lean_year = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
        if (month == 2) {
            if (lean_year) {
                totalDaysMonth = 29;
            } else {
                totalDaysMonth = 28;
            }
        } else if (month ==4||month==6||month==9||month==11) {
            totalDaysMonth = 30;
        } else {
            totalDaysMonth = 31;

        }

        int day;
        while (true) {
            System.out.print("日： ");
            day = input.nextInt();
            if (day < 0) {
                System.out.println("日期必须大于0");
            } else if (day > totalDaysMonth) {
                System.out.println(year + "年" + month + "月" + "最多只有" + totalDaysMonth);
            } else {
                break;
            }
        }

        int days = day; // 存储当前天数
        for (int i = 1; i < month; i++) {
            if (i == 2) {
                if (lean_year) {
                    days += 29;
                } else {
                    days += 28;
                }
            } else if (i % 2 != 0 || i == 8) {
                days += 31;
            } else {
                days += 31;
            }
        }
        System.out.println(year + "年" + month + "月" + day + "日这一天是这一年的第" + days + "天");
    }
}
