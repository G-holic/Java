package cn.itcast.class04;

import java.util.Scanner;

/*
ATM
5、声明变量balance并初始化为0，用以表示银行账户的余额，下面通过ATM机程序实现存款，取款等功能。
---------ATM-------
	1、存款
	2、取款
	3、显示余额
	4、退出
请选择：1
请输入存款的金额：100
//实现余额增加
 */
public class LoopExer5 {
    public static void main(String[] args) {
        double balance = 0; // 用以表示银行账户的余额

        Scanner input = new Scanner(System.in);

        int select;
        do {

            System.out.println("-------ATM--------");
            System.out.println("1、存款");
            System.out.println("2、取款");
            System.out.println("3、显示余额");
            System.out.println("4、退出");
            System.out.print("请选择： ");
            select = input.nextInt();

            switch (select) {
                case 1:
                    System.out.print("请输入存款金额： ");
                    double money = input.nextInt();
                    balance += money;
                    break; //这里结束的是switch，不会结束do...while
                case 2:
                    System.out.print("请输入取款金额： ");
                    money = input.nextInt(); // 直接赋值
                    balance -= money;
                    break;
                case 3:
                    System.out.println("现在的余额是： " + balance);
                    break;
                case 4:
                    System.out.println("欢迎下次使用");
                    break;
                default:
                    System.out.println("请输入正确的选项！");
            }
        } while (select != 4);

        input.close();
    }
}
