package com.itcast.class05;

//输出1-100之间所有的素数
//素数：比1大的自然数，只有1和它本身两个约数。
//这里i从2开始
public class TestContinue {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            if (i % 2 == 0) {
                continue;
            }

            //判断i是否可以被其他[2, i-1]范围的数字整除
            boolean flag = true; //假设i是素数
            for (int j = 2; j < i; j++) { //在数学知识中， j<=Math.sqrt(i)
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.print(i+" ");
            }
        }
    }
}
