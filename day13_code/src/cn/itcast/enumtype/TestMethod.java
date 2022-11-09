package cn.itcast.enumtype;

import java.util.Scanner;

/*
通过enum关键字声明的枚举类型，默认的父类是java.lang.Enum类，它间接的父类还是Object。
所以enum关键字声明的枚举类型的对象，可以调用Enum类和Object中声明的方法。

Enum类中部分常用方法：
（1）String name()：返回枚举常量对象名称
（2）int ordinal()：返回常量对象的下标
（3）String toString()：Enum父类又重写了Object类的toString，返回的也是常量对象的名称
        当然，子类还可以重写。

编译器会自动添加如下方法：
（1）static 枚举类型[] values()：返回枚举类型的所有常量对象
（2）static 枚举类型 valueOf(String name)


 */
public class TestMethod {
    public static void main(String[] args) {
        Week week = Week.SUNDAY;
        System.out.println(week.name());
        System.out.println(week.ordinal());
        System.out.println(week.toString());
        System.out.println(week);
        System.out.println("--------------------");

        Week[] all = Week.values();
        for (int i = 0; i < all.length; i++) {
            System.out.println(all[i]);
        }

        System.out.println("--------------------");
        Scanner input = new Scanner(System.in);
        System.out.print("请输入枚举常量对象名称: ");
        String name = input.next();//MONDAY
        Week mon = Week.valueOf(name);// 更灵活
        System.out.println(mon);
        input.close();

        Week w1 = Week.MONDAY;
        System.out.println(w1);
    }
}
