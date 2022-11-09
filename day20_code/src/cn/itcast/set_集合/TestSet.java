package cn.itcast.set_集合;

import org.junit.Test;

import java.util.*;

/*
List接口：
    可以重复，有序，根据索引操作等
Queue接口：
    先进先出
Deque接口：
    可以先进先出，可以后进先出，可以先进后出....，因为两头操作。
Set接口

Set系列的集合有什么特点：
    不允许元素重复，有一些是有序的，有一些是无序。
    底层的存储顺序和添加的顺序绝对不一致。
Set也是Collection接口的子接口，但是没有扩展新方法，所以用的都是Collection接口的方法。
Set的实现类有：HashSet，TreeSet，LinkedHashSet
 */
public class TestSet {
    @Test
    public void test01() {
        HashSet<String> set = new HashSet<>();
        set.add("hello");
        set.add("world");
        set.add("hello");
        set.add("java");
        set.add("hello");

        System.out.println("元素个数：" + set.size());// 元素个数：3
        System.out.println(set);// [world, java, hello]
        /*
         * 无序，且不重复
         * */
    }

    @Test
    public void test02() {
        TreeSet<String> set = new TreeSet<>();
        set.add("hello");
        set.add("Wo");
        set.add("Bob");
        set.add("hello");
        set.add("java");
        set.add("hello");
        set.add("hallo");
        set.add("jack");
        set.add("chai");

        System.out.println("元素个数：" + set.size());// 元素个数：7
        System.out.println(set);// [Bob, Wo, chai, hallo, hello, jack, java]
        /*
        有序（有大小顺序），且不重复
        这个例子中，是依据String的自然排序排列的，而自然顺序就是Unicode编码值排序
         */
    }

    @Test
    public void test03() {
        TreeSet<String> set = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });
        set.add("hello");
        set.add("Wo");
        set.add("Bob");
        set.add("hello");
        set.add("java");
        set.add("hello");
        set.add("hallo");
        set.add("jack");
        set.add("chai");

        System.out.println("元素个数：" + set.size());// 元素个数：7
        System.out.println(set);// [Bob, chai, hallo, hello, jack, java, Wo]
        /*
        有序（有大小顺序），且不重复
        这个例子中，是依据String的定制排序排列的，希望是忽略大小写的排序
         */
    }

    @Test
    public void test04() {
        TreeSet<String> set = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
//                return o1.length()-o2.length(); // 光看长度不行
                int lengthResult = o1.length() - o2.length();
                return lengthResult == 0 ? o1.compareTo(o2) : lengthResult;
            }
        });
        set.add("hello");
        set.add("Wo");
        set.add("Bob");
        set.add("hello");
        set.add("java");
        set.add("hello");
        set.add("hallo");
        set.add("jack");
        set.add("chai");

        System.out.println("元素个数：" + set.size());// 元素个数：7
        System.out.println(set);// [Wo, Bob, chai, jack, java, hallo, hello]
        /*
        有序（有大小顺序），且不重复
        这个例子中，是依据String的定制排序排列的，依据字符串的长度排序
         */
    }

    @Test
    public void test05() {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("hello");
        set.add("Wo");
        set.add("Bob");
        set.add("hello");
        set.add("java");
        set.add("hello");
        set.add("hallo");
        set.add("jack");
        set.add("chai");

        System.out.println(set);// [hello, Wo, Bob, java, hallo, jack, chai]
        /*
        * 不可重复，有序（按照添加顺序）
        * 这里的话，底层不是按照添加顺序存储的，但是会有一个链表记录它们的添加顺序
        * */
    }

    @Test
    public void test06() {
        HashSet<Student> set = new HashSet<>();
        set.add(new Student(1,"张三"));
        set.add(new Student(1,"张三"));// 没有重写equals的话，equals等价于 ==
        set.add(new Student(2,"李四"));

        System.out.println(set);// [Student{id=2, name='李四'}, Student{id=1, name='张三'}]
    }
    @Test
    public void test07() { // TreeSet要求Student一定要实现Comparator接口。或者直接new 匿名内部类接口
        TreeSet<Student> set = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getId()-o2.getId();
            }
        });
        set.add(new Student(1,"张三"));
        set.add(new Student(1,"张三"));// 没有重写equals的话，equals等价于 ==
        set.add(new Student(2,"李四"));

        System.out.println(set);// [Student{id=1, name='张三'}, Student{id=2, name='李四'}]
    }
}
