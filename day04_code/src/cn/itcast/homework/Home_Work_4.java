package cn.itcast.homework;

import java.util.Scanner;

/*
 *4、计算这一天是这一年的第几天
 *案例需求：从键盘分别输入年、月、日，
 * 使用循环for+if实现，判断这一天是当年的第几天
 * */
public class Home_Work_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请分别输入年月日： ");
        System.out.print("年： ");
        int year = input.nextInt();

        System.out.print("月： ");
        int month = input.nextInt();

        System.out.print("日： ");
        int day = input.nextInt();

        int days = day;
        boolean lean_year = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
        for (int i = 1; i < month; i++) {
            if (i == 2) {
                if (lean_year) {
                    days += 29;
                }else {
                    days += 28;
                }
            } else if (i % 2 == 0 || i != 8) {
                days += 31;
            } else {
                days += 30;
            }
        }

        System.out.println(year + "年" + month + "月" + day + "日是这一年的第" + days + "天");

        input.close();
    }
}
