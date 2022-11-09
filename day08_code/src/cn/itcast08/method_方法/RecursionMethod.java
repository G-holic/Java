package cn.itcast08.method_方法;

/*
1、方法的递归调用：
    当方法自己调用自己，就是递归。
2、递归调用要注意一些问题：
（1）必须有出口，不能无限递归
否则会出现 “java.lang.StackOverflowError”栈内存溢出错误。

为什么？
因为方法调用会有“入栈”过程，所谓的入栈是指给这个方法开辟一块独立的内存空间。不断的调用方法，又再它没有结束时，继续调用，
会把栈内存空间耗尽。

（2）最好不要太深，能够转换为使用循环实现的，就不用递归

3、如何避免死递归（无限递归）？
加条件递归

4、演示正确的递归调用
案例：求 n!
 n! = (n-1)! * n
 (n-1)! = (n-2)! * (n-1)
 ...

 n=1时， 1! = 1

 假设有一个方法 int jieCheng(int n){
        if(n==1){
            return 1;
        }
        return n * （n-1)的阶乘
 }

 */
public class RecursionMethod {
    public static void main(String[] args) {
        RecursionMethod t = new RecursionMethod();
//        t.a();
//        t.b();

        System.out.println(t.jieCheng(5));
        System.out.println(t.cheng(5));
    }

    int jieCheng(int n) {
        if (n == 1) {
            return 1;
        }
        return n * jieCheng(n - 1);
    }

    int cheng(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
            
        }
        return result;
    }

    void a() {
        a();//直接调用自己
    }

    void b() {
        c();
    }//间接调用就自己

    void c() {
        d();
    }

    void d() {
        b();
    }
}
