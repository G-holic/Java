package com.itcast.homework;

// 3、查找数组中个数过半的数字
/*
*有一个长度为10的整型元素的数组arr，其中有一个元素出现次数超过n / 2，求这个元素。例如：
*int[] arr = {1, 2, 3, 2, 2, 2, 5, 4, 2};
*开发提示：

- 对数组进行排序
- 取占据数组中间位置的元素，如果某个数字出现的次数过半，那么给数组排序后，这个数字一定会占据数组中间的位置
- 统计占据数组中间位置的元素实际出现的次数，这样就不用统计每一个数字出现的次数了
* */
public class Promote_Work_3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 2, 2, 5, 4, 2};

        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("排序后的数组是： ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        int mid = arr[arr.length / 2]; // 中间位置元素
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[mid]) {
                count++;
            }
        }
        if (count > arr.length / 2) {
            System.out.println("\n数组中过半的数是" + mid + "这个数一共出现了" + count + "次");
        } else {
            System.out.println("不存在");
        }
    }
}
