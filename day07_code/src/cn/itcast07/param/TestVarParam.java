package cn.itcast07.param;
/*
1、可变参数：
参数：形参和实参
可变：实参的个数可变

2、可变参数的语法格式
数据类型... 参数名

3、要求
（1）每一个方法，最多只能有一个可变参数
（2）可变参数必须是方法的最后一个参数

4、如何使用可变参数
（1）在声明可变参数的方法中，把它当数组中即可
（2)在调用包含可变参数的方法时，可变参数对应的实参可以传入
A：对应类型的数组
B：对应类型的0~n个元素

案例：写一个方法可以求n个整数的和
 */
public class TestVarParam {
    public static void main(String[] args) {
        MathTools t = new MathTools();
        // 求三个整数的和， 1，2，3
        int[] arr = {1,2,3};
        t.sum(arr);
        System.out.println(t.sum(arr));
        System.out.println(t.sum(1,2,3));

        //求5个整数的和,1,2,3,4,5
        System.out.println(t.sum(new int[]{1,2,3,4,5}));
        System.out.println(t.sum(1,2,3,4,5));

        //求0个整数的和
        System.out.println(t.sum(new int[0]));//长度为0的数组
        System.out.println(t.sum());

        System.out.println("=======================");

        StringTools tools = new StringTools();
        System.out.println("没有字符串： "+tools.concat('-'));
        System.out.println("3个字符串： "+tools.concat('-',"hello","world","李四"));

    }
}
