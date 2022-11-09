package cn.itcast.inner;

/*
3、匿名内部类的使用
（1）匿名内部类的匿名对象.方法
（2）通过父类或父接口的变量 接收 匿名子类/匿名实现类的对象，然后多态调用
（3）把匿名内部类的匿名对象直接作为另一个方法调用的实参
 */
public class AnonymousInnerUse {
    public static void main(String[] args) {
        // 方式一
        new Object() {
            void method() {
                System.out.println("匿名内部类自定义方法method");
            }

        }.method(); // 匿名内部类自定义方法method

        // 通常使用(可以调用多个方法)
        Base b = new Base() {

            @Override
            public void method() {
                System.out.println("匿名内部类重写父类的抽象方法method");
            }

            @Override
            public void fun() {
                System.out.println("匿名内部类重写父类的抽象方法fun");
            }
        };
        b.method();
        b.fun();

        MyInter my = new MyInter() {

            @Override
            public void method() {
                System.out.println("匿名内部类重写接口的抽象方法method");
            }

            @Override
            public void fun() {
                System.out.println("匿名内部类重写接口的抽象方法fun");
            }
        };
        my.method();
        my.fun();


        // 方式三：
        test(new Base() {
            @Override
            public void method() {
                System.out.println("另一个Base类的匿名子类重写method");
            }

            @Override
            public void fun() {
                System.out.println("另一个Base类的匿名子类重写fun");
            }
        });
    }

    public static void test(Base b) {
        b.method();
    }


}

abstract class Base {
    public abstract void method();

    public abstract void fun();
}

interface MyInter {
    public abstract void method();

    public abstract void fun();
}