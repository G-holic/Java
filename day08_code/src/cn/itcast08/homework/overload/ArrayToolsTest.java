package cn.itcast08.homework.overload;
/*
*
* 声明一个数组工具类ArrayTools，包含如下方法：

- int  binarySearch(int[]  arr,  int  value)：使用二分查找法在arr数组中查找value的下标，如果value不存在，就返回-1，如果数组arr不是有序的，结果将不一定正确

- int  binarySearch(char[]  arr,  char  value)：使用二分查找法在arr数组中查找value的下标，如果value不存在，就返回-1，如果数组arr不是有序的，结果将不一定正确

- int  binarySearch(double[]  arr,  double  value)：使用二分查找法在arr数组中查找value的下标，如果value不存在，就返回-1，如果数组arr不是有序的，结果将不一定正确

- void sort(int[] arr)：可以给arr数组从小到大排序，用冒泡排序实现

- void sort(char[] arr)：可以给arr数组从小到大排序，用冒泡排序实现

- void sort(double[] arr)：可以给arr数组从小到大排序，用冒泡排序实现
- String toString(int[] arr)：将元素拼接为"{元素1，元素2，......}"的字符串返回。
- String toString(double[] arr)：将元素拼接为"{元素1，元素2，......}"的字符串返回。
- String toString(char[] arr)：将元素拼接为"{元素1，元素2，......}"的字符串返回。
* 在测试类的main方法中测试，例如：
int[] arr = {2,4,1,3,6};  //显示排序前后的元素、查找5
char[] letters = {'h','e','w','o','d'};//显示排序前后的元素、查找'a'
double[] nums = {2.3, 1.5, 2.0, 3.5, 3.0};//显示排序前后的元素、查找1.5
*
* */
public class ArrayToolsTest {
    public static void main(String[] args) {
        ArrayTools tools = new ArrayTools();

        int[] arr = {2,4,1,3,6};
        System.out.println("排序前：" + tools.toString(arr));
        tools.sort(arr);
        System.out.println("排序后：" + tools.toString(arr));
        System.out.println("查找5：" + tools.binarySearch(arr, 5));

        char[] letters = {'h','e','w','o','d'};
        System.out.println("排序前：" + tools.toString(letters));
        tools.sort(letters);
        System.out.println("排序后：" + tools.toString(letters));
        System.out.println("查找'a'：" + tools.binarySearch(letters, 'a'));

        double[] nums = {2.3, 1.5, 2.0, 3.5, 3.0};
        System.out.println("排序前：" + tools.toString(nums));
        tools.sort(nums);
        System.out.println("排序后：" + tools.toString(nums));
        System.out.println("查找1.5：" + tools.binarySearch(nums, 1.5));
    }
}
