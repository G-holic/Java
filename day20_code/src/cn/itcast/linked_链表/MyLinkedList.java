package cn.itcast.linked_链表;

import java.util.Iterator;

/*
链式结构，
（1）先要有结点，双链表的结点：
class Node{
    Node previous;
    E data;//元素对象
    Node next;
}
（2）对于双链表来说，可以从前往后查找元素，也可以从后往前查找元素，
双链表最后记录一下：第一个结点的地址和最后一个结点地址
 */
public class MyLinkedList<E> implements Iterable<E> {

    private Node first; // 第一个结点的地址
    private Node last; // 最后一个结点的地址
    private int total;

    // 双链表添加元素
    public void add(E e) {
        /*
        第一步：先创建新结点
        * */
        Node newNode = new Node(last, e, null);
        /*
        新结点的previous = last；（这里last是指没有添加当前新结点之前的最后一个结点）
        如果是第一次添加，那么last是null
        如果是非第一次添加，那么last是有值的
        * */
        /*
        第二步：让上一个结点的next指向新结点
        * */
        if (last != null) {//  非第一次添加
            last.next = newNode;
        } else {// 第一次添加
            first = newNode;
        }

        /*
        第三步：最后一个结点变成了是当前最新的结点
        * */
        last = newNode;

        /*
        元素个数增加
        * */
        total++;

    }

    // 删除元素
    public void remove(Object obj) {
        /*
         思路：
         （1）找到目标结点
        * */
        Node node = findNode(obj);
        if (node != null) {// 找到被删除的目标结点
            if (node.previous == null) {// 说明被删除的是第一个结点
                first = node.next;
            } else {
                node.previous.next = node.next;
            }
            if (node.next == null) { // 说明被删除的是最后一个结点
                last = node.previous;
            } else {
                node.next.previous = node.previous;
            }
            node.previous = null;
            node.next = null;
            node.data = null;
            total--;
        }
    }

    // 查找结点
    private Node findNode(Object obj) {
        /*
        从头开始遍历，或者从尾开始遍历，这里选择从头遍历
        * */
        if (obj == null) {
            Node node = first;
            while (node != null) {
                if (node.data == null) {// 目标对象是null
                    return node;
                }
                node = node.next;
            }
        } else {
            Node node = first;
            while (node != null) {
                if (obj.equals(node.data)) {
                    return node;
                }
                node = node.next;
            }

        }
        return null; // 说明没找到目标结点
    }

    // 遍历

    public int size() {
        return total;
    }

    @Override
    public Iterator<E> iterator() {
        return new Itr();
    }

    private class Itr implements Iterator<E> {
        Node node = first;

        @Override
        public boolean hasNext() {// hasNext当前位置有无元素
            return node != null;
        }

        @Override
        public E next() {
            E value = node.data;//取出当前结点的数据
            node = node.next;// 结点后移
            return value;
        }
    }


    // 双链表的结点类型
    private class Node {
        Node previous; // 前结点
        E data; //元素对象
        Node next; // 后结点

        Node(Node previous, E data, Node next) {
            this.previous = previous;
            this.data = data;
            this.next = next;
        }
    }

}
