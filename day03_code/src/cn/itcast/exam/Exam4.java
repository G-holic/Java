package cn.itcast.exam;

import java.util.Scanner;

// 4、运行时从键盘输入两个数，程序可以将它们按照从小到大的顺序输出
public class Exam4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入第一个整数：");
        int a = input.nextInt();
        System.out.print("请输入第二个整数：");
        int b = input.nextInt();

//        if (a > b) {
//            System.out.println(b + " " + a);
//        } else {
//            System.out.println(a + " " + b);
//        }
//        if (a > b) {
////            int temp = a;
////            a = b;
////            b = temp;
////        }
////        System.out.println(a + " " + b);5
        int max = a > b ? a : b;
        int min = a < b ? a : b;
        System.out.println(min + " " + max);
    }

}
