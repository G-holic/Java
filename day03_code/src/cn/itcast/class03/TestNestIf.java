package cn.itcast.class03;
/*
（四）嵌套
1、在if或else的{}中还有另一个条件判断
2、只有外面的情况满足了，才会看里面的。

案例：从键盘输入一个年份值和月份值，输出该月的总天数
要求：年份为正数，月份1-12。
例如：输入2022年5月，总天数是31天。
​     输入2022年2月，总天数是28天。
​	输入2020年2月，总天数是29天。


 */

import java.util.Scanner;

public class TestNestIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入年份： ");
        int year = input.nextInt();
        // 1.
        if (year > 0) {
            System.out.print("请输入月份： ");
            int month = input.nextInt();

            if (month >= 1 && month <= 12) {
                if (month % 2 != 0 && month != 2 || month==8) {
                    System.out.println(year + "年" + month + "有31天");
                } else if (month == 2) {
                    if (year % 4 == 0 && year / 100 != 0 || year / 400 == 0) {
                        System.out.println(year + "年" + month + "月有29天");
                    } else {
                        System.out.println(year + "年" + month + "月有28天");
                    }
                } else {
                    System.out.println(year + "年" + month + "月有30天");
                }
            } else {
                System.out.println("月份输入错误!");
            }
        } else {
            System.out.println("年份输入错误！");
        }

        // 2.
//        if(year > 0){
//            System.out.print("请输入月份：");
//            int month = input.nextInt();
//
//            if(month>=1 && month <=12){
//                if(month == 4 || month==6 || month==9 || month==11){
//                    System.out.println(year + "年" + month + "月有30天");
//                }else if(month==2){
//                    if(year%4==0 && year%100!=0 || year%400==0){
//                        System.out.println(year + "年" + month + "月有29天");
//                    }else{
//                        System.out.println(year + "年" + month + "月有28天");
//                    }
//                }else{
//                    System.out.println(year + "年" + month + "月有31天");
//                }
//            }else{
//                System.out.println("月份输入错误！");
//            }
//        }else{
//            System.out.println("年份输入错误！");
//        }
        input.close();

    }
}
