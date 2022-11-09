package cn.itcast.review;

public class TestOverloadAndOverride {
    public static void main(String[] args) {
        Son s = new Son();
        s.method(1.2);
        s.method(1);
        /*
        发现Son类的对象，可以调用两个method方法，
        那么这两个method方法是什么关系？
        （1）是重写吗？显然不是
        （2）是重载吗？可以说是
            虽然public void method(int a)在父类中声明，
            但是因为子类会继承这个方法，可以看成子类也拥有这个方法。
         */
    }
}

class Father{
    public void method(int a){
        System.out.println("a = "+a);
    }
}
class Son extends Father{
    public void method(double a) {
        System.out.println("a = " + a);
    }
}