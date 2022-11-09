package com.itcast.class05;
/*
Debug的步骤：
1、打断点，在代码的左边（行号）的位置单击出现小红圈，就是断点。
断点：程序运行到这个位置会停下来，可以查看当前变量的值

2、以Debug模式运行

3、单步调试
Step Over（F8)：执行一行语句
Step Into（F7）：进入调用的方法源码
Force Step Into(Alt + Shift + F7）：进入调用的系统方法的源码
Step Out（Shift + F8）:退出当前方法跟踪
 */

public class Test07Debug {
    public static void main(String[] args) {
        String[] names = {"张三", "李四", "王五"};
        int[] scores = {89, 65, 100};

        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 2 * i + 1;
        }
        System.out.println("hello");
        System.out.println(1);
        System.out.println(1);
        System.out.println(Math.sqrt(9));
    }
}
