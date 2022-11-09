package cn.itcast08.homework.recursion;

import java.beans.beancontext.BeanContext;

public class RabbitDemo {
    public static void main(String[] args) {
        RabbitDemo rabbitDemo = new RabbitDemo();
        System.out.println(rabbitDemo.f(24));
        System.out.println(rabbitDemo.fValue(24));
    }

    // 递归
    long f(int n) {
        if (n < 1) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        return f(n - 2) + f(n - 1);
    }

    // 不递归
    long fValue(int n) {
        if (n < 1) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        int beforeBefore = 1;
        int before = 1;
        int current = before + beforeBefore;
        for (int i = 4; i <= n; i++) {
            beforeBefore = before;
            before = current;
            current = before + beforeBefore;
        }
        return current;
    }
}
