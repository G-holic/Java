package cn.itcast07.exer.param;
/*
1、n个整数中的最小值和n个整数的最大公约数
（1）声明方法int min(int... nums)：返回n个整数中的最小值
（2）声明方法int maxApproximate(int... nums)：返回n个整数的最大公约数

 */
public class ParamExer1 {
    public static void main(String[] args) {
        Tools tools = new Tools();
        System.out.println("5个整数的最小值是： "+tools.min(8,9,3,7,1));
        System.out.println("5个整数的最大公约数：" + tools.maxApproximate(8,6,12,18,20));
    }
}
