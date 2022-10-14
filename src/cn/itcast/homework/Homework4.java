package cn.itcast.homework;
/*1. 定义类 Homework4
2. 定义 main方法
3. 定义2个 byte类型变量,分别赋byte类型范围内最大值和最小值,并输出在控制台.
4. 定义2个 short类型变量,分别赋short类型范围内的值,并输出在控制台.
5. 定义2个 int类型变量,分别赋int类型范围内的值,并输出在控制台.
6. 定义2个 long类型变量,分别赋超过int类型范围的值,并输出在控制台.*/
public class Homework4 {
    public static void main(String[] args) {
        byte a = Byte.MAX_VALUE;
        byte b = Byte.MIN_VALUE;

        short c = Short.MAX_VALUE;
        short d = Short.MIN_VALUE;

        int e = Integer.MAX_VALUE;
        int f = Integer.MIN_VALUE;

        long g = Long.MAX_VALUE;
        long h = Long.MIN_VALUE;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
    }


}
