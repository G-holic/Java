package cn.itcast.exer.exer2;

/*
（4）声明图形工具类ShapeTools
- 提供静态方法public static int compare(Shape s1, Shape s2)如果s1的面积大于、小于、等于s2的面积，分别返回正整数、负整数和0。
- 提供静态方法public static boolean equals(Shape s1, Shape s2)比较两个图形的面积和周长是否都相等
- 提供静态方法public static void sort(Shape[] arr)可以给所有图形按照面积从小到大排序，如果面积相同的按照周长从小到大排序
- 提供静态方法public static void print(Shape[] arr)可以遍历输出所有图形信息
 */
public class ShapeTools {
    //如果s1的面积大于、小于、等于s2的面积，分别返回正整数、负整数和0。
    public static int compare(Shape s1, Shape s2) {
        if (s1.area() > s2.area()) {
            return 1;
        } else if (s1.area() < s2.area()) {
            return -1;
        } else {
            return 0;
        }
    }

    //比较两个图形的面积和周长是否都相等
    public static boolean equals(Shape s1, Shape s2) {
        return s1.area() == s2.area() && s1.perimeter() == s2.perimeter();
    }

    //可以给所有图形按照面积从小到大排序，如果面积相同的按照周长从小到大排序
    public static void sort(Shape[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                boolean flag = false;//假设不需要交换
                if (arr[j].area() > arr[j + 1].area()) {
                    flag = true;
                } else if (arr[j].area() == arr[j + 1].area()) {
                    if (arr[j].perimeter() > arr[j + 1].perimeter()) {
                        flag = true;
                    }
                }

                if (flag) { //要么arr[j]的面积大于arr[j+1]的面积，要么arr[j]的面积 = arr[j+1]的面积，但是arr[j]的周长 大于arr[j+1]的周长
                    Shape temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    //提供静态方法public static void print(Shape[] arr)可以遍历输出所有图形信息
    public static void print(Shape[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
