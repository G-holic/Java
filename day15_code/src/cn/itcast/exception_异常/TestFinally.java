package cn.itcast.exception_异常;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
很相似的三个单词：final，finalize，finally

1、finally必须配合try结构使用
try{
}finally{
}

try{
}catch(异常类型 e){
}finally{
}

2、finally块表示
（1）无论try{}中代码是否发生异常，都要执行的代码
（2）无论catch()分支是否可以捕获异常，都要执行的代码
（3）无论try和catch分支中是否有return语句，都要执行的代码
（4）唯一finally不会执行情况是：在try{}后catch{}中有一句 System.exit(0); 退出JVM。

通常都是资源释放或关闭代码写到finally中。
 */
public class TestFinally {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try { // try..catch{}可以嵌套

            while (true) {
                try {
                    System.out.print("请输入第一个整数：");
                    int a = input.nextInt();
                    System.out.print("请输入第二个整数：");
                    int b = input.nextInt();
                    int result = a / b;
                    System.out.println(a + "/" + b + "=" + result);
                    //                System.exit(0);
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("数字格式不正确，请输入两个整数");
                } catch (ArithmeticException e) {
                    System.out.println("第二个整数不能为0");
                }
            }
        } finally {
            System.out.println("程序结束，释放资源");
            input.close();
        }
    }
}
