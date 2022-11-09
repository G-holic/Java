package cn.itcast.homework;

import java.util.Scanner;

/*
从键盘输入订单总价格totalPrice（总价格必须>=0），根据优惠政策计算打折后的总价格。

编写步骤：

1. 判断当`totalPrice >=500` ,discount赋值为0.8
2. 判断当`totalPrice >=400` 且`<500`时,discount赋值为0.85
3. 判断当`totalPrice >=300` 且`<400`时,discount赋值为0.9
4. 判断当`totalPrice >=200` 且`<300`时,discount赋值为0.95
5. 判断当`totalPrice >=0` 且`<200`时,不打折，即discount赋值为1
6. 判断当`totalPrice<0`时，显示输入有误
7. 输出结果
*/
public class HomeWork_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("请输入订单的总价格： ");
        double totalPrice = input.nextDouble();

        input.close();
        if (totalPrice > 0) {
            double discount = 1;
            if (totalPrice >= 500) {
                discount = 0.8;
            } else if (totalPrice >= 400) {
                discount = 0.85;
            } else if (totalPrice >= 300) {
                discount = 0.9;
            } else if (totalPrice >= 200) {
                discount = 0.95;
            } else if (totalPrice >= 0) {
                discount = 1;
            } else {
                System.out.println("输入有误！");
            }
            System.out.println("优惠前的价格： " + totalPrice);
            System.out.println("享受的折扣： " + discount);
            System.out.println("优惠后的价格： " + totalPrice * discount);
        }
    }
}
