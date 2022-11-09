package cn.itcast.exception_异常;

import java.util.Scanner;

/*
1、什么是异常？
程序在正常情况下是可以运行的，只是在遇到一些特殊情况时，导致程序中断/崩溃。
特殊情况：
    用户的非法输入，用户的磁盘空间已满、要读取的文件不存在、网络中断。

不是：
（1）语法错误
（2）逻辑错误

2、如何对待异常？
（1）尽量核实代码，保证数组下标、空指针、类型转换不出现异常，加判断处理。避免异常。
（2）加异常处理代码。例如：try...catch处理
 */
public class TestException {
    public static void main(String[] args) {
        //   System.out.println("a = " + a);//不是异常，这是语法错误，编译错误，根本无法运行
//           System.out.println(add(1, 2));//不是异常，这是逻辑错误，永远也得不到正确的结果

        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("请输入一个整数: "); // 输入的不是整数会报异常
                int num = scanner.nextInt();
                System.out.println("num = " + num);
                break;
            } catch (Exception e) {
                scanner.nextLine();
                System.out.println("要输入的是一个整数，请重新输入");
            }
        }
        scanner.close();

        int[] arr = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    public static int add(int a, int b) { // 求整数和
        return a - b;
    }
}
