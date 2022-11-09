package com.itcast.homework;

// 3、统计字符出现次数
/*
* 英语中最长的单词是"pneumonoultramicroscopicsilicovolcanoconiosis"，
* 意思是“肺尘病，矽肺病”，一共有45个英文字母。现在要求统计这个单词中出现了哪些字母，
* 以及它们出现的次数，并且找出出现次数最多的字母。

开发提示：

（1）使用String类型的变量word存储英语单词"pneumonoultramicroscopicsilicovolcanoconiosis"

（2）通过word.toCharArray()可以根据字符串word得到一个char[]类型的数组。

其中toCharArray()是String类型提供的系统函数，就像Math.random()等函数一样，后面会学到，这里先提前用一下。
* 它的作用就是创建一个char[]数组，并把字符串中的每一个字符依次存储到这个char[]数组中。
*
* //以"hello"为例
String word = "hello";
char[] wordCharArray = word.toCharArray();
//此时wordCharArray字符数组内容是 {‘h','e','l','l','o'}
*
* （3）声明一个int类型的数组counts，长度为26，分别用来记录26个字母出现的次数，
* counts[0]记录的是'a'字母的次数，counts[1]记录的是'b'字母的次数，依次类推。
* */
public class PromoteWork_3 {
    public static void main(String[] args) {
        String word = "pneumonoultramicroscopicsilicovolcanoconiosis";
        char[] wordCharArray = word.toCharArray();

        int[] counts = new int[26];
        for (int i = 0; i < wordCharArray.length; i++) {
//            System.out.print(wordCharArray[i]+" ");
            counts[wordCharArray[i] - 97]++; // 没出现的用一次表示，重复出现了次数就+1，97 开始对应'a'
//            System.out.println(counts[wordCharArray[i] - 97]);
        }
        int max = counts[0]; // 假设第一个的次数为最大值
//        System.out.println("max" + max);
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > max) { // 判断
                max = counts[i]; // 交换
            }
        }
        System.out.println("单词中出现了如下字母：");
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] != 0) { // 判断显示次数出现不为0的，不要
                System.out.println((char) (i + 97) + " " + counts[i]);
            }
        }
        System.out.print("出现次数最多的字母是：");
        for (int i = 0; i < counts.length; i++) {
            if (max == counts[i]) { // 次数最多
                System.out.print((char) (i + 97) + "\t");
            }
        }
        System.out.println();
    }
}
