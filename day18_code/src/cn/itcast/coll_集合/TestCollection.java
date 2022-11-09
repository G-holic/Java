package cn.itcast.coll_集合;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

/*
第11章 集合与迭代器
1、什么是集合？
集合是一种容器，或也可以叫做一种数据结构。
今天先讲它容器的角色。

容器：
    生活中的容器：装东西
    Java中的容器：装对象

数组：也是容器

2、数组和今天要讲的集合有什么区别和联系？
联系：
    首先它们都是容器。
    其次，很多集合底层也是数组，即很多集合都是对数组的再次封装。
区别：
    数组：
    (1)可以装基本数据类型的数据，也可以装对象
    (2)数组的大小是固定的，除非你手动进行扩容、复制，即原有的数组是不能更改大小，只能通过新数组来实现扩容等操作。
    (3)数组的元素是连续存储，在内存中会开辟一整块连续的存储空间，那么它的访问速度是很高，可以根据数组名[下标]直接定位到某个元素。
    (4)数组结构比较单一
    集合：
    （1）只能装对象，不能装基本数据的值。当把基本数据类型的值放到集合中时，会自动装箱为对象。
    （2）集合对于使用者来说，是可以自动扩容，不用使用者去做任何的额外的操作。相对来说，比较简单。
    （3）集合元素有的是连续存储的，有的不是连续存储，因为底层有的也是数组，有的底层是链表等。
        如果底层不是数组的话，元素的访问效率不高了。
    （4）集合的种类非常多，有ArrayList、HashSet、TreeSet等。

3、集合主要分为两大类：
Collection：存储一组对象，一个一个对象凑出一组。比喻单身party。
Map ：存储一对一对的键值对（映射关系）。比喻情侣party（key是一个对象,value也是一个普通的对象）或家庭party（key是一个对象，value是一个集合）。


4、Collection系列的集合
（1）Collection接口是Collection系列集合的根接口。
Collection 表示一组对象，这些对象也称为 collection 的元素。
一些 collection 允许有重复的元素，而另一些则不允许。
一些 collection 是有序的，而另一些则是无序的。
JDK 不提供此接口的任何直接 实现：它提供更具体的子接口（如 Set 和 List、Queue等）实现。
Collection接口中的所有方法，Collection系列的集合都有。

（2）Collection接口的方法
A：添加
（1）add(Object obj)：添加元素对象到当前集合中
（2）addAll(Collection other)：添加other集合中的所有元素对象到当前集合中，即this = this ∪ other
B：删除
（1） boolean remove(Object obj) ：从当前集合中删除第一个找到的与obj对象equals返回true的元素。
（2）boolean removeAll(Collection coll)：从当前集合中删除所有与coll集合中相同的元素。
            即this = this - this ∩ coll
（3）boolean removeIf(Predicate filter) ：删除满足给定条件的此集合的所有元素。
（4）boolean retainAll(Collection coll)：从当前集合中删除两个集合中不同的元素，使得当前集合仅保留与c集合中的元素相同的元素，
                即当前集合中仅保留两个集合的交集，即this  = this ∩ coll；
 (5)clear()：清空集合
C：查询
（1）boolean isEmpty()：判断当前集合是否为空集合。
（2）boolean contains(Object obj)：判断当前集合中是否存在一个与obj对象equals返回true的元素。
（3）boolean containsAll(Collection c)：判断c集合中的元素是否在当前集合中都存在。即c集合是否是当前集合的“子集”。
（4）int size()：获取当前集合中实际存储的元素个数
（5）Object[] toArray()：返回包含当前集合中所有元素的数组

D：遍历和迭代

 */
public class TestCollection {
    @Test
    public void test01() {
        // 创建一个容器对象
        /*
        Collection是一个接口，不能直接创建对象，必须创建实现类的对象。ArrayList是Collection接口的实现类之一。
        这里左边写Collection的目的是为了大家更加关注Collection接口中的方法，
        因为编译时看左边，只能调用左边Collection里面声明的方法，ArrayList增加的方法编译时就看不到了。
         */
        Collection coll = new ArrayList();

        coll.add("hello");
        coll.add("world");
        coll.add("java");
        coll.add("python");
        coll.add("mysql");

        System.out.println(coll);//[hello, world, java, python, mysql]
    }

    @Test
    public void test02() {
        Collection coll = new ArrayList();

        coll.add("hello");
        coll.add("world");
        coll.add("java");

        Collection other = new ArrayList();

        other.add("hi");
        other.add("c");
        other.add("spark");

        // 希望把other的所有元素都添加到coll集合中
//        coll.add(other);
//        System.out.println(coll);//[hello, world, java, [hi, c, spark]]
//        System.out.println(coll.size());//4

        coll.addAll(other);
        System.out.println(coll);//[hello, world, java, hi, c, spark]
        System.out.println(coll.size());// 6

    }

    @Test
    public void test03() {
        Collection coll = new ArrayList();

        coll.add("hello");
        coll.add("world");
        coll.add("html");
        coll.add("mysql");
        coll.add("bigdata");

        // 删除world
        coll.remove("world");
        System.out.println(coll); // [hello, html, mysql, bigdata]

        Collection other = new ArrayList();
        other.add("hello");
        other.add("world");
        other.add("mysql");

        coll.removeAll(other);
        System.out.println(coll); // [html, bigdata]
    }

    @Test
    public void test04() {
        Collection coll = new ArrayList();

        coll.add("hello");
        coll.add("world");
        coll.add("html");
        coll.add("mysql");
        coll.add("bigdata");

        Collection other = new ArrayList();
        other.add("hello");
        other.add("world");
        other.add("mysql");
        other.add("hi");

        coll.retainAll(other);
        System.out.println(coll); // [hello, world, mysql]
    }

    @Test
    public void test05() {
        Collection coll = new ArrayList();

        coll.add("hello");
        coll.add("world");
        coll.add("html");
        coll.add("mysql");
        coll.add("bigdata");

        //删除 字符串中包含"o"字母的字符串
//        coll.removeIf(字符串中包含“o”字母);
        /*
        removeIf的形参是Predicate接口，有一个抽象方法 boolean test(Object t);
        这个t就是集合中的元素，如果t满足要删除的条件，就返回true
         */
        coll.removeIf(new Predicate() {
            @Override
            public boolean test(Object o) { // 现在形参是Object类型，需要向下转型
                return ((String) o).contains("o");// 向下转型
            }
        });

        System.out.println(coll); // [html, mysql, bigdata]

        coll.clear();//清空集合
        System.out.println(coll);//[]
    }

    @Test
    public void test06() {
        Collection coll = new ArrayList();

        coll.add("hello");
        coll.add("world");
        coll.add("html");
        coll.add("mysql");
        coll.add("bigdata");

        System.out.println(coll.contains("lisi")); // false
        System.out.println(coll.contains("hello")); // true

        Collection other = new ArrayList();
        other.add("hello");
        other.add("world");
        other.add("mysql");
        other.add("hi");

        System.out.println(coll.containsAll(other));// false
    }

    @Test
    public void test07() {
        Collection coll = new ArrayList();

        coll.add("hello");
        coll.add("world");
        coll.add("html");
        coll.add("mysql");
        coll.add("bigdata");

        Object[] objects = coll.toArray();
        for (Object object : objects) {
            System.out.print(object + " ");//hello world html mysql bigdata
        }
    }
}
