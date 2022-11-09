package cn.itcast09.encapsulability_封装;

/*
第六章  面向对象的中级

6.1 封装性
1、面向对象这个编程思想，有三个基本特征：
（1）封装
（2）继承
（3）多态

2、什么是封装性？

生活中，快递包裹，通常需要用袋子或箱子装起来，
目的：（1）包含的内部商品，不会被损坏（2）可以包含隐私（3）运输更方便

写代码，也考虑这些因素：
（1）隐私->安全，当某个类的代码，内部某些成员不希望外部知晓，或者随意的更改，那么就可以进行适当的封装
（2）外部使用更方便
    生活中，洗衣机，只会留出几个简单的按钮和进水口、出水口、放衣服的入口这几个，它隐藏了内部复杂的结构。
    代码中，String类，它内部的结构和实现是很复杂的，但是我们就算不是特别清楚每一个内部实现，也不影响我们简单的使用。

把代码（成员等）控制在它的合理的可见性范围内，就是封装。

3、如何实现封装？
必须依赖于权限修饰符，或者又称为访问控制修饰符。

4、权限修饰符有哪些？
public、protected、private三个单词。
可见性范围分为四种情况：
            本类      本包的其他类      其他包的子类中     其他包的非子类
private      √          ×               ×               ×
缺省          √          √              ×               ×
protected    √           √              √              ×
public       √           √              √               √

5、权限修饰符的使用要注意
（1）如果权限修饰符是在class前面（这里暂不讨论内部类），只能是public或缺省
（2）如果权限修饰符是在类的成员前面（成员变量，成员方法等），四种都可以
 */
public class TestEncapsulation {
    //TestEncapsulation和Father类是本包，同一个包的
    //TestEncapsulation不是Father的子类

    public static void main(String[] args) {
        Father f = new Father();
//        System.out.println(f.a);//不行，因为a是private，只能本类
        System.out.println(f.b);//可以，因为b的权限修饰符是缺省，本包可以
        System.out.println(f.c);//可以，因为c的权限修饰符是protected，本包可以
        System.out.println(f.d);//可以
    }

}
