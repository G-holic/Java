package cn.itcast.class03;

import java.util.Scanner;

/*
 *4、从键盘输入一个分数，如果成绩在[0,100]之间，就显示成绩值，否则就显示输入成绩错误！
 * */
public class ExpandExer4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入分数[0,100]： ");
        int score = input.nextInt();

        if (score >= 0 && score <= 100) {
            System.out.println("分数是: " + score);
        } else {
            System.out.println("输入成绩错误！");
        }

        input.close();
    }
}
