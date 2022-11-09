package cn.itcast.list_集合;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

/*
2、List系列的集合
（1）List特点：
有序、可以重复、线性、可以根据索引操作元素。

（2）List接口的方法
java.util.List<E>，注意不要导错包了（java.awt.List）
List接口是Collection的子接口，所以Collection接口的所有方法，它都有。
我们下面主要介绍它新增的方法，比Collection接口多的方法。
A：添加
* void add(int index, E ele)
* boolean addAll(int index, Collection<? extends E> eles)
B、删除
E remove(int index)：指定位置删除元素

C：修改
E set(int index, E ele)

D：查询
 E get(int index) ：获取指定位置的元素
 int indexOf(Object o) ：查询o对象在当前List集合的位置，如果有重复的多个相同元素，只返回第1个。
 int lastIndexOf(Object o) ：查询o对象在当前List集合的位置，如果有重复的多个相同元素，只返回最后1个。
 List<E> subList(int fromIndex, int toIndex) ：截取一段[fromIndex, toIndex)

E：遍历
ListIterator<E> listIterator()
ListIterator<E> listIterator(int index)

Iterator<E>接口：
boolean hasNext()
E next()
void remove();

ListIterator<E>是Iterator<E>的子接口。比Iterator功能更强大，
A：可以支持，从任意位置开始从前往后遍历，也支持从后往前遍历。
boolean hasPrevious()
E previous()
B：在遍历过程中，可以显示下标信息
int nextIndex();
int previousIndex()
C：还可以在遍历的过程中添加和修改元素
void add(E e)
void set(E e)
 */
public class TestList {
    // 增
    @Test
    public void test01() {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add(0, "world");
        System.out.println(list);// [world, hello, world]
    }

    @Test
    public void test02() {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("java");

        List<String> list2 = Arrays.asList("html", "spark");
        list.addAll(1, list2);
        System.out.println(list);// [hello, html, spark, java]

    }

    // 删
    @Test
    public void test03() {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add(0, "world");

        list.remove(1);
        System.out.println(list);// [world, world]
    }

    @Test
    public void test04() {
        List<Integer> list = new ArrayList();// 泛型擦除
        list.add(10);
        list.add(20);
        list.add(30);
        list.remove(1);

        System.out.println(list);// [10, 30]

        list.remove(Integer.valueOf(10));
        System.out.println(list);// [30]
    }

    // 改
    @Test
    public void test05() {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add(0, "world");

        list.set(1, "李");
        System.out.println(list);// [world, 李, world]
    }

    // 查
    @Test
    public void test06() {
        List<String> list = new ArrayList<>();
        list.add("hello");// [0]
        list.add("java");// [1]
        list.add("hello");// [2]
        list.add("world");// [3]
        list.add("hello");// [4]
        list.add("spark");// [5]

        System.out.println(list.get(2)); // hello
        System.out.println(list.subList(2, 6));//[hello, world, hello, spark]
        System.out.println(list.indexOf("hello"));// 0
        System.out.println(list.lastIndexOf("hello"));// 4
    }

    // 遍历
    @Test
    public void test07() {
        List<String> list = new ArrayList<>();
        list.add("hello");// [0]
        list.add("java");// [1]
        list.add("hello");// [2]
        list.add("world");// [3]
        list.add("hello");// [4]
        list.add("spark");// [5]

        ListIterator<String> iter = list.listIterator();
        while (iter.hasNext()) {
            String next = iter.next();
            System.out.print(next + " ");// hello java hello world hello spark
        }
        System.out.println();
    }

    @Test
    public void test08() {
        List<String> list = new ArrayList<>();
        list.add("hello");// [0]
        list.add("java");// [1]
        list.add("hello");// [2]
        list.add("world");// [3]
        list.add("hello");// [4]
        list.add("spark");// [5]

        ListIterator<String> iter = list.listIterator();
        while (iter.hasNext()) {
            String next = iter.next();
//            （有获取下标的方法）
            System.out.print(iter.nextIndex() + ": " + next + " ");// 1: hello 2: java 3: hello 4: world 5: hello 6: spark
        }
        System.out.println();
    }

    @Test
    public void test09() {
        List<String> list = new ArrayList<>();
        list.add("hello");// [0]
        list.add("java");// [1]
        list.add("hello");// [2]
        list.add("world");// [3]
        list.add("hello");// [4]
        list.add("spark");// [5]

        ListIterator<String> iter = list.listIterator();
        while (iter.hasNext()) {
            String next = iter.next();
            System.out.print(iter.nextIndex() + ": " + next + " ");// 1: hello 2: java 3: hello 4: world 5: hello 6: spark
        }
        System.out.println();
        System.out.println("-------------");

        while (iter.hasPrevious()) {
            System.out.print(iter.previousIndex() + ": " + iter.previous() + " ");// 5: spark 4: hello 3: world 2: hello 1: java 0: hello
        }
        System.out.println();
    }

    @Test
    public void test10() {
        List<String> list = new ArrayList<>();
        list.add("hello");// [0]
        list.add("java");// [1]
        list.add("hello");// [2]
        list.add("world");// [3]
        list.add("hello");// [4]
        list.add("spark");// [5]

        ListIterator<String> iter = list.listIterator(list.size());// list.size() 6
        while (iter.hasPrevious()) {
            System.out.print(iter.previousIndex() + ": " + iter.previous() + " ");// 5: spark 4: hello 3: world 2: hello 1: java 0: hello
        }
        System.out.println();
    }

    @Test
    public void test11() {
        List<String> list = new ArrayList<>();
        list.add("hello");// [0]
        list.add("java");// [1]
        list.add("hello");// [2]
        list.add("world");// [3]
        list.add("hello");// [4]
        list.add("spark");// [5]

        ListIterator<String> iter = list.listIterator(3);
        while (iter.hasPrevious()) {
            System.out.print(iter.previousIndex() + ": " + iter.previous() + " ");// 2: hello 1: java 0: hello
        }
        System.out.println();
    }

    // 遍历中添加元素
    @Test
    public void test12() {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("java");
        list.add("world");
        list.add("spark");

        ListIterator<String> iter = list.listIterator();

        // 在java后面添加一个lisi
        while (iter.hasNext()) {
            String next =  iter.next();
            if (next.equals("java")){
                iter.add("lisi");
            }
        }
        System.out.println(list); // [hello, java, lisi, world, spark]
    }

    @Test
    public void test13() {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("java");
        list.add("world");
        list.add("spark");

        ListIterator<String> iter = list.listIterator(list.size()); // 后往前

        // 在java后面添加一个lisi
        while (iter.hasPrevious()) {
            String next =  iter.previous();
            if (next.equals("java")){
                iter.add("lisi");
            }
        }
        System.out.println(list); // [hello, lisi, java, world, spark]
    }

    // 遍历中替换
    @Test
    public void test14() {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("java");
        list.add("world");
        list.add("spark");

        ListIterator<String> iter = list.listIterator();

        // 把java替换成"lisi"
        while (iter.hasNext()) {
            String next =  iter.next();
            if (next.equals("java")){
                iter.set("lisi");
            }
        }
        System.out.println(list); // [hello, lisi, world, spark]
    }
}
