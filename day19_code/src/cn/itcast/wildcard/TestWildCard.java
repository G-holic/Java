package cn.itcast.wildcard;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

/*
六、泛型通配符
1、为什么要使用泛型通配符？
问题：声明一个方法，形参是Collection，但是元素类型不确定，怎么办？
    这个方法的功能很简单，就是遍历并打印集合的元素

在Java中，泛型的指定是必须左右两边一致的。

总结：当我们使用一个泛型类或泛型接口时，它的泛型无法确定，可以使用<?>表示，表示未知的类型。
相当于用<?>来指定了泛型
    Collection<T>，这个<T>无法确定，用<?>指定。
 */
public class TestWildCard {
    //方式一：Collection<Object>表达元素可以是任意类型
    //太局限，只能局限于实参是 ArrayList<Object>这样的类型
    public void m1(Collection<Object> c) {
        for (Object o : c) {
            System.out.println(o);
        }
    }

    @Test
    public void test01() {
//        m1(new ArrayList<String>());
        m1(new ArrayList<Object>());
        m1(new ArrayList<>());// 可以，这个和上面是完全等价的
        m1(new ArrayList());// //编译会有警告，泛型擦除，泛型未指定 （cmd窗口编译 警告：[unchecked】未经检查的转换）
        /*
        形参 Collection<Object> c
        实参 new ArrayList<String>()
        实参是给形参赋值
        等价于  Collection<Object> c = new ArrayList<String>();
         */
//        Object obj = new String();//这是多态引用，可以
//        ArrayList<Object> list = new ArrayList<String>();//错误，不是多态
    }

    public void m2(Collection c) {//没有做类型检查，有警告
        for (Object o : c) {
            System.out.println(o);
        }
    }

    @Test
    public void test02() {
        m2(new ArrayList<Object>());
        m2(new ArrayList<>());
        m2(new ArrayList());
        m2(new ArrayList<String>());
    }

    public <T> void m3(Collection<T> c){
        for (T t : c) {
            System.out.println(t);
        }
    }

    @Test
    public void test03(){
        m3(new ArrayList<Object>());
        m3(new ArrayList<>());
        m3(new ArrayList());// 有警告
        m3(new ArrayList<String>());
    }

    public void m4(Collection<?> c){// 这里的？表示类型不确定，没有警告
        for (Object o : c) {
            System.out.println(o);
        }
    }
    @Test
    public void test04(){
        m4(new ArrayList<Object>());
        m4(new ArrayList<>());
        m4(new ArrayList());// 有警告
        m4(new ArrayList<String>());
    }
}
