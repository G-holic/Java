package cn.itcast08.exam;
/*
1、在MathTools类中
（1）声明一个add方法，可以求两个整数的和
分析：
两个整数是未知的，需要设计参数
计算有结果，两个整数的和，需要返回值，int类型
（2）声明一个subtract方法，可以求两个整数的差
（3）声明一个abs方法，可以求任意一个整数的绝对值
（4）在Exam1类中测试调用
 */
public class Exam1 {
    public static void main(String[] args) {
        MathTools mathTools = new MathTools();
        System.out.println("5+6的和是： "+mathTools.add(5,6));
        System.out.println("10-4的差是： "+mathTools.subtract(10,4));
        System.out.println("1-19的绝对值是： "+mathTools.abs(mathTools.subtract(1,-19)));
    }
}
