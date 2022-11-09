package com.itcast.homework;

import java.util.Scanner;

//4、统计低于平均分的学生人数
/*
*先从键盘输入本组学员的人数，再从键盘输入本组学员的姓名和成绩，最后统计：

- 本组学员的平均分，
- 低于平均分的学员人数，
- 哪些学员低于平均分，
- 最高分和最低分分别是谁。
*
* */
public class PromoteWork_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入本组学员的人数： ");
        int count = input.nextInt();

        String[] names = new String[count];
        int[] grades = new int[count];

        for (int i = 0; i < grades.length; i++) {
            System.out.print("请输入第" + (i + 1) + "个学员的姓名： ");
            names[i] = input.next();
            System.out.print("请输入第" + (i + 1) + "个学员的成绩： ");
            grades[i] = input.nextInt();
        }
        input.close();

        // 遍历显示学员姓名和成绩
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + ":" + grades[i]);
        }

        //找出最高分、最低分、累加总分，计算平均分
        int max = grades[0];
        int min = grades[0];
        double sum = 0;
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] > max) {
                max = grades[i];
            }
            if (grades[i] < min) {
                min = grades[i];
            }
            sum += grades[i];
        }
        double avg = sum / grades.length;
        //输出结果
        System.out.println("最高分成绩是：" + max);
        System.out.println("最第分成绩是：" + min);
        System.out.println("平均分成绩是：" + avg);
//        System.out.println("总成绩是：" + sum);
        System.out.println("获得最高分的有：");
        for (int i = 0; i < grades.length; i++) {
            if (max == grades[i]) {
                System.out.println(names[i]);
            }
        }
        System.out.println("获得最低分的有：");
        for (int i = 0; i < grades.length; i++) {
            if (min == grades[i]) {
                System.out.println(names[i]);
            }
        }

        System.out.println("低于平均分的有： ");
        int total = 0;
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] < avg) {
                System.out.println(names[i]);
                total++;
            }

        }
        System.out.println("低于平均分的一共有： " + total + "个");
    }
}
