package com.itcast.exam;

import java.util.Scanner;

/*
        3、从键盘输入整数，判断是正数还是负数，输入0结束。
        并统计正数和负数的个数。（0既不是正数也不是负数）
         */
public class Exam3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int positive_num = 0;
        int negative_num = 0;

        while (true){
            System.out.print("请输入整数： ");
            int num = input.nextInt();
            if (num>0){
                positive_num++;
            }else if (num<0){
                negative_num++;
            }else {
                break;
            }
        }
        System.out.println("正数的个数是： "+positive_num);
        System.out.println("负数的个数是： "+negative_num);

        input.close();
    }
}
