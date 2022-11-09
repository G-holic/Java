package cn.itcast.class04;

import java.util.Scanner;

/*
案例：随机生成一个100以内的数，猜这个随机数是多少？
从键盘输入数，如果大了提示，大了，如果小了，提示小了，如果对了，就不再猜了
提示：随机数  Math.random()
double num = Math.random();// [0,1)的小数

1、语法结构
do{
    循环体语句块
}while(循环条件表达式);

2、注意细节
（1）do..while结构的while()外面有一个分号
（2）do...while结构，和for、while的不同点：这个结构的循环体语句至少执行一次。

 */
public class Test08DoWhile {
    public static void main(String[] args) {
        //随机生成一个100以内的数
        /*
        Math.random() * 100：[0,100)范围的小数
        (int)(Math.random() * 100)
         */
        int ranNum = (int) (Math.random() * 100);
//        System.out.println(ranNum);

        Scanner input = new Scanner(System.in);

        int inputNum;
        do {
            System.out.println("请输入[0,100)范围的整数: ");
            inputNum = input.nextInt();
            if (inputNum > ranNum) {
                System.out.println("大了！");
            } else if (inputNum < ranNum) {
                System.out.println("小了！");
            } else {
                System.out.println("猜对了！");
            }
        } while (inputNum != ranNum);

        input.close();
    }
}
