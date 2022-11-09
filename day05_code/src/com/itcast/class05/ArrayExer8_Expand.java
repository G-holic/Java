package com.itcast.class05;

import java.util.Scanner;
/*
先从键盘输入小组人数，然后声明两个数组，一个存储本组学员姓名，
一个存储本组学员成绩，再从键盘输入每一个学员的姓名和成绩，
遍历显示小组中每一个学员的姓名和分数。最后显示最高分同学的姓名和成绩。
 */
// 考虑重复值
public class ArrayExer8_Expand {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("请输入小组人数： ");
        int count = input.nextInt();

        int[] scores = new int[count];
        String[] names = new String[count];

        int max = scores[0];
        for (int i = 0; i < names.length; i++) {
            System.out.print("请输入第" + (i + 1) + "学员的姓名： ");
            names[i] = input.next();
            System.out.print("请输入第" + (i + 1) + "学员的成绩： ");
            scores[i] = input.nextInt();
            if (scores[i] > max) {
                max = scores[i];
            }
        }


        // 遍历显示
        String result = "";
        for (int i = 0; i < names.length; i++) {
            System.out.println("学员姓名： " + names[i] + "\t" + "该学员的成绩是" + scores[i]);
            if (scores[i] == max) {
                result += names[i]+" ";
            }

        }
        System.out.println("最高分是： " + max);
        System.out.println("他的名字是： " + result);
    }
}
