package com.itcast.exam;

//1、循环输出26个小写英文字母
public class Exam1 {
    public static void main(String[] args) {
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.print(c + " ");
        }
        System.out.println();
        System.out.println("--------------------");
        for (int i = 0; i < 26; i++) {
            System.out.print((char) ('a' + i) + " ");
        }
    }
}
