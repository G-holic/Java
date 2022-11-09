package cn.itcast.thread_多线程;

/*
一个进程至少要有一个线程，Java程序至少有一个main线程，是主线程。
Java中开启另一个线程的方式，一共有四种：
（1）继承Thread类
（2）实现Runnable接口
（3）实现Callable接口
（4）线程池

但是SE阶段先学2种。

第一种继承Thread类：
步骤：
（1）编写一个类，让他继承Thread类
（2）重写父类的public void run(){}
这个run()方法不是由程序员调用的，而且线程调度时，自动调用。
要让一个线程做什么事，必须把这个代码写到run中。
把run()方法的方法体，称为线程体。
（3）创建自定义线程类的对象
（4）启动线程
调用自定义线程类的对象的start()
 */
public class TestCreateThread {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        //调用自定义线程类的对象的start()
        mt.start(); // 这个start方法是从Thread类继承

//        mt.run();//不是多线程，它是顺序执行（不要手动调用run方法）

        // 匿名类写法
        new Thread(){
            @Override
            public void run() {
                // 让这个线程打印1~10的偶数
                for (int i = 2; i <= 10; i += 2) {
                    System.out.println("自定义线程: " + i);
                }
            }
        }.start();
        // 或者
        Thread t = new Thread(){
            @Override
            public void run() {
                // 让这个线程打印1~10的偶数
                for (int i = 2; i <= 10; i += 2) {
                    System.out.println("自定义线程: " + i);
                }
            }
        };
        t.start();

        //在main线程中，打印[1-10]的奇数
        for (int i = 1; i <= 10; i += 2) {
            System.out.println("main: " + i);
        }
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        // 让这个线程打印1~10的偶数
        for (int i = 2; i <= 10; i += 2) {
            System.out.println("自定义线程: " + i);
        }
    }
}