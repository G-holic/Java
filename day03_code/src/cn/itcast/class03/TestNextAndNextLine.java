package cn.itcast.class03;

import java.util.Scanner;

/*
键盘输入：
    next()与nextLine()的区别？

    next()方法在读取用户输入的数据时，遇到空格或者其他的空白时，就会认为本次输入结束，后面的数据就不接收了。
    nextLine()方法在读取用户输入的数据时，遇到回车换行符号才会认为输入结束
            只要遇到回车换行符，就认为输入结束。

结论：
（1）如果字符串中不需要包含空格，那么请用next()更简单
（2）如果字符串中需要包含空格，那么在nextLine()前面如果有其他的非nextLine()的输入语句，请在前面加一句 xx.nextLine()解决
 */
public class TestNextAndNextLine {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.print("请输入年龄：");
        int age = input.nextInt();
        System.out.println("age = " + age);
        /*
        nextInt()不会读取回车换行符，只会读取数字，例如23，后面的回车换行符还在通道中
        如果紧接着下面是nextLine()方法，那么会读取到这个 回车换行符，就结束了

         int age = input.nextInt();
         String name = input.nextLine();

        请输入年龄：23
        age = 23
        请输入姓名：name =
         */

        input.nextLine();//把23后面的回车换行符读取掉

        System.out.println("请输入姓名：");
        //        String name = input.next();
        String name = input.nextLine();
        System.out.println("name = " + name);
        /*
        next()：
        张三：正常接收“张三”
        张  三：只能接收“张”

        nextLine()：
        张三：正常接收“张三”
        张  三：正常接收“张 三”
         */
        input.close();
    }
}
