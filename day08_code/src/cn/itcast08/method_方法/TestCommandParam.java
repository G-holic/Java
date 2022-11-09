package cn.itcast08.method_方法;
/*
1、命令行参数：它是指给main方法传递的参数，叫做命令行参数
2、如何给main方法的形参(String[] args)传值
（1）命令行中
java 类名  参数1  参数2  参数3 ...

（2）IDEA中
Run菜单->Edit Configurations-->
A:Main Class：main所在的类是哪个，确定是对的
B：program arguments：参数值之间使用空格分隔

public static void main(String[] args)
按理来说写成下面这种更符合：
public static void main(String... args)
但是因为可变参数的语法是从JDK1.5之后引入的，main是从JDK1.0就有的。

 */
public class TestCommandParam {
    public static void main(String[] args) {
        System.out.println("args的长度：" + args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println("第" + (i+1) +"个参数是：" + args[i]);
        }
    }
}
