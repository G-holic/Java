package cn.itcast06.homework;
// 2、左奇右偶

/*
*现有一个长度为10的整数数组{26,67,49,38,52,66,7,71,56,87}。现在需要对元素重新排列，使得所有的奇数保存到数组左边，所有的偶数保存到数组右边。

效果如图下所示
*
*开发提示：

- 左边的偶数与右边的奇数换位置：
- 定义两个变量left和right，从左边开始查找偶数的位置，找到后用left记录，从右边开始找奇数的位置，找到后用right记录，
* 如果left<right，那么就交换，然后在上一次的基础上继续查找，直到left与right擦肩。


* */
public class Promote_Work_2 {
    public static void main(String[] args) {
        int[] arr = {26, 67, 49, 38, 52, 66, 7, 71, 56, 87};
        for (int left = 0, right = arr.length - 1; left < right; ) {
            //left代表左边需要交换的数的下标，偶数的下标
            //如果arr[left]此时是奇数，说明此时left不是我们要找的下标，left++往后移动
            while (arr[left] % 2 != 0) {
                left++;
            }
            //如果arr[right]此时是偶数，说明此时right不是我们要找的下标，right--往前移动
            while (arr[right] % 2 == 0) {//当arr[right]是奇数时，结束while循环
                right--;
            }
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
        //输出结果
        System.out.print("数组调整后：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }

    }
}
