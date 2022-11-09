package cn.itcast06.homework;

//5、找出出现奇数次的数
/*
*已知某个数组中只有1个数字的次数出现奇数次，请找出这个数字
* 已知某个数组中只有1个数字的次数出现奇数次，请找出这个数字
* int[] arr = {2,6,2,5,7,1,2,5,6,1,5,6,1,6,5};
*
* 开发提示：

因为对于任意一个数k，有k ^ k = 0，k ^ 0 = k，所以将arr中所有元素进行异或，
* 那么个数为偶数的元素异或后都变成了0，只留下了个数为奇数的那个元素。
* */
public class Home_Work_5 {
    public static void main(String[] args) {
        int[] arr = {2, 6, 2, 5, 7, 1, 2, 5, 6, 1, 5, 6, 1, 6, 5};

        int num = arr[0];
        for (int i = 1; i < arr.length; i++) {
            num ^= arr[i];
        }
        System.out.println("出现奇数次的是：" + num);
    }
}
