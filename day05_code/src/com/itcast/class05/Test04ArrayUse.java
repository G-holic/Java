package com.itcast.class05;
/*
6、一维数组的使用
（1）如何获取数组的长度？  数组名.length
（2）如何访问数组的元素？ 数组名[下标]
下标从0开始。
下标的范围：[0, 数组名.length-1]
如果超过这个范围，会报ArrayIndexOutOfBoundsException数组下标越界
（3）数组元素的遍历，通常使用for循环

回忆：
Java的数据类型：
（1）基本数据类型：8种
（2）引用数据类型：数组、类、接口、枚举、注解

回忆：标点符号
（1）.：成员访问符
    数组名.length
（2）[]：数组的特殊标记
 */
public class Test04ArrayUse {
    public static void main(String[] args) {
        int[] scores = {89,96,100,75,88,99};

        System.out.println("该小组的学员成绩如下： ");
        // 快捷键：itar ，遍历数组
        for (int i = 0; i < scores.length; i++) { //i在这里是下标
            System.out.println("第"+(i+1)+"各学院的成绩： "+scores[i]);
        }
//        System.out.println("第6个学院的成绩： "+scores[6]);
//        java.lang.ArrayIndexOutOfBoundsException: 6 数组下标越界
    }
}
