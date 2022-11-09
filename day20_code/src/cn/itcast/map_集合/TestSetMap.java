package cn.itcast.map_集合;

import java.util.HashSet;

/*
结论：
所有Set底层都是Map。

为什么底层要用Map？
因为Map和Set有一共共同特点：set不允许元素重复，map的key不允许重复。
所以Set其实就是取map的key。

那么Map不是应该有(key,value)，而Set只有element，或者说只有key，value去哪里了或者说用什么表示？
添加到set中的元素，被作为底层map的key
底层map的value是一个PRESENT常量对象

因为PRESENT是同一个，所以就多了一个对象而已，但是通过再次封装，产生了新的一组集合。
HashMap,LinkedHashMap,TreeMap...
HashSet,LinkedSet,TreeSet
 */
public class TestSetMap {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        /*
            public HashSet() {
                map = new HashMap<>();
            }

         */
        set.add("hello");
        /*
            public boolean add(E e) {
                return map.put(e, PRESENT)==null;
            }
            添加到set中的元素，被作为底层map的key
            底层map的value是一个PRESENT常量对象

            private static final Object PRESENT = new Object();
         */
    }
}
