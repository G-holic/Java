package cn.itcast.interfacetype_接口;

public interface Flyable {
    //    public static final int MAX_SPEED = 386 * 10000;
    int MAX_SPEED = 386 * 10000; // public static final 省略也一样

    //    public abstract void fly();
    void fly();//public abstract

    static void method(){// public 可以省略
        System.out.println("Flyable.method");
    }
    default void test(){
        System.out.println("Flyable.test default");
    }

    public static void method1(){
//        common();
        //....
    }
    public static void method2(){
//        common();
        //....
    }

/*    private static void common(){ // jdk1.8以后才有
        System.out.println("hello");
        System.out.println("world");
        System.out.println("java");
    }*/
}
