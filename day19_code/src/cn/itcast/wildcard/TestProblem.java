package cn.itcast.wildcard;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/*
<?>的容器，是无法添加任意元素。
<? extends 上限>的容器，是无法添加任意元素。
<? super 下限>的容器，是允许添加元素，但是元素类型有限制，必须是下限或下限子类对象。
 */
public class TestProblem {
    @Test
    public void test01() {
        Collection<?> coll = new ArrayList<>();
//        coll.add("hello");
//        coll.add(1);
//        coll.add(1.0);
        /*
        上面所有添加操作都报错。
        为什么？
        因为<?>表示未知的类型，集合的元素是不确定的，那么添加任意类型对象都有风险。
         */

        Collection<?> coll2 = Arrays.asList("hello", "java", "world");
        for (Object o : coll2) {
            System.out.print(o + " ");//hello java world
        }
    }

    @Test
    public void test02() {
        Collection<? extends Number> coll = new ArrayList<>();
//        coll.add(1);
//        coll.add(1.0);
//        coll.add("hello");
        /*
        上面所有添加操作都报错。
        为什么？
        因为<?>表示未知的类型，代表<=Number的任意一种
        * */
    }

    @Test
    public void test03() {
        Collection<? super Number> coll = new ArrayList<>();
        coll.add(1);
        coll.add(1.0);
//        coll.add("hello");
        /*
        前两个可以，最后一个不行
        <? super Number>代表>=Number类型。最小可能是Number。
         */
    }
}
