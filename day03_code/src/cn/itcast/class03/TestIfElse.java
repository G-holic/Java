package cn.itcast.class03;

import java.util.Scanner;

/*
（二）双分支条件判断
1、语法格式：
if(条件表达式){
    当条件表达式为true时，要执行的语句块1；
}else{
    当条件表达式为false时，要执行的语句块2；
}

2、注意
（1）if()中的值，不管是常量、变量、表达式，结果只能是true/false。
（2）{}中如果只有一个语句（可以是空语句，单语句，复合语句），{}允许省略。建议大家保留。
（3）else不可以单独使用，必须配合if使用
 */
public class TestIfElse {
    public static void main(String[] args) {
        //从键盘输入一个整数，如果是偶数，就输出偶数，否则就输出奇数。
        //0算偶数
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个整数： ");
        int num = input.nextInt();

        //判断偶数的条件  num % 2 == 0
        if (num % 2 == 0){
            System.out.println(num + "是偶数");
            System.out.println(num + "是双数");
        }else {
            System.out.println(num + "是奇数");
        }

        input.close();
    }
}
