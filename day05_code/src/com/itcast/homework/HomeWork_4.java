package com.itcast.homework;

/*
 4、随机生成一组验证码


随机生成一组验证码，验证码由大小写字母和10个阿拉伯数字字符中的任意6位组成。

开发提示：

1、声明一个char[]数组，并存储26个大小写字母和10个阿拉伯数字字符

2、随机生成6位下标，取出里面的字符组成验证码

*/
public class HomeWork_4 {
    public static void main(String[] args) {
        char[] letters = new char[26 * 2 + 10];

        for (int i = 0; i < 26; i++) {
            letters[i] = (char) ('a' + i);
            letters[26 + i] = (char) ('A' + i);
        }
        for (int i = 0; i < 10; i++) {
            letters[52 + i] = (char) ('0' + i);
        }

        String code = ""; // 定义空字符串方便存储验证码
        for (int i = 0; i < 6; i++) {
            /*
            Math.random()：[0,1)的小数
            Math.random()*letters.length：[0,letters.length)的小数
            (int)(Math.random()*letters.length)：[0,letters.length)的整数，
            								即[0, letters.length-1]
            */
            int index = (int) (Math.random() * letters.length);
            code += letters[index];
        }
        System.out.println("随机验证码是： " + code);
    }
}
