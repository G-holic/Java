package cn.itcast08.exer.overload;
/*
（1）声明一个数组工具类ArraysTools，包含几个重载方法
- 重载方法系列1：可以为int[]，double[]，char[]数组实现从小到大排序
  - void sort(int[] arr)
  - void sort(double[] arr)
  - void sort(char[] arr)
- 重载方法系列2：toString方法，可以遍历int[]，double[]，char[]数组，遍历结果形式：[元素1，元素2，。。。]
  - String toString(int[] arr)
  - String toString(double[] arr)
  - String toString(char[] arr)

（2）在测试类的main方法中调用

Java中，double类型的变量，可以接收int类型的值，但是double[]数组，不能接收int[]的数组
 */
public class ArrayToolsTest {
    public static void main(String[] args) {
        /*public static void main(String[] args) {
        int num = 1;
        double d = num;

        int[] arr1 = {1,2,3,4,5};
        double[] arr2 = arr1;//错误
    }*/
        int[] arr1 = {2,4,6,1,2};
        ArrayTools tools = new ArrayTools();
        System.out.println("排序前：" + tools.toString(arr1));
        tools.sort(arr1);
        System.out.println("排序后：" + tools.toString(arr1));

        System.out.println("---------------------------");
        double[] arr2 = {5.2,3.2,4.2,1.2};
        System.out.println("排序前：" + tools.toString(arr2));
        tools.sort(arr2);
        System.out.println("排序后：" + tools.toString(arr2));

        System.out.println("------------------------");
        char[] arr3 = {'f','d','a','c','z'};
        System.out.println("排序前：" + tools.toString(arr3));
        tools.sort(arr3);
        System.out.println("排序后：" + tools.toString(arr3));
    }
}
