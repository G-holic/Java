package com.itcast.class05;
/*
 1、什么是数组？
    数组代表一组数。
    数组（array）是一组相同数据类型的元素（数据）按照一定的顺序排列的集合。数组是一个容器。
    目的是使用一个统一的名称，来管理一组数据。每一个元素通过编号（又称为索引，下标，index）来进行区分。
    下标从[0]开始。一组数据的总个数称为数组的长度(length)。一组数中的每一个数据称为元素（element）。

    如果不用数组，当要表示一组相同类型的数据时，用多个不同名字的变量来表示，后期计算（管理）非常麻烦。

2、数组的好处
    可以方便的管理一组相同类型的数据。
 */
public class Test01Array {
    public static void main(String[] args) {
        //从键盘输入1个小组的所有学员的成绩并保存，然后输出它们，求它们的最高分，最低分，平均分，排序等
        int s1 = 89;
        int s2 = 96;
        int s3 = 100;
        int s4 = 75;
        int s5 = 88;
        int s6 = 99;
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);

        int[] arr = {89,96,100,75,88,99};//一组数据
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
