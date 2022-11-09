package cn.itcast.class03;

import java.util.Scanner;

/*
Java中有：
（1）常量和变量：代表数据值
（2）表达式
计算和判断、赋值表达式，例如：a+b，a>b，a=b等
方法调用表达式 ，例如：System.out.println()
                    Math.sqrt(9)

（3）语句
不是所有的表达式直接加;都可以构成语句。
只有：
A：方法调用表达式
B： new 表达式
C：自增自减表达式和赋值表达式
 */
public class TestStatement {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        System.out.println("方法表达式+;构成语句");
        Math.sqrt(9);//方法表达式+;构成语句   计算结果3.0丢了
        double result = Math.sqrt(9);
        System.out.println("result = " + result);

        new Scanner(System.in);

        a++;
        ++a;
        a = b;
        String str = a > b ? "a大于b" : "b大于a";
        System.out.println(a > b ? "a大于b" : "b大于a");
    }

}
