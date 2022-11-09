package cn.itcast06.homework;

import java.util.Scanner;

// 2、判断单词是否是回文单词
/*
*从键盘输入一个单词，判断它是否是回文单词。

开发提示：

- 从键盘输入一个单词，存放到一个String类型的变量word中

- 通过word.toCharArray()可以根据字符串word得到一个char[]类型的数组。

  其中toCharArray()是String类型提供的系统函数，就像Math.random()等函数一样，后面会学到，这里先提前用一下。
* 它的作用就是创建一个char[]数组，并把字符串中的每一个字符依次存储到这个char[]数组中。
*
Scanner input = new Scanner(System.in);
System.out.print("请输入一个英语单词：");
String word = input.next(); //假如输入的英语单词是mom
char[] wordCharArray = word.toCharArray(); // wordCharArray字符数组内容是{'m','o','m'}
*
* 判断数组元素是否首尾对应相等，如果是，那么你输入的单词就是回文单词，否则就不是。
*
*
* */
public class Home_Work_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入一个英语单词： ");
        String word = input.next();
        input.close();
        char[] wordCharArray = word.toCharArray();

//        for (int i = 0; i <wordCharArray.length ; i++) {
//        }
//        if (wordCharArray[0]==wordCharArray[wordCharArray.length-1]){
//            System.out.println("该单词是回文单词");
//        }else {
//            System.out.println("该单词不是回文单词");
//        }

        //(1)先假设它是对称的
        boolean flag = true;
        //(2)遍历，查看数组的元素是否首尾对称
        //left表示左边的下标
        //right表示右边的下标
        for (int left = 0, right = wordCharArray.length - 1; left < right; left++, right--) {
            if (wordCharArray[left] != wordCharArray[right]) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println(word + "是回文单词");
        } else {
            System.out.println(word + "不是回文单词");
        }
    }
}
