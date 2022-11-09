package cn.itcast.queue_队列;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;

/*
队列：先进先出
可以使用ArrayList，更可以使用LinkedList，
相比较而已，LinkedList更专业一点，因为它实现了Queue接口。
而且LinkedList还实现了Deque接口（双端队列接口）
 */
public class TestQueue {
    @Test
    public void test01(){
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("java");
        list.add("mysql");
        list.add("lisi");

        while (!list.isEmpty()) {
            System.out.print(list.remove(0)+" "); // hello world java mysql lisi
        }
    }
    @Test
    public void test02(){
        LinkedList<String> list = new LinkedList<>();
        list.add("hello");
        list.add("world");
        list.add("java");
        list.add("mysql");
        list.add("lisi");

        while (!list.isEmpty()) {
            System.out.print(list.remove()+" ");// 移走第一个元素
            // hello world java mysql lisi
        }
    }

    @Test
    public void test03(){
        LinkedList<String> list = new LinkedList<>();
        list.offer("hello");
        list.offer("world");
        list.offer("java");
        list.offer("mysql");
        list.offer("chai");

        while(!list.isEmpty()){
            System.out.println(list.poll()+" ");//移走第一个元素
            // hello world java mysql lisi
        }
    }
    @Test
    public void test04(){
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("hello");
        list.addFirst("world");// 挤到队头
        list.addFirst("java");
        list.addFirst("mysql");
        list.addFirst("chai");

        // 更具代表性的方法，表示从头操作  （抢票基本都是队列）
        while (!list.isEmpty()){
            System.out.print(list.removeFirst()+" "); // chai mysql java world hello
            System.out.print(list.removeLast()+" "); // hello world java mysql chai
        }
    }
    @Test
    public void test05(){
        LinkedList<String> list = new LinkedList<>();
        list.addLast("hello");
        list.addLast("world");// 挤到队尾
        list.addLast("java");
        list.addLast("mysql");
        list.addLast("chai");

        // 更具代表性的方法，表示从尾操作
        while (!list.isEmpty()){
//            System.out.print(list.removeFirst()+" "); // hello world java mysql chai
            System.out.print(list.removeLast()+" "); // chai mysql java world hello
        }
    }
}
