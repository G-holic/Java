package com.itcast.homework;

//3、正序和逆序输出26个英文字母
//要求使用char数组存储26个英文字母，并分别用正序和逆序方式显示输出。要求10个一行。
public class HomeWork_3 {
    public static void main(String[] args) {
        char[] letters = new char[26];

        for (char i = 0; i < letters.length; i++) {
            letters[i] = (char) ('a' + i); // 强转
        }

        // 小写字母的正序排序
        System.out.println("小写字母的正序排序：");
        int count = 0;
        for (int i = 0; i < letters.length; i++) {
            count++;
            if (count == 10 || i == letters.length - 1) { //等于第10个字母时或者最后一位字母时
                System.out.println(letters[i]);
                count = 0;// 重新赋值为0
            } else if (count < 9) {
                System.out.print(letters[i] + ",");
            }
        }

        // 小写字母的逆序排序
        System.out.println("小写字母的逆序排序：");
        count = 0;
        for (int i = letters.length - 1; i >= 0; i--) {
            count++;
            if (count == 10 || i == 0) {
                System.out.println(letters[i]);
                count = 0;
            } else if (count < 9) {
                System.out.print(letters[i] + ",");
            }
        }
    }
}
