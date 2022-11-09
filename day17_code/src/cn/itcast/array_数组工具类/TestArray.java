package cn.itcast.array_数组工具类;

import org.junit.Test;

import java.lang.reflect.Array;
import java.text.Collator;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;

/*
回忆：
1、找最大值
    （1）先假设第一个元素最大，赋值给max
    （2）后面的元素与max比较，如果有比max大的，就重新修改max的值

2、找最大值及其下标
（1）最大值只有一个
    设置两个变量，一个是max，一个是index
    A:    先假设第一个元素最大，赋值给max ,index=0
    B: 后面的元素与max比较，如果有比max大的，就重新修改max的值和index的值
（2）最大值有多个
    A：先找到最大的值
    B：在数组中遍历，哪些元素和最大值一样
3、顺序查找
从头往后遍历数组，与目标元素一一比较

4、二分查找。
数组是有序的，从小到大
int left = 0;
int right = arr.length-1;
while(left<=right){
    int mid = left + (right-left)/2;
    if(arr[mid] == target){
        找到了
        break;
    }else if(target > arr[mid]){
        left = mid + 1;
    }else{
        right = mid - 1;
    }
}

5、反转
思路：首尾元素交换法
for(int left=0,right=arr.length-1; left<right; left++,right--){
    元素类型 temp = arr[left];
    arr[left] = arr[right];
    arr[right] = temp;
}

6、冒泡排序
相邻元素比较
for(int i=1; i<arr.length; i++){
    for(int j=0; j<arr.length-i; j++){
        if(arr[j] > arr[j+1]){
            元素类型 temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
        }
    }
}
7、直接选择排序
思路：每一轮找到本轮未排序元素的最大/最小值
for(int i=0; i<arr.length-1; i++){
    int min = arr[i];
    int index = i;
    //找最小值
    for(int j=i+1; j<arr.length; j++){
        if(arr[j] < min){
            min = arr[j];
            index = j;
        }
    }
    //交换
    if(i!=index){
        //交换arr[i]与arr[index]
        元素的类型 temp = arr[i];
        arr[i] = arr[index];
        arr[index] = temp;
    }
}

数组工具类java.util.Arrays：
public static int binarySearch(int[] a, int key)：如果key在a数组中，则返回对应的下标，否则返回(-(插入点) - 1)。。
    插入点 被定义为将key插入数组的那一点。
public static void sort(int[] a)：排序，从小到大，底层不是冒泡排序，是优化过的快速排序。
public static void sort(Object[] a)：要求元素实现自然排序接口java.lang.Comparable接口
public static  void sort(Object[] a,Comparator c)：在排序过程中使用定制排序规则
public static String toString(int[] a)：把元素拼接结果转为字符串返回

public static String toString(Object[] a)：把元素拼接结果转为字符串返回，对象会在拼接过程中自动调用对象的toString

public static int[] copyOf(int[] original,int newLength)：复制一个新数组，长度为newLength
public static int[] copyOfRange(int[] original,int from,int to)：复制original的[from, to)
public static boolean equals(int[] a, int[] a2) ：比较两个数组的长度、元素是否完全相同
public static void fill(int[] a,int val)：给数组填充元素
 */
public class TestArray {
    // 二分
    @Test
    public void test01() {
        int[] arr = {4, 5, 7, 9, 12};
        int target = 6;
        System.out.println(Arrays.binarySearch(arr, target));// -3 不存在 返回(-(插入点) - 1)
        // 如果6存在，他应该在arr[2]位置，所以-2-1
    }

    @Test
    public void test02() {
        int[] arr = {4, 5, 7, 9, 12};
        int target = 9;
        System.out.println(Arrays.binarySearch(arr, target));// 3
    }

    // 排序 从小到大，底层不是冒泡排序，是优化过的快速排序。
    @Test
    // 按照id
    public void test03() {
        Student[] arr = new Student[3];
        arr[0] = new Student(2, "张三", 90);
        arr[1] = new Student(1, "李四", 45);
        arr[2] = new Student(5, "王五", 100);

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

    }

    @Test
    // 按照成绩
    public void test04() {
        Student[] arr = new Student[3];
        arr[0] = new Student(2, "张三", 90);
        arr[1] = new Student(1, "李四", 45);
        arr[2] = new Student(5, "王五", 100);

        Arrays.sort(arr, new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                Student s1 = (Student) o1;
                Student s2 = (Student) o2;
                return s2.getScore() - s1.getScore();
            }
        });

        System.out.println(Arrays.toString(arr));

    }

    @Test
    //按照字符串
    public void test05() {
        Student[] arr = new Student[3];
        arr[0] = new Student(2, "Jack", 90);
        arr[1] = new Student(1, "Bob", 45);
        arr[2] = new Student(5, "Tom", 100);

        Arrays.sort(arr, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                Student s1 = (Student) o1;
                Student s2 = (Student) o1;
//                return s2.getScore()-s1.getScore();
                // 比较两个学生的姓名，name是String类型
//                if (s1.getName()>s2.getName()){// 错误，字符串不支持直接比大小，因为是对象
//                    //...
//                }
                // String类实现了java.lang.Comparable接口
                return s1.getName().compareTo(s2.getName());// String的自然排序是按照自负的Unicode编码值比较
            }
        });

        System.out.println(Arrays.toString(arr));
    }

    @Test
    // 按照指定语言
    public void test06() {
        Student[] arr = new Student[3];
        arr[0] = new Student(2, "张三", 90);
        arr[1] = new Student(1, "李四", 45);
        arr[2] = new Student(5, "王五", 100);

        Arrays.sort(arr, new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                Student s1 = (Student) o1;
                Student s2 = (Student) o2;
                // Collator 类执行区分语言环境的 String 比较。
                Collator c = Collator.getInstance(Locale.CHINA);// 中文按照拼音来排
                return c.compare(s1.getName(), s2.getName());
            }
        });

        System.out.println(Arrays.toString(arr));

    }

    // 数组复制
    @Test
    public void test07() {
        int[] arr = {1, 2, 3, 4, 5};
        int[] newArr1 = Arrays.copyOf(arr, 3);
        System.out.println(Arrays.toString(newArr1)); // [1, 2, 3]

        int[] newArr2 = Arrays.copyOf(arr, 10);
        System.out.println(Arrays.toString(newArr2)); // [1, 2, 3, 4, 5, 0, 0, 0, 0, 0] 默认值表示，int是0
    }

    @Test
    // 指定范围
    public void test08(){
        int[] arr = {1, 2, 3, 4, 5};
        int[] newArr1 = Arrays.copyOfRange(arr, 2,4); // [3, 4]
        System.out.println(Arrays.toString(newArr1)); // [1, 2, 3]

        int[] newArr2 = Arrays.copyOfRange(arr, 2,10);
        System.out.println(Arrays.toString(newArr2)); // [3, 4, 5, 0, 0, 0, 0, 0] 默认值表示，int是0

        int[] newArr3 = Arrays.copyOfRange(arr, 6,10);//起点不能超过
        System.out.println(Arrays.toString(newArr3)); // java.lang.ArrayIndexOutOfBoundsException
    }

    // 数组比较
    @Test
    public void test09(){
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,3,4,5,6};
        int[] arr3 = {1,2,3,4,5};

        System.out.println(Arrays.equals(arr1,arr2)); // false
        System.out.println(Arrays.equals(arr1,arr3)); // true
    }

    // 数组填充
    @Test
    public void test10(){
        int[] arr= new int[5];
        // 把所有元素填充为1
        Arrays.fill(arr,1);
        System.out.println(Arrays.toString(arr)); // [1, 1, 1, 1, 1]
    }
}
