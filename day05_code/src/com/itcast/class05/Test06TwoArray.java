package com.itcast.class05;

public class Test06TwoArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = arr1;
        /*
        上面arr1和arr2是两个数组吗？

        arr1和arr2是两个数组变量，但是它们都是指向堆中同一个数组对象。
         */
        arr2[1] = 100;// 修改arr2数组的第二个元素的值为100
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        System.out.println(arr1); // [I@1b6d3586
        System.out.println(arr2); // [I@1b6d3586
    }

}
