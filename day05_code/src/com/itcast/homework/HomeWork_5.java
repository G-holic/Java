package com.itcast.homework;

// 5、判断数组中的元素值是否对称
// 判断某个数组是否是对称数组，即数组正序遍历和倒序遍历的结果是一样的。例如：
//
//
//        开发提示：数组中元素首尾比较。
public class HomeWork_5 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 3, 2, 1};
        int[] arr = {1, 2, 3, 4, 5, 2, 1};

        boolean flag = true; // 假设其对称
        for (int left = 0, right = arr.length - 1; left < right; left++, right--) {
            if (arr[left] != arr[right]) {
                flag = false;
                break;
            }
        }
        System.out.println(flag ? "对称" : "不对称");
    }
}
