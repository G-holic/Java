package cn.itcast.exer.exer8_难度高;

/*
考点：
1、继承一个类，关键字extends
2、非静态内部类的全名称：包.外部类名.非静态内部类名
这里是同一个包下，不用加包名
3、继承抽象类，必须重写抽象方法
4、子类继承父类时，一定要在子类构造器的首行调用父类的构造器，
默认调用父类的无参构造
5、非静态内部类的对象创建，或者说构造器的调用依赖于外部类的对象
6、外部类的对象
（1）传参
（2）可以用成员变量
7、类初始化与实例初始化的顺序问题
 */
public class TestInner{
    public static void main(String[] args){
/*        Outer.Inner in = new Sub(new Outer());
        in.method();//输出 hello inner*/

        Outer.Inner in = new Sub();
        in.method();//输出 hello inner
    }
}

class Outer {
    abstract class Inner{
        abstract void method();
    }
}
class Sub extends Outer.Inner{
/*    Sub(Outer out){
        out.super();
    }*/
    static Outer out = new Outer();

    Sub(){
        out.super();
    }

    @Override
    void method() {
        System.out.println("hello inner");
    }
}