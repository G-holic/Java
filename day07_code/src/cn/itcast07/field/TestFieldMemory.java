package cn.itcast07.field;

/*
分析：对象的成员变量（这里主要指实例变量）的内存

JVM的运行的内存：
（1）方法区：存储被加载的类的模板信息、常量等
（2）堆：存储new出来的对象信息
（3）JAVA虚拟机栈：存储Java的方法局部变量等
（4）本地方法栈：存储C/C++等方法的局部变量
（5）程序计数器：存储每一个线程的下一条指令等

new在堆中申请内存空间，存储这个对象的相关信息。
每一个对象需要存储三个部分的内容：
（1）对象头
（2）对象的实例变量值
（3）对齐的空白（这个有的对象可能没有）

 */
public class TestFieldMemory {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.length = 2;
        r1.width = 1;

        Rectangle r2 = new Rectangle();
        r2.length = 5;
        r2.width = 3;
    }
}
