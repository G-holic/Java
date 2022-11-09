package com.itcast.homework;

// 模拟大乐透
/*
*大乐透（前区“35选5”＋后区“12选2”），即前区在1-35之间的号码中随机选取5个，
* 后区在1-12之间的号码中随机选取2个，组成一期的中奖号码，请用程序模拟产生一组大乐透中奖号码。

开发提示：

- 声明一个int类型的数组front，长度为35，默认值都是0；
- 声明一个int类型的数组after，长度为12，默认值都是0；
- 随机产生[0,35）之间的整数。如果随机产生的是0，那么就把front[0]修改为1，
* 如果随机产生的是5，那么就把front[5]修改为1，如果随机产生的是10，就把front[10]修改为1。
* 但是如果本次随机产生的是5，而front[5]已经是1了，那么需要重新随机产生一个整数。
* 用这种方式把front数组的5个元素修改为1。
- 随机产生[0,12）之间的整数。使用同样的方式，把after数组的2个元素修改为1。
- 遍历front和after数组，输出大乐透中奖号码，判断front和after数组元素是否为1，如果为1，就显示它的下标+1值。
*
* */
public class PromoteWork_2 {
    public static void main(String[] args) {
        int[] front = new int[35];
        int[] after = new int[12];
        for (int i = 1; i <= 5; i++) {
            /*
            Math.random()：[0,1)的小数
            Math.random() * front.length：[0,front.length)的小数
             (int)(Math.random() * front.length)：[0,front.length)的整数，[0,front.length-1]
             */
            int index;
            do {
                index = (int) (Math.random() * front.length);
            } while (front[index] == 1);
            front[index] = 1;
        }

        for (int i = 1; i <= 2; i++) {
            int index;
            do {
                index = (int) (Math.random() * after.length);
            } while (after[index] == 1);
            after[index] = 1;
        }

        System.out.println("本期大乐透中奖号码：");
        System.out.print("前区号码为：");
        for (int i = 0; i < front.length; i++) {
            if (front[i] == 1) {
                System.out.print(i + 1 + "\t");
            }
        }
        System.out.print("前区号码为：");
        for (int i = 0; i < after.length; i++) {
            if (after[i] == 1) {
                System.out.print(i + 1 + "\t");
            }
        }
        System.out.println();

    }
}
