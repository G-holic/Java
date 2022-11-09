package cn.itcast.class03;

import java.util.Scanner;

/*
控制台键盘输入：
1、先声明一个Scanner类型的变量，并赋值一个对象
Scanner：是一个文本扫描仪类型，它的全名称是java.util.Scanner，它是核心类库中定义好的，可以直接用
Scanner是一个类，不是基本数据类型，是引用数据类型，所以必须给它赋值一个“对象”。

2、建议大家写，提示用户输入xx
不写不会错，不够“友好”

3、从控制台接收用户数的一个xx数据，并且赋值给合适的变量
int 变量 = input.nextInt();  //input是Scanner类型的变量，上面叫什么名，下面就用什么名
double 变量 = input.nextDouble();
long 变量 = input.nextLong();
boolean 变量 = input.nextBoolean();
String 变量 = input.next();
char 变量 = input.next().charAt(0);

如果要接收数据的变量的数据类型和用户输入的数据的数据类型不符合，会报 InputMisMatchException输入不匹配错误

4、关闭IO流
 */
public class TestInput {
    public static void main(String[] args) {
        //全名称使用法
//        java.util.Scanner input = new java.util.Scanner(System.in);

        Scanner input = new Scanner(System.in);
        //这句代码唯一可以改的是input，它是一个变量名

        System.out.println("请输入一个整数： "); //先执行，先显示这句话
        int num = input.nextInt(); //接收键盘输入， 它们有顺序要求
        System.out.println("num = " + num);

        System.out.println("请输入一个小数： ");
        double d = input.nextDouble();
        System.out.println("d = " + d);

        System.out.println("请输入一个布尔值： ");
        boolean b = input.nextBoolean();
        System.out.println("b = " + b);

        System.out.println("请输入一个大整数： ");
        long big = input.nextLong();
        System.out.println("big = " + big);

        System.out.println("请输入单个字符： ");
        char c = input.next().charAt(0);
        /*
        input.next()：接收一个字符串，很多个字符
        input.next().charAt(0)：表示从多个字符中取1个字符，取第1个

        charAt(0）：表示取一个字符串的第1个
        charAt(1）：表示取一个字符串的第2个
        charAt(2）：表示取一个字符串的第3个
        ...
        如果输入的字符串的个数少于你要获取的位置，就报错StringIndexOutOfBoundsException字符串下标越界
         */
        System.out.println("c = " + c);

        input.close();//建议大家记得它，代码没有错误，但是会造成JVM以外的操作系统相关内存没有得到释放


    }
}
