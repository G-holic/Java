package cn.itcast.class03;

import java.util.Scanner;

/*1、从键盘输入个人的信息，用合适的变量接收并输出。
例如：姓名、年龄、性别、体重、婚否等*/
public class ExpandExer1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入你的个人信息： ");
        System.out.println("姓名： ");
        String name = input.next();

        System.out.println("年龄： ");
        int age = input.nextInt();

        System.out.println("性别： ");
        char gender = input.next().charAt(0);

        System.out.println("体重： ");
        double weight = input.nextDouble();

        System.out.println("是否结婚： ");
        boolean marry = input.nextBoolean();



        System.out.println("姓名 = " + name);
        System.out.println("年龄 = " + age);
        System.out.println("性别 = " + gender);
        System.out.println("体重 = " + weight);
        System.out.println("是否结婚 = " + (marry ? "已婚" : "未婚"));

        input.close();
    }
}
