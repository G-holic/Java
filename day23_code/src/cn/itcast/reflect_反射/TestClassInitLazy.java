package cn.itcast.reflect_反射;
/*
哪些代码会让类初始化延迟进行？
（1）如果通过一个子类使用从父类继承的静态变量，静态方法时。延迟子类的初始化。
（2）如果使用某个类声明数组，使用数组，不会导致这个类初始化
（3）如果使用某个类的静态的常量，也不会导致这个类初始化
 */
public class TestClassInitLazy {
    public static void main(String[] args) {
        System.out.println(Zi.a);// Fu类的静态代码块   1
        Zi[] arr = new Zi[5];
        System.out.println(arr.length);// 5

        System.out.println(Zi.MAX);// 100
    }
}
class Fu{
    static int a = 1;
    static {
        System.out.println("Fu类的静态代码块");
    }
}
class Zi extends Fu{
    public static final int MAX = 100;
    static {
        System.out.println("Zi类的静态代码块");
    }
}