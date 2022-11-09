package cn.itcast.array_数组工具类;

import org.junit.Test;

import java.util.function.DoubleToIntFunction;

public class MyArrayListTest {
    @Test
    public void test01(){
        //Debug测试
        MyArrayList list = new MyArrayList();
        list.add("hello");
        list.add("java");
        list.add("spark");
        list.add("html");
        list.add("bigData");
        list.add("python");
        list.add("sql");
        list.add(5,"sqlBoy");
        list.add("sql1");

        list.remove(1);
        list.remove(3);

        for (Object o : list) {
            System.out.println(o);
        }
    }
}
