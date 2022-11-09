package cn.itcast.list_集合;

import java.util.Vector;

public class TestVector {
    public static void main(String[] args) {
        Vector<String>  vector = new Vector<>();
        vector.add("hello");
        vector.add("hello");
        vector.remove("hello");
        vector.set(0,"hello");
        vector.iterator();

    }
}
