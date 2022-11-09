package cn.itcast.class03;

import java.util.Scanner;

/*
* 10、赌数游戏：随机产生3个1-6的整数，如果三个数相等，那么称为“豹子”，
* 如果三个数之和大于9，称为“王”，如果三个数之和小于等于9，称为“小”，
* 用户从键盘输入押的是“豹子”、“大”、“小”，并判断是否猜对了
提示：随机数  Math.random()产生 [0,1)范围内的小数
* */
public class ExpandExer10 {
    public static void main(String[] args) {
        //1、随机产生3个1-6的整数
        int a = (int) (Math.random() * 6 + 1);
        int b = (int) (Math.random() * 6 + 1);
        int c = (int) (Math.random() * 6 + 1);

        //2、押宝
        Scanner input = new Scanner(System.in);
        System.out.println("请押宝（豹子、大、小）： ");
        String game = input.next();

        input.close();

        //3、判断结果
        //switch支持String类型
        boolean result = false; // 给他默认值
        switch (game) {
            case "豹子":
                result = a == b && b == c;
                /*
                这句代码要被执行，只有输入的是豹子。
                flag的结果只有2种，
                当 a=b=c时，为true，否则为false
                 */
                break;
            case "大":
                result = a + b + c > 9;
                /*
                这句代码要被执行，只有输入的是大。
                flag的结果只有2种，
                当 a + b + c>9时，为true，否则为false
                 */
                break;
            case "小":
                result = a + b + c <= 9;
                /*
                这句代码要被执行，只有输入的是大。
                flag的结果只有2种，
                当 a + b + c<=9时，为true，否则为false
                 */
                break;
            default:
//                result = false;
                System.out.println("输入错误！");
                break;
        }
        System.out.println("三个数分别是： " + a + "," + b + "," + c);
        System.out.println(result ? "猜对了" : "猜错了");
    }
}
