package cn.itcast.class04;

import java.util.Scanner;

public class Test07Break2 {
    public static void main(String[] args) {
        //从键盘输入一个整数，判断它是否是素数
        /*
        素数：又称为质数，这个数只有1和它本身两个约数，只能被1和它本身整数，例如：11,7等
         */
        Scanner input = new Scanner(System.in);

        System.out.print("请输入正整数：");
        int num = input.nextInt();//11

        //如果num被[2,num-1]之间任意一个数整除了，那么num就不是素数
        for(int i=2; i<=num-1; i++){
            if(num%i==0){//说明num被i给整除了
                System.out.println(num + "不是素数");
                break;//提前中断，结束当前for循环
            }else{
                System.out.println(num + "是素数");//错误，素数的结论不能在这里下
            }
        }

        //只有把[2,num-1]所有数都检查过，都没有满足if(num%i==0)条件，才能确定它是素数

        input.close();
    }
}
