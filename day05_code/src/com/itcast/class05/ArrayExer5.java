package com.itcast.class05;
//用一个数组存储本组学员的姓名，先从键盘输入小组人数，再从键盘输入每一个学员的姓名，然后遍历显示。

import java.util.Scanner;

public class ArrayExer5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("请输入本组学员的人数： ");
        int count = input.nextInt();

        //声明数组，并且初始化数组的长度为count
        String[] names = new String[count];

        //从键盘输入每一个学员的姓名
        for (int i = 0; i < names.length; i++) {
            System.out.print("请输入第" + (i + 1) + "个学员的姓名");
            names[i] = input.next();
        }
        //遍历显示
        System.out.println("本组学员有：");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
//            String name = names[i];
//            System.out.println(name);
        }
        input.close();
    }
}
