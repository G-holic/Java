package cn.itcast.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestIterator {
    public static void main(String[] args) {
        Collection coll = new ArrayList();

        coll.add("hello");
        coll.add("world");
        coll.add("java");
        coll.add("h5");

        Iterator iterator = coll.iterator();
        /*while (iterator.hasNext()) {
            if (((String) iterator.next()).length() > 0) {
                System.out.print(iterator.next() + " ");// world h5
            }
        }*/
        while (iterator.hasNext()) {
            String str = (String) iterator.next();
            if (str.length() > 0) {
                System.out.print(str+" ");// hello world java h5
            }
        }
    }
}
