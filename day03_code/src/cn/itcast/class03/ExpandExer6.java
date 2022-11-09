package cn.itcast.class03;

import java.util.Scanner;

/*
 * 6、编写程序：由键盘输入三个整数分别存入变量num1、num2、num3，实现从小到大输出三个整数。
 * */
public class ExpandExer6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        System.out.print("请输入第一个整数：");
        int num1 = input.nextInt();

        System.out.print("请输入第二个整数：");
        int num2 = input.nextInt();

        System.out.print("请输入第三个整数：");
        int num3 = input.nextInt();
        */

        System.out.println("请连续输出三个整数： ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);

        // 穷举法
        //穷举法
        /*
        num1 <= num2 <= num3
        num1 <= num3 <= num2
        num2 <= num1 <= num3
        num2 <= num3 <= num1
        num3 <= num1 <= num2
        num3 <= num2 <= num1
         */
//        if (num1 <= num2 && num2 <= num3) {
//            System.out.println(num1 + "<=" + num2 + "<=" + num3);
//        } else if (num1 <= num3 && num3 <= num2) {
//            System.out.println(num1 + "<=" + num3 + "<=" + num2);
//        } else if (num2 <= num1 && num1 <= num3) {
//            System.out.println(num2 + "<=" + num1 + "<=" + num3);
//        } else if (num2 <= num3 && num3 <= num1) {
//            System.out.println(num2 + "<=" + num3 + "<=" + num1);
//        } else if (num3 <= num1 && num1 <= num2) {
//            System.out.println(num3 + "<=" + num1 + "<=" + num2);
//        } else {
//            System.out.println(num3 + "<=" + num2 + "<=" + num1);
//        }

//        俩俩比较法
//        if (num1 <= num2) {
//            if (num3 <= num1) {
//                System.out.println(num3 + "<=" + num1 + "<=" + num2);
//            } else if (num2 <= num3) {
//                System.out.println(num1 + "<=" + num2 + "<=" + num3);
//            } else { // num1 <= num3 <= num2
//                System.out.println(num1 + "<=" + num3 + "<=" + num2);
//            }
//        } else { // num2 < num1
//            if (num3 < num2) {
//                System.out.println(num3 + "<=" + num2 + "<=" + num1);
//            } else if (num2 <= num3) {
//                System.out.println(num2 + "<=" + num1 + "<=" + num3);
//            } else { // num2 <= num3 <= num1
//                System.out.println(num2 + "<=" + num3 + "<=" + num1);
//            }
//        }

        //交换法
        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }//确保num1 <= num2
        if (num2 > num3) {
            int temp = num2;
            num2 = num3;
            num3 = temp;
        }
        //确保num2 <= num3
        //经过前面两个if，虽然不能保证3个数已经完全排好序，但是可以保证num3中最大
        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        } //确保num1 <= num2
        System.out.println(num1 + "<=" + num2 + "<=" + num3);
    }
}
