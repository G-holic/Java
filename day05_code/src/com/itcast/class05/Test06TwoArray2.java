package com.itcast.class05;

public class Test06TwoArray2 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = new int[arr1.length];//arr2中元素都是0

        System.out.println(arr1); // [I@1b6d3586
        System.out.println(arr2); // [I@4554617c
        //把arr1的元素复制给arr2
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = arr1[i];
            System.out.println(arr2[i]);
        }
    }
}
