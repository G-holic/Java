package cn.itcast07.method;
/*
方法不调用不执行，调用一次执行一次，
每次调用都会在“栈”（包括Java虚拟机栈和本地方法栈，如果调用的是Java的方法，那么在Java虚拟机栈，如果调用的是C的代码，那么在本地方法栈）
开辟一块独立的内存空间，用来存储当前方法的局部变量等等信息，这个过程称为“入栈”。

等方法运行结束之后，会自动释放“栈”中的内存空间，这个过程称为“出栈”。

栈结构有一个特点：先进后出。
 */
public class MethodInvokeMemory {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();
        r1.length = 5;
        r1.width = 2;
        r1.print('#');
        System.out.println("r1对象：" + r1.getInfo());
        System.out.println("r2对象：" + r2.getInfo());
        r1.print('@');
    }
}
