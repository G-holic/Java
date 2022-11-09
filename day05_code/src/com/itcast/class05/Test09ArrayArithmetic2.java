package com.itcast.class05;

/*
2、找最大值或最小值
 */
public class Test09ArrayArithmetic2 {
    public static void main(String[] args) {
        //元素个数有10个，通过Math.random()产生，范围[0,100)
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.println(arr[i]);
        }

        // 找出他们当中最大的值
        int max = arr[0]; // 假设第一个元素最大
        // arr[0] 元素不用和max比了，所以i=1
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("最大值： " + max);
    }
}
