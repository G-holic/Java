package cn.itcast.stack_栈;

import java.util.LinkedList;
import java.util.Stack;

// LinkedList链式栈
public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.push("hello");// push压栈
        list.push("java");
        list.push("world");
        System.out.println(list); // [world, java, hello]

        /*System.out.println(list.pop());// pop弹栈，弹出栈顶元素
        System.out.println(list.pop());// pop弹栈，弹出栈顶元素
        System.out.println(list.pop());// pop弹栈，弹出栈顶元素
        System.out.println(list.pop());// pop弹栈，弹出栈顶元素*/
        while (!list.isEmpty()){
            System.out.print(list.pop()+" ");// world java hello
        }
    }
}
