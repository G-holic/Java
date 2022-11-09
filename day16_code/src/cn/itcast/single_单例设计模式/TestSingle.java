package cn.itcast.single_单例设计模式;

import org.junit.Test;


/*
1、什么是单例设计模式?

设计模式：是前面的很多程序员根据自己的经验，总结出来的代码的套路，代码的模板。
常见的经典的设计模式一共有23种。设计模式不分语言。

单例设计模式是指某个类的对象在整个应用程序中只有唯一的一个。
例如：手机系统中  时钟
     Java的JVM运行环境。
     后期的Spring框架中容器管理对象....

2、如何实现单例？

（1）构造器私有化
（2）在类的内部创建好这个类的唯一对象

3、单例设计模式的形式
（1）饿汉式
饿：很着急，无论你是否要用到这个类的对象，在类初始化的时候，就直接创建了它对象。
（2）懒汉式
懒：不着急，等你需要这个对象的时候，再创建这个对象。

面试题：请写出单例设计模式的示例代码。
面试题：请写出懒汉式单例设计模式的示例代码。
面试题：请写出饿汉式单例设计模式的示例代码。
 */
public class TestSingle {
    public static void main(String[] args) {
        Runtime runtime1 = Runtime.getRuntime();// 得到当前JVM的运行环境
        Runtime runtime2 = Runtime.getRuntime();// 得到当前JVM的运行环境
        System.out.println(runtime1 == runtime2); // true,地址相同，它们是同一个
    }

    @Test
    public void test01() {
        One o1 = One.INSTANCE;
        One o2 = One.INSTANCE;
        System.out.println(o1 == o2); // true,地址相同，它们是同一个对象
    }

    @Test
    public void test02() {
        Two o1 = Two.INSTANCE;
        Two o2 = Two.INSTANCE;
        System.out.println(o1 == o2); // true,地址相同，它们是同一个对象
    }

    @Test
    public void test03() {
        Three o1 = Three.getInstance();
        Three o2 = Three.getInstance();
        System.out.println(o1 == o2); // true,地址相同，它们是同一个对象
    }

    @Test
    public void test04() {
        Four o1 = Four.getInstance();
        Four o2 = Four.getInstance();
        System.out.println(o1 == o2);//true
    }

    // 线程问题
    Four o1;// 匿名内部类访问成员变量
    Four o2;

    @Test
    public void test05() {

        Thread t1 = new Thread() {
            public void run() {
                o1 = Four.getInstance();
            }
        };
        t1.start();
        Thread t2 = new Thread() {
            public void run() {
                o2 = Four.getInstance();
            }
        };
        t2.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("o1 = " + o1);
        System.out.println("o2 = " + o2);

        System.out.println(o1 == o2); //false （加塞之后，此时为true,有时也为false，只有    public synchronized static Four getInstance() 加锁之后，才解决  问题）
    }

    @Test
    public void test06(){
        Five o1 = Five.getInstance();
        Five o2 = Five.getInstance();
        System.out.println(o1 == o2);// true
    }
}


// 以下三种都是饿汉式
class One {
    //    饿：很着急，无论你是否要用到这个类的对象，在类初始化的时候，就直接创建了它对象。
    public static final One INSTANCE = new One();

    private One() {

    }
}

// 枚举写法
enum Two {
    INSTANCE
}

class Three {
    private static Three instance = new Three();

    private Three() {

    }

    public static Three getInstance() {
        return instance;
    }
}

// 懒汉式（以下都是）
class Four {
    private static Four instance;// 不着急创建对象

    private Four() {
    }

    public synchronized static Four getInstance() { // 加锁保证同一时刻只有一个线程运行
        if (instance == null) {
            instance = new Four();
        }
        return instance;
    }
}

class Five {
    private Five() {

    }

    private static class Inner { // 内部类
        /*static {
            System.out.println("内部类的静态代码块");
        }*/

        static Five instance = new Five();
    }

    public static Five getInstance() {
        return Inner.instance;
    }

    /*static {
        System.out.println("外部类的静态代码块");
    }

    public static void method(){
        System.out.println("外部类的method方法");
    }*/
}

