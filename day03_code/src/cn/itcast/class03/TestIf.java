package cn.itcast.class03;

import java.util.Scanner;

/*
分支结构：
    可能执行其中一个分支。
分为：
（1）条件判断：if...else
（2）选择结构：switch...case

（一）单分支条件判断：if
1、语法结构：
if(条件表达式){
    执行的语句
}

2、执行特点
当if()中的表达式结果为true，{}中的语句就会执行，否则就不执行。

3、注意
（1）if()中的值，不管是常量、变量、表达式，结果只能是true/false。
（2）{}中如果只有一个语句（可以是空语句，单语句，复合语句），{}允许省略。建议大家保留。
 */
public class TestIf {
    //例子：如果输入的年龄大于等于18，输入一句话，“欢迎来到成人世界！”。否则就什么也不输出。
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入你的年龄： ");
        int age = input.nextInt();
        if (age >= 18) {
            System.out.println("欢迎来到成人世界！");
            System.out.println("祝你玩的愉快！");
        }
        input.close();
    }
}

