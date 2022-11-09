package cn.itcast.reflect_反射;
/*
哪些代码会直接在类加载的时候，直接完成类的初始化呢？
（1）你这个类是main方法所在的类
（2）第一次用某个类时，就是用它new对象
（3）第一次用某个类时，调用这个类自己声明的静态变量、静态方法
（4）通过反射获取这个类的Class对象，操作其他的代码，也会让这个类直接完成加载，并且初始化
（5）操作某个类的子类，那么会先初始化父类。父类的初始化可能是因为用子类了导致。
 */
public class TestClassInit {
    static {
        System.out.println("静态代码块");
    }
    public static void main(String[] args) throws Exception {
        MyClass obj = new MyClass();
        Demo.method();
        Class c = Class.forName("cn.itcast.reflect_反射.Base");
        Son s = new Son();
    }
}

class MyClass{
    static {
        System.out.println("MyClass类的静态代码块");
    }
}

class Demo{
    static {
        System.out.println("Demo类的静态代码块");
    }
    public static void method(){
        System.out.println("Demo.method方法");
    }
}

class Base{
    static {
        System.out.println("Base类的静态代码块");
    }
}

class Father{
    static {
        System.out.println("Father类的静态代码块");
    }
}

class Son extends Father{

}
