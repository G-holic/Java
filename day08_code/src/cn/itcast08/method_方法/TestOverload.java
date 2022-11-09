package cn.itcast08.method_方法;

/*
1、方法的重载（Overload）：当一个类中出现了 方法名相同，形参列表不同的两个或多个方法，称为方法的重载。
关键词：（1）方法名相同，（2）形参列表不同

方法名：代表方法的功能，见名知意
如果多个方法，它们的功能是一样的，只是针对的数据不同，通常需要用方法的重载。

例如：
（1）定义方法求两个整数的最大值
（2）定义方法求三个整数的最大值
（3）定义方法求两个小数的最大值
（4）定义方法求n个整数最大值
分析：求最大值，方法名可以写成max，但是这些方法针对的数据不同，有两个整数，两个小数的，更多个整数的...

2、当调用重载的方法时，原则
（1）先找最匹配的
实参的个数和类型与形参的个数和类型一样的。
（2）再找能够兼容的
形参的类型可以兼容实参的类型（自动类型提升）
或
形参的个数可以兼容实参的个数（可变参数）
(3)如果最匹配的没有，兼容的也没有，就编译报错
如果匹配的多个可以兼容的方法，也会编译报错

 */
public class TestOverload {
    public static void main(String[] args) {
        TestOverload t = new TestOverload();

        System.out.println(t.max(4, 5));
        System.out.println(t.max(4.5, 5.3));
        System.out.println(t.max(4, 5, 8));
        System.out.println(t.max(4, 5, 8, 8, 9));

        System.out.println("====================");
        System.out.println(t.max(5,2.3)); // max(double a, double b)  形参double a兼容int类型的5

        System.out.println("====================");
//        System.out.println(t.max(1.2,2.4,5.6,8.7)); // 编译报错
        /*
        个数上，只有int max (int... nums)可以接收它
        但是它的类型又无法接收  double > int类型，不能兼容
         */
    }

    //求两个整数的最大值
    int max(int a, int b) {
        System.out.println("TestOverload.max(int a,int b)");
        return a > b ? a : b;
    }

    //求三个整数的最大值
    int max(int a, int b, int c) {
        System.out.println("TestOverload.max(int a,int b, int c)");
        /*int big = a > b ? a : b;
        big = big > c ? big : c;
        return big;*/
        return max(max(a, b), c);
    }

    //求两个小数的最大值
    double max(double a, double b) {
        System.out.println("TestOverload.max(double a, double b)");
        return a > b ? a : b;
    }

    //求n个整数最大值
    int max(int... nums) {
        System.out.println("TestOverload.max(int... nums)");
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            max = max(max, nums[i]); // 这种方法更不好，每次调用max都会开辟一片内存空间占用资源

        }
        return max;
        /*int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] > max){
                max = nums[i];
            }
        }
        return max;*/
    }

    //    int max(int[] nums){//编译报错，因为此时编译器认为，int max(int[] nums)和int max (int... nums)一样的
//        int max = nums[0];
//        for (int i = 1; i < nums.length; i++) {
//            if(nums[i] > max){
//                max = nums[i];
//            }
//        }
//        return max;
//    }

    /*int max(int first, int... nums){
        int max = first;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > max){
                max = nums[i];
            }
        }
        return max;
    }*/
}
