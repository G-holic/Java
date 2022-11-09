package cn.itcast.exer.exer5;

import java.util.Comparator;

/*
（1）在数组工具类MyArrays中声明如下泛型方法：
- 可以在任意类型的对象数组中，查找某个元素的下标，按照顺序查找，如果有重复的，就返回第一个找到的，如果没有返回-1
- 可以在任意类型的对象数组中，查找最大值，要求元素必须实现Comparable接口
- 可以在任意类型的对象数组中，查找最大值，按照指定定制比较器来比较元素大小
 */
public class MyArrays {
    //    可以在任意类型的对象数组中，查找某个元素的下标，按照顺序查找，如果有重复的，就返回第一个找到的，如果没有返回-1
    public static <T> int indexOf(T[] arr, T value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }

    //    可以在任意类型的对象数组中，查找最大值，要求元素必须实现Comparable接口
    public static <T extends Comparable<? super T>> T max(T[] arr) {
        T max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].compareTo(max) > 0) {
                max = arr[i];
            }
        }
        return max;
    }

    //    可以在任意类型的对象数组中，查找最大值，按照指定定制比较器来比较元素大小
    public static <T> T max(T[] arr, Comparator<? super T> c) {
        T max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (c.compare(arr[i], max) > 0) {
                max = arr[i];
            }
        }
        return max;
    }
}
