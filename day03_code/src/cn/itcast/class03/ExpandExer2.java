package cn.itcast.class03;

import java.util.Scanner;

/*
 * 2、从键盘输入两个整数，求它们的和、差、乘积、商、余数

 */
public class ExpandExer2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入第一个整数： ");
        int a = input.nextInt();
        System.out.println("请输入第二个整数： ");
        int b = input.nextInt();

        System.out.println("和为： " + (a + b));
        System.out.println("差为： " + (a - b));
        System.out.println("乘积为： " + (a * b));
        System.out.println("商为： " + (a / b));
        System.out.println("余数为： "+ (a % b));

        input.close();
    }
}
