package cn.itcast.linked_链表;

import cn.itcast.list_集合.MyArrayList;

public class TestMyLinkedList {
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();
        list.add("hello");
        list.add("world");
        list.add("java");
        list.add("h5");
        list.add("mysql");
        list.add("lisi");

        list.remove("hello");
        list.remove("lisi");
        list.remove("java");

        System.out.println(list.size());// 3
        for (String s : list) {
            System.out.print(s+" ");// world h5 mysql
        }
    }
}
