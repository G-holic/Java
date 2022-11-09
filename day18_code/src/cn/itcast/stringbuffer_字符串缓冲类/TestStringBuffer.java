package cn.itcast.stringbuffer_字符串缓冲类;

import org.junit.Test;

/*
String类的对象是不可变，如果程序中涉及到对“一串字符”经常做修改（拼接、替换等），
那么使用String类反而效率比较低。

可变字符串，或者叫做可变字符序列：java.lang.StringBuffer和java.lang.StringBuilder，字符串缓冲类。
StringBuffer和StringBuilder的区别？
StringBuffer：最早的字符串缓冲区类，是线程安全的。
StringBuilder：JDK1.5之后引入，相对较新，线程不安全的。
    因为大多数时候，StringBuffer和StringBuilder的对象都是被单个线程使用，而不是多线程。
    单线程不存在安全问题，就没必要加同步锁，加锁反而降低性能。

String和 StringBuffer和StringBuilder的区别？
String是不可变的字符串对象
StringBuffer和StringBuilder是可变的字符串对象。

方法们：（以StringBuilder为例，对于StringBuffer的话，只要把StringBuilder直接替换就行）
（1）构造器
StringBuffer和StringBuilder不能直接用""赋值，必须new对象，因为""只能是String类型。
它们三个之间没有父子类关系，所以不能直接类型转换。

（2）方法
public StringBuilder append(xx)：后面追加，其实就是String类的concat或+。
public StringBuilder insert(int offset, String str)：中间插入
public StringBuilder replace(int start,int end, String str)：替换[start,end)范围的字符
public StringBuilder reverse() :字符串反转
public StringBuilder delete(int start, int end) ：指定位置范围[start,end)删除
public StringBuilder deleteCharAt(int index)  ：指定具体的位置
public void setCharAt(int index, char ch)：替换index位置的字符

只要是修改字符串的方法，返回值类型仍然是StringBuilder，那么意味着可以“连写”。

char charAt(index)
int indexOf(XX)
int lastIndexOf(XX)
int length()

StringBuilder和StringBuffer为什么可变？
（1）char[] value;没有final修饰
（2）所有修改的方法，是直接在value数组上进行修改的，如果涉及到扩容，也是会让value执行新的数组。
扩容：一开始的value数组多长？
（1）无参构造
    public StringBuilder() {
        super(16);
    }


    AbstractStringBuilder(int capacity) {
        value = new char[capacity];
    }
（2） 有参构造

    public StringBuilder(String str) {
        super(str.length() + 16);
        append(str);
    }

不够了，如何扩容？或者扩容的机制，算法是什么？
 原来的长度*2+2
 */
public class TestStringBuffer {
    @Test
    public void test01() {
//        StringBuilder s = "hello"; // 错误，类型不兼容
        StringBuilder s = new StringBuilder("hello");
        s.append("world");//这里不用重新接收，因为是在原对象基础上之间修改的
        s.append(1);
        s.append('a');
        System.out.println("s = " + s);// s = helloworld1a
    }

    @Test
    public void test02() {
        StringBuilder s = new StringBuilder("hello");
        s.append("world").append(1).append("a").append(5.6);
        System.out.println(s);// helloworld1a5.6
    }

    @Test
    public void test03(){
        StringBuilder s = new StringBuilder("hello");
        s.insert(2,"world");
        System.out.println("s = " + s);//s = heworldllo
    }
    @Test
    public void test04(){
        StringBuilder s = new StringBuilder("hello");
        s.replace(2,5,"world");
        System.out.println(s);//heworld
    }
    @Test
    public void test05(){
        StringBuilder s = new StringBuilder("hello");
        s.reverse();
        System.out.println(s);//olleh
    }

    @Test
    public void test06(){
        StringBuilder s = new StringBuilder("hello");
        s.delete(1,3);
        System.out.println(s);//hlo
    }
}
