package cn.itcast06.homework;

// 4、求数组中元素的最短距离
/*
*随机产生10个[0,100）之间整数存储到数组中，找出数组中的两个元素x和y，使得(x - y)绝对值最小。

开发提示：

- 将数组进行排序
- 求相邻元素的差，差值最小值就是最短距离
*
*
* */
public class Promote_Work_4 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        System.out.println("生成的数组是： ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i] + " ");
        }

        // 排序
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("\n排序后的数组是： ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        int min = arr[1] - arr[0]; // 假设第二个和第一个元素的差最小
        for (int i = 1; i < arr.length - 1; i++) {
            int miss = arr[i + 1] - arr[i];
            if (miss < min) {
                min = miss;
            }
        }
        System.out.println("\n最短距离是：" + min);
    }
}
