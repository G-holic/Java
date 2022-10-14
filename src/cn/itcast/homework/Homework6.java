package cn.itcast.homework;
/*1. 定义类Homework6
2. 定义 main方法
3. 定义两个整数变量a，b并赋值
4. 控制台输出变量a，b互换前的值
5. 定义一个第三方变量temp
6. 利用第三方变量temp使a，b的值互换
7. 控制台输出变量a，b互换后的值*/
public class Homework6 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a);
        System.out.println(b);
        int temp;
        temp = a;
        a = b;
        b = temp;

        System.out.println(a);
        System.out.println(b);

    }
}
