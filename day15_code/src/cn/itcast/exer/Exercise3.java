package cn.itcast.exer;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
从键盘输入两个整数，求它们的商。尽量考虑和避免异常，无法避免的使用try...catch处理。
（1）如果用户输入的非整数，使用try...catch处理，并且让用户重新输入
（2）如果用户输入的除数为0，请用户重新输入。
 */
public class Exercise3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a;
        while (true) {
            try {
                System.out.print("请输入一个整数（被除数是一个整数）: ");
                a = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                e.printStackTrace();//给程序员看
                scanner.nextLine();
                System.out.println("您输入的是非整数，请输入一个整数");//给用户看
            }
        }

        int b;
        while (true) {
            try {
                System.out.print("请输入一个整数（除数也是一个整数））: ");
                b = scanner.nextInt();
                /*if (b == 0){
                    System.out.println("除数不可以为0");
                }else {
                    break;
                }*/
                if (b == 0) {
                    throw new Exception("除数不可以为0");
                }
                break;
            } catch (Exception e) {
                e.printStackTrace();
                scanner.nextLine();
                System.out.println("您输入的是非整数，请输入一个整数");
            }
        }
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println(a + "/" + b + "=" + a / b);

    }
}
