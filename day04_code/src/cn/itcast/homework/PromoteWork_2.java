package cn.itcast.homework;

import java.util.Scanner;

/*
2、计算这一天是在打鱼还是晒网
案例需求：假设从2000年1月1日开始三天打鱼，两天晒网，
        从键盘输入今天的日期年、月、日，显示今天是打鱼还是晒网？*/
public class PromoteWork_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //如果要考虑输入非法值的情况，代码就比较复杂
        System.out.println("请输入日期: ");
        int year;
        while (true) {
            System.out.print("请输入年份： ");
            year = input.nextInt();
            if (year >= 2000) {
                break;
            } else {
                System.out.println("输入的年份必须大于2000");
            }
        }

        int month;
        while (true) {
            System.out.print("请输入月份： ");
            month = input.nextInt();
            if (month >= 1 && month <= 12) {
                break;
            } else {
                System.out.print("月份值必须在[1,12]之间");
            }
        }

        // 计算某月的总天数
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
            System.out.print("请输入日期： ");
            day = input.nextInt();
            if (day < 0) {
                System.out.print("输入的日期必须大于0！");
            } else if (day > totalDaysMonth) {
                System.out.println(year + "年" + month + "月" + "最多有" + totalDaysMonth + "天");
            } else {
                break;
            }
        }

        int days = day;
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
                days += 30;
            }
        }

        System.out.print(year + "年" + month + "月" + day + "日" + "这一天在");
        boolean result = days % 5 == 1 || days % 5 == 2 || days % 5 == 3;
        System.out.print(result ? "打鱼" : "晒网");
    }
}
