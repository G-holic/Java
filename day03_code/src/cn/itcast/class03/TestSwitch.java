package cn.itcast.class03;

import java.util.Scanner;

/*
二、分支结构之选择结构
1、语法结构
switch(表达式){
    case 常量值1:
        语句块1;
        【break;】
    case 常量值2:
        语句块2;
        【break;】
    ....
}

2、执行特点
（1）入口
A：case入口：当switch(表达式)的值与case的常量匹配，就从这个case进入
B：default入口：当switch(表达式)的值与case的所有常量都不匹配，就从default进入
无论default在哪里，都是先看case，再看default

（2）出口
A：switch的结束}
B：break或return（后面学习）

（3）贯穿
一旦switch结构找到入口，那么会一直往下执行，直到遇到出口。
会从一个case分支贯穿/穿透到下一个分支中

3、switch注意点
（1）case后面必须写常量值（或常量表达式），不能写变量
（2）case后面的常量值不能重复
（3）switch(表达式)的结果类型有要求，必须是byte,short,int,char，String，枚举（后面学习），其他都不可以

if()中表达式结果必须是true/false
 */
public class TestSwitch {
    public static void main(String[] args) {
        //从键盘输入星期的数字[1,7]，输出对应的英文单词
        Scanner input = new Scanner(System.in);

        System.out.print("请输入星期值[1,7]：");
        int week = input.nextInt();
        /*
        if(week == 1){
            System.out.println("monday");
        }else if(week == 2){
            System.out.println("tuesday");
        }...*/

        switch (week) {
            default:
                System.out.println("输入错误!");
                break;
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
        }
        input.close();
    }
}
