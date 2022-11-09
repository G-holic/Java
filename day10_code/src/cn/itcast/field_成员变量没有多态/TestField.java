package cn.itcast.field_成员变量没有多态;
/*
成员变量：没有多态的概念，变量的寻找只看编译时类型，没有编译时类型和运行时类型不一致这个说法。
成员方法：有多态的概念，编译时看父类，运行时看子类。如果子类重写了，一定是执行子类重写的方法体。
 */
public class TestField {
    public static void main(String[] args) {
        Son s = new Son();
        System.out.println(s.a);
        System.out.println(((Father) s).a);//把s向上转型为Father类型，让编译器从Father中取a

        System.out.println("-----------------");
        Father f = new Son();
        System.out.println(f.a);// 1 此时f变量的编译时类型是Father，让编译器从Father中取a
        System.out.println(((Son) f).a);

        System.out.println("------------------");
        Son son = new Son();
        son.method();//Son.method
        ((Father)son).method();//Son.method 方法重写了，只要对象的运行时类型数Son，那么一定执行重写的方法，这是多态

    }
}

class Father {
    int a = 1;

    public void method() {
        System.out.println("Father.method");
    }
}

class Son extends Father {
    int a = 2;// 这个a和上面的a是什么关系？ 不会覆盖上面的a的，而是Son的对象中有两个a

    @Override
    public void method() {
        System.out.println("Son.method");
    }
}
