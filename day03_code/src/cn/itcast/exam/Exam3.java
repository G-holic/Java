package cn.itcast.exam;

import java.util.Scanner;

// 3、运行时从键盘输入一个整数，
// 程序可以判断一个整数是否是3的倍数或者以3结尾，如果是就打印true，否则打印false
public class Exam3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入一个整数：");
        int num = input.nextInt();
        //前面三句代码表示运行时从键盘输入了一个整数存放到了num变量中
        //补充代码

		/*
		3的倍数：num % 3 == 0 num和3相除没有余数，或者是余数为0
		以3结尾：表示个位是3，num%10 == 3
		*/
        System.out.println(num % 3 == 0 || num % 10 == 3);

    }
}
