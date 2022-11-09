package com.itcast.class05;
/*
找最大值/最小值，及其下标
 */

public class Test10ArrayArithmetic3 {
    public static void main(String[] args) {
        int[] arr = {3, 5, 6, 1, 2};

        /*
//        两个变量
        int max = arr[0];//存储当前最大值
        int index = 0;//存储当前最大值的下标
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
                index = i;
            }
        }
        System.out.println("最大值：" + max);
        System.out.println("下标：[" + index+"]");*/

        int maxValue = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[maxValue]) {
                arr[maxValue] = arr[i];
                maxValue = i;
            }
        }
        System.out.println("最大值：" + arr[maxValue]);
        System.out.println("下标：[" + maxValue + "]");
    }
}
