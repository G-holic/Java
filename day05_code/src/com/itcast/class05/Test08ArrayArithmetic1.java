package com.itcast.class05;

/*
数组的基础算法：
1、对数组元素的统计：
统计偶数的个数、正数的个数
累加和，求平均值
...
 */
public class Test08ArrayArithmetic1 {
    public static void main(String[] args) {
        //元素个数有10个，通过Math.random()产生，范围[0,100)
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.println(arr[i]);
        }

        // 统计里面偶数的个数
        // 统计所有元素的总和
        // 求它们的平均值
        // 统计所有元素的乘积

        int count = 0;
        int sum = 0;
        int multiply = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
            sum += arr[i];
            multiply *= arr[i];
        }
        System.out.println("偶数的个数有： " + count);
        System.out.println("总和： " + sum);
        System.out.println("总乘积： " + multiply);
        System.out.println("平均值： " + (double) (sum / arr.length));
    }
}
