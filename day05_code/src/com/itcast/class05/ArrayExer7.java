package com.itcast.class05;

import java.util.Scanner;

/*
有10个评委给参加编程比赛的某个选手的作品打分，从键盘输入10个评委的分数，并存储到一维数组中。
然后求选手的最后得分（去掉一个最高分和一个最低分后其余8位评委打分的平均值）
 */
public class ArrayExer7 {
    public static void main(String[] args) {
        //1.声明一个数组，并且初始化长度为10
        int[] scores = new int[10];


        int max = 0;
        int min = 100; // 分数范围在[0,100]
        double sum = 0;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            System.out.print("请输入第" + (i + 1) + "个评委的分数： ");
            scores[i] = input.nextInt();
            sum += scores[i];
            if (scores[i] > max) {
                max = scores[i];
            }
            if (scores[i] < min) {
                min = scores[i];
            }
        }

        // 另一个循环，遍历输出
        System.out.println("10个评委的分数如下");
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + " ");
        }
        System.out.println();
        System.out.println("最高分： " + max);
        System.out.println("最低分： " + min);
        System.out.println("平均分： " + (sum - max - min) / (scores.length - 2));
        input.close();
    }
}
