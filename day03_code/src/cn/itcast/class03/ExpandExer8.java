package cn.itcast.class03;


import java.util.Scanner;

/*
 * 解方程
 * */
public class ExpandExer8 {
    public static void main(String[] args) {
        //（1）先输入a,b,c三个函数的参数
        Scanner input = new Scanner(System.in);
        System.out.println("请输入方程：ax的平方 + bx + c = 0 的三个参数");
        System.out.print("a： ");
        double a = input.nextDouble();

        System.out.print("b： ");
        double b = input.nextDouble();

        System.out.print("c： ");
        double c = input.nextDouble();

        input.close();
        //（2）根据参数的不同，求方程的根/解
        if (a != 0) {
            double d = b * b - 4 * a * c;
            if (d > 0) {
                double x1 = (-b + Math.sqrt(d)) / (2 * a);
                double x2 = (-b - Math.sqrt(d)) / (2 * a);
                System.out.println("一元二次方程有两个实数解：" + x1 + "," + x2);
            } else if (d < 0) {
                System.out.println("一元二次方程在实数范围内无解");
            } else {
                double x = -b / (2 * a);
                System.out.println("一元二次方程有一个实数解：" + x);
            }
        } else { // a==0
            if (b != 0) {
                double x = -c / a;
                System.out.println();
                System.out.println("一元二次方程有一个实数解：" + x);
            } else { // b = 0
                System.out.println("参数输入有误，该式子不是方程");
            }
        }
    }
}
