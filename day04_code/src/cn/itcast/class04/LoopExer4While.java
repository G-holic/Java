package cn.itcast.class04;

import java.util.Scanner;

public class LoopExer4While {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int m, n;
        while (true) {
            System.out.println("请输入一个正整数： ");
            m = input.nextInt();
            if (m <= 0) {
                System.out.println("m的值必须是整数，请重新输入！");
            } else {
                break;
            }
        }
        while (true) {
            System.out.println("请输入一个正整数： ");
            n = input.nextInt();
            if (n <= 0) {
                System.out.println("n的值必须是整数，请重新输入！");
            } else {
                break;
            }
        }

        int max = m > n ? m : n;
        int min = m > n ? n : m;
        while (min >= 1) {
            if (m % min == 0 && n % min == 0) {
                System.out.println(min + "是它的最大公约数");
                break;
            }
            min--;
        }
        while (max <= m * n) {
            if (max % m == 0 && max % n == 0) {
                System.out.println(max + "是它的最小公倍数");
                break;
            }
            max++;
        }
    }
}
