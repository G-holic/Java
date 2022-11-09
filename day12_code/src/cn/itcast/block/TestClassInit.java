package cn.itcast.block;

/*
7.1.5 类初始化
1、类初始化和哪些代码有关？
（1）静态变量声明后面的显式赋值
class A{
    static int a = 1;//静态变量声明后面的显式赋值
}
（2）静态代码块

2、它们是如何执行的呢？
类初始化其实是执行一个<clinit>()
<init>：实例初始化，每一个至少有一个，可能有多个，有几个看构造器的个数
<clinit>：类初始化   cl=class
<clinit>()  每一个类只有一个，不会有多个
<clinit>() 方法的代码由：
（1）静态变量声明后面的显式赋值
（2）静态代码块
这两部分的代码按照编写的顺序组装。


 */
public class TestClassInit {
    public static void main(String[] args) {
        // 第一次用Fu类时，会先对Fu类进行初始化
        Fu.method(); // 只执行一次

        // 第二次用Fu类时
        Fu.method();

        // 第三次new对象
        Fu f = new Fu();


    }
}
