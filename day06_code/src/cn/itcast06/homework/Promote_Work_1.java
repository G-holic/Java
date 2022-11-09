package cn.itcast06.homework;

// 1、找数组平衡数
/*
*
*判断数组中是否存在一个值，其左侧的值累加加和等于其右侧的值累加和，如果存在，找出这个值，如果不存在就显示不存在。

例如：[1,2,5,3,2,4,2]，结果为：第4个值3

​[9, 6, 8, 8, 7, 6, 9, 5, 2, 5]，结果是不存在。
*
* */
public class Promote_Work_1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 3, 2, 4, 2};
//        int[] arr = {9, 6, 8, 8, 7, 6, 9, 5, 2, 5};

        boolean flag = false;
        for (int mid = 0; mid < arr.length; mid++) {
            int lefSum = 0;
            int rightSum = 0;
            for (int i = 0; i < mid; i++) {
                lefSum += arr[i];
            }
            for (int i = mid + 1; i < arr.length; i++) {
                rightSum += arr[i];
            }
            if (lefSum == rightSum) {
                System.out.println("平衡数是： " + arr[mid]);
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("结果不存在！");
        }
    }
}
