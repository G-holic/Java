package cn.itcast07.exam;

import java.util.Scanner;

/*
2、已知有一个数组
char[] arr = {'a','b','h','m','t','z'};
从键盘输入一个小写字母，查找它是否在arr数组中，
请使用二分查找法。
 */
public class Exam2 {
    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'h', 'm', 't', 'z'}; // 已经有序，不用再排序
        Scanner input = new Scanner(System.in);
        System.out.print("请输入你要查找的字母： ");
        char letter = input.next().charAt(0);

        int index = -1;
        for (int left = 0, right = arr.length - 1; left <= right; ) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == letter) {
                index = mid;
                break;
            } else if (arr[mid] > letter) {
                right = mid - 1;
            } else {
                //去右边
                left = mid + 1;
            }
        }
        if (index == -1) {
            System.out.println("不存在");
        } else {
            System.out.println(letter + "在arr的下标是" + index);
        }

        input.close();

    }
}
