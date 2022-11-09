package cn.itcast08.exam;

/*
2、在ArrayTools类中
（1）声明一个sort方法可以实现给任意int[]数组从小到大排序
（2）声明一个find方法可以查找target是否在int[]数组中，
存在返回下标，不存在返回-1
分析：
    int[]数组是未知，所以有一个形参 int[] arr
    target查找目标也是未知的，所以有另一个形参 int target
如果target在arr数组中存储，返回它的下标（这里没有考虑重复，第一个找到的下标）  ，下标是int类型，所以返回值类型是int

如果要考虑重复元素，需要返回int[]。

（3）声明一个binarySearch方法可以用二分查找法查找target是否
在int[]数组中，存在返回下标，不存在返回-1

（4）声明一个toString()方法可以将int[]数组元素以
“{元素1,元素2....}”形式返回
分析：int[] arr = {1,2,3,4,5};
toString会把arr的数组元素拼接为 "{1,2,3,4,5}";

（5）在Exam2类的main方法中测试调用
 */
public class Exam2 {
    public static void main(String[] args) {
        ArrayTools tools = new ArrayTools();

        int[] arr = {3, 4, 5, 1, 2};
        System.out.println("arr数组中是否有5，它的下标是：" + tools.find(arr, 5));
        System.out.println("arr数组中是否有8，它的下标是：" + tools.find(arr, 8));
        System.out.println("arr的元素：" + tools.toString(arr));

        //排序
/*        int[] result = tools.sort(arr);
        System.out.println("arr排序后返回的result：" +tools.toString(result));*/
        tools.sort(arr);
        System.out.println("arr排序后arr自己：" + tools.toString(arr));

        //二分查找
        System.out.println("arr数组中是否有1：" + tools.binarySearch(arr, 1));
    }
}
