package cn.itcast.generic_泛型;

/*
2、自定义泛型方法
当有如下情况时，需要声明泛型方法：
（1）如果我们定义类、接口时没有使用<类型变量>，但是某个方法形参类型不确定时，这个方法可以单独定义<类型变量>；
（2）另外我们之前说类和接口上的类型形参是不能用于静态方法中，那么当某个静态方法的形参类型不确定时，静态方法可以单独定义<类型变量>。

语法格式：
[修饰符] <泛型类型变量列表> 返回值类型 方法名(【形参列表】)【throws 异常列表】{}

需求：
我们编写一个数组工具类，包含可以给任意对象数组进行从小到大排序，调用元素对象的compareTo方法比较元素的大小关系。
 */
public class TestDefineGenericMethod {
    /*public static void sort(Object[] arr) {// 这里用Object是因为，元素类型不确定，希望可以接收任意类型的对象数组
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                Comparable left = (Comparable) arr[j];
                if (left.compareTo(arr[j + 1]) > 0) {
                    Object temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }*/

    public static <T> void sort(T[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                Comparable left = (Comparable) arr[j];
                if (left.compareTo(arr[j + 1]) > 0) {
                    T temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
