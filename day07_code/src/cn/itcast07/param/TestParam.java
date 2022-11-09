package cn.itcast07.param;

/*
参数：
1、形参：在“声明”方法时，()中声明的变量，每调用这个方法之前，它的值是不确定的。
例如：
    public int max(int a, int b){  //(int a,int b)是形参，它就是一个占位符，形式。
        return a>b ?a:b;
    }

    形参代表未知的数据，需要调用者传入实际的数据，它才有意义。
    定义形参，就是为了让方法体的代码顺利编写，否则无法描述这个未知的数据。
2、实参：在“调用”方法时，()中传入的数据，这个数据可能是常量值，也可能是变量，还可能是表达式

3、形参和实参的关系
（1）实参给形参赋值，实参会把值复制给形参
（2）实参的类型、个数必须和形参一一对应


 */
public class TestParam {
    public int max(int a, int b) {  //(int a,int b)是形参，它就是一个占位符，形式。
        return a > b ? a : b;
    }

    public int biggest(int a, int b, int c) {//找三个整数的最大值，形参(int a, int b ,int c)
        return max(max(a, b), c);
        //第一次调用max方法，a,b是实参
        //第二次调用max方法， max(a,b)的返回值是实参之一，c是另一个实参
    }

    public static void main(String[] args) {
        TestParam t = new TestParam();

        System.out.println(t.max(4, 6));//(4,6)是实参，4,6是常量，它给(int a, int b)两个形参赋值

        int x = 5;
        int y = 7;
        System.out.println(t.max(x, y));//(x,y)是实参，x,y是变量，它用x,y中的值给(int a, int b)两个形参赋值

        int z = 4;
        //比较x和y，z的最大值
        System.out.println(t.biggest(x, y, z));
    }
}
