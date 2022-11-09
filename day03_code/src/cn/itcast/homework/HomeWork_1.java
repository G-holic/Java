package cn.itcast.homework;

import java.util.Scanner;

// 1.从键盘输入一个整数，判断它是否是5的倍数
public class HomeWork_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入整数： ");

        int num = input.nextInt();
        if (num % 5 == 0) {
            System.out.println(num + "是5的倍数！");
        } else {
            System.out.println(num + "不是5的倍数！");
        }
    }
}
