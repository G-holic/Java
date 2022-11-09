package cn.itcast07.method;

/*
（1）调用返回值类型是void的方法，只能单独把方法调用表达式加;成一个语句。
既不能放到System.out.println()中，也不能用变量接收。

（2）如果被调用的方法，没有参数，那么只要写()就可以，
    但是如果被调用的方法，有参数，那么必须传入对应类型、个数的数据，称为实参。

 （3）调用返回值类型不是void的方法，
 A：可以把方法调用表达式加;成一个语句，只是这样的话，返回值就丢了
 B：可以把方法调用表达式赋值给一个变量或直接输出
 */
public class TestMethodTools {
    public static void main(String[] args) {
        //1、先创建对象
        MethodTools tools = new MethodTools();
        //2、调用无参无返回值的方法
        tools.sysHello();
//        System.out.println(tools.sysHello());
        //编译报错，因为sayHello()没有结果返回，那么你让println方法打印什么呢？
//        String str = tools.sysHello();
        //编译报错，因为sayHello()没有结果返回，不能用变量接收返回值

        //3、调用有参无返回值
        tools.printRectangle(4, 4, 'a');
        tools.printRectangle(5, 3, '%');

        //4、调用无参有返回值
        tools.getNumberLessThanHundred();// 返回值丢失了
        int num = tools.getNumberLessThanHundred(); // 用int变量接受返回值
        System.out.println("num = " + num);

        System.out.println(tools.getNumberLessThanHundred()); // 直接输出返回值

        //5、调用有参有返回值
        tools.max(4, 6);// 返回值丢了，语法正确
        int max = tools.max(4, 8);
        System.out.println("max = " + max);

        System.out.println("8和9的最大值是多少：" + tools.max(8, 9));

    }

}
