package cn.itcast.virtual_虚方法;

/*
1、虚方法：凡是可以被子类重写的方法，都叫做虚方法。
子类不能重写的方法就不是虚方法。
不能重写的方法有：private等（后面还会学习static等）

2、虚方法的调用原则
（1）编译时：看父类
在父类中找到能够匹配的方法
（2）运行时：看子类
如果子类重写了这个匹配的虚方法，那么一定执行重写的方法，
如果子类没有重写这个匹配的虚方法，还是执行父类中找到的这个方法。
 */
// 面试题
public class TestVirtualMethod {
    public static void main(String[] args) {
        MyClass my = new MySub();
        Father f = new Father();
        Son s = new Son();
        Daughter d = new Daughter();
        my.method(f); // sub--father

        /*
        my变量的编译时类型是MyClass，编译时看MyClass，
        my变量的运行时类型是MySub，运行时看MySub
        (1)第一步，编译器去MyClass类中找匹配的方法
        public void method(Father f)
        public void method(Son s)

        实参f的编译时类型Father，和它最匹配的是public void method(Father f)，找到了
        （2）第二步，运行时要去MySub找 public void method(Father f)是否进行了“重写”
        public void method(Father d) {//（3）
            System.out.println("sub--father");
        }
        执行重写方法体
         */
        my.method(s); // son
         /*
         my变量的编译时类型是MyClass，编译时看MyClass，
        my变量的运行时类型是MySub，运行时看MySub
        (1)第一步，编译器去MyClass类中找匹配的方法
        public void method(Father f)
        public void method(Son s)

        实参s的编译时类型Son，和它最匹配的是public void method(Son s)，找到了
        （2）第二步，运行时要去MySub找 public void method(Son s)是否进行了“重写”
        没有重写，还是执行刚刚父类中找到的
        public void method(Son s) {//（2）
        System.out.println("son");
        }
         */
        my.method(d); // sub--father
         /*
        my变量的编译时类型是MyClass，编译时看MyClass，
        my变量的运行时类型是MySub，运行时看MySub
        (1)第一步，编译器去MyClass类中找匹配的方法
        public void method(Father f)
        public void method(Son s)

        实参d的编译时类型Daughter，和它最匹配的没有，找可以兼容的，public void method(Father f)方法可以兼容

        （2）第二步，运行时要去MySub找 public void method(Father f)是否进行了“重写”
                public void method(Father d) {//（3）
            System.out.println("sub--father");
        }
        执行重写方法体
         */

    }
}

class MyClass {
    public void method(Father f) {//（1）
        System.out.println("father");
    }

    public void method(Son s) {//（2）
        System.out.println("son");
    }
    //(1)和（2）是重载
}

class MySub extends MyClass {//MySub是MyClass的子类

    public void method(Father d) {//（3）
        System.out.println("sub--father");
    }

    public void method(Daughter d) {//（4）
        System.out.println("daughter");
    }
    //（3）和（4）是重载
    //（3）是重写（1）
    //（4）和它们是重载关系，没有重写关系
}

class Father {//Father父亲

}

class Son extends Father {//Son儿子

}

class Daughter extends Father {//Daughter女儿

}