package cn.itcast.generic_泛型;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

/*
第12章 泛型
说明：泛型本身并不一定非要在集合中使用，很多非集合的场景也是要使用泛型的。
     因为我们目前SE阶段的API，大量的泛型的使用都在集合API中，所以这个章节的案例以集合演示比较多。

一、泛型的引入
1、什么是泛型？
泛型，有点像瓶子上的“标签”，可以在使用之前，表名某个xx的类型是啥，用的时候既方便又安全。
对于Java程序中：
(1)可以把类型检查提到“编译时”
(2)使用时，类型是安全的，不需要再强制类型转换。


泛型如何设计的？或者说，如何传递类型的？
用之前的知识来辅助理解它。
    之前学习方法的时候，我们有形参和实参的概念。
    为什么方法有形参？因为方法体的功能实现，需要外界（使用者）给它提供数据，这个数据在编写方法体时，数据值是不确定的，
    需要在调用方法时，才能确定。
    例如：编写一个方法，可以求两个整数的和。
    public static int add(int a, int b){
        return a + b;
    }

    现在在设计某个类时，出现了某个成员的类型未知，需要在使用这个类的时候才能确定，就可以把这个类型作为参数传递。
    写在类名后面。
    public class ArrayList<E>{ //E就是代表未知的类型，又称为类型形参
        public void add(E e){ //添加一个元素到当前集合中
          //...
        }
    }

    ArrayList<String> list = new ArrayList<String>();
    <E>就是对应<String>

    总结：泛型就是参数化的类型。即泛型就是传递类型用的一种语法。
    格式：<类型>

2、相关名词
ArrayList<E>，其中的E是类型变量，因为E是一种未知的类型，可能代表String，可能代表Integer等，可以变，所以称为类型变量。
        <E>：称为类型参数。
        ArrayList<E>：称为参数化的类型

 */
public class TestGeneric {
    public static void main(String[] args) {
        // 希望这个集合对象中只能装字符串
        ArrayList list1 = new ArrayList();
        /*
        ArrayList这个集合在设计的时候，并没有限定它只能装字符串，可以装各种类型
        * */
        list1.add("hello");
        list1.add(1);
        list1.add(new Date());
        /*
        假设没有泛型的话？
        问题1：啥都能装？
        使得用户想要限定，这个集合只能装字符串，无法实现。
        用户就可能装错。
         */

        ArrayList list2 = new ArrayList();
        list2.add("hello");
        list2.add("world");
        list2.add("java");
        /*
        问题2：就算用户非常谨慎，里面确实只装了字符串，但是集合本身会忘了我装进的是字符串
        * */
        for (Object o : list2) {//遍历时，发现拿出来的是Object,失去元素的本身的类型特点
            System.out.println(o);
            // 如果要使用字符串的方法，还需要强制转换，非常麻烦
            String s = (String) o;
            System.out.print(s + " ");
        }

        // 如果有泛型
        //可以再使用ArrayList集合的时候，给这个集合list3贴标签，说它只能装String对象
        ArrayList<String> list3 = new ArrayList<String>();
        list3.add("hello");
        list3.add("world");
//        list3.add(1);//报错，编译时就报错了，提前避免了非法数据的添加
        for (String s : list3) {
            System.out.println(s + "," + s.length());
        }

    }
    public static int add(int a,int b){// 形参
        return a+b;
    }
    @Test
    public void test(){
        System.out.println(add(3,6));// 实参
    }
}
