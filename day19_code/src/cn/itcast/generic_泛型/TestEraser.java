package cn.itcast.generic_泛型;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
五、泛型擦除
如果用户在使用泛型类或泛型接口时，没有主动指定泛型的类型，就会发生泛型的擦除。
泛型擦除后，类型变量按照哪个类型处理？是统一按照Object处理吗？
不是
答案：泛型擦除后，自动按照类型变量声明时的第一个上限处理，如果类型变量上面时没有指定上限，那么按照Object处理。
 */
public class TestEraser {
    @Test
    public void test01(){
        Collection coll = new ArrayList();
        coll.add("hello");
        // 这里就已经发生泛型的擦除，元素类型<E>未指定，按照Object处理。
    }
    @Test
    public void test02(){
        XueSheng x = new XueSheng("张三",1);
    }
    @Test
    public void test03(){
        Base b = new Base();
        b.method(new Comparable() { //  Comparable t 按照最左边第一个上限处理
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        });
    }
}

class Base<T extends Comparable & Cloneable & Iterator>{
    public void method(T t){

    }
}