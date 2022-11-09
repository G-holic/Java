package cn.itcast.list_集合;

import org.junit.Test;

public class TestMyArrayList {
    @Test
    public void test01() {
        MyArrayList<String> list = new MyArrayList<>();
        System.out.println("size = " + list.size());
        list.add("hello");
        list.add("java");
        list.add(0, "spark");
        list.add(1, "lisi");
        list.add("html");
        list.add("mysql");
        System.out.println("size = " + list.size());

    }

    @Test
    public void test02() {
        MyArrayList<String> list = new MyArrayList<>();
        System.out.println("size = " + list.size());
        list.add("hello");
        list.add("java");
        list.add(null);// 把null当成有效元素添加到集合中
        list.add("html");
        list.add("mysql");

        System.out.println(list.indexOf("mysql")); // 4
    }

    @Test
    public void test03() {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("hello");
        list.add("java");
        list.add(null);//把null当成有效元素添加到集合中
        list.add("h5");
        list.add("mysql");

        list.set(1, "lisi");
        list.remove(3);
        list.remove("java");
        list.remove("mysql");

        for (String s : list) {
            System.out.print(s + " "); // hello lisi null
        }
    }
}
