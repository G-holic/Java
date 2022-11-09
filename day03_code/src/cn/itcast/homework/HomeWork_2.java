package cn.itcast.homework;

import java.util.Scanner;

// 2.从键盘输入一个字符，判断它是字母还是数字，还是其他字符
public class HomeWork_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个字符： ");
        char c = input.next().charAt(0);

        if (c >= '0' && c <= '9') {
            System.out.println(c + "是数字字符");
        } else if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {
            System.out.println(c + "是字母字符");
        } else {
            System.out.println(c + "是其它字符");
        }
    }
}
