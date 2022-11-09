package cn.itcast.exer.exer9_单链表;

public class TestLinkedList {
    public static void main(String[] args) {
        SingleLinked list = new SingleLinked();

        list.add("hello");
        list.add("world");
        list.add("java");
        list.add("python");

        for (Object o : list) {
            System.out.println(o);
        }
    }
}
