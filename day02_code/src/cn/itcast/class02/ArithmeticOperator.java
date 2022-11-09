package cn.itcast.class02;

/*
1、算术运算符：
加：+
	如果有String参与，+就变成了拼接。
	其他情况表示求和。
减：-
乘：*
除：/
	如果是整数相除，结果只有整数部分。
	如果是整数相除，除数为0，会发生ArithmeticException算术异常
	如果是小数相除，除数为0，得到Infinity（无穷大）
模/取余：%
	模的结果，正负号只看被除数/被模数。
	如果是整数取模，除数为0，会发生ArithmeticException算术异常
	如果是小数取模，除数为0，得到NaN(Not a Number非数字)

正号：+
负号：-

自增：++
	自增变量加1
自减：--
	自增变量减1

	如果自增、自减表达式是独立的，直接加;成语句，那么++/--在前在后没有区别。
	如果自增、自减表达式是其他计算的一部分，那么++/--在前在后有区别。
		以自增为例
		++在前，自增变量先自增1，然后取出自增变量的值进行其他运算
		++在后，先取出自增变量的值，放在操作数栈（临时存储地方），然后自增变量自增1，取放在操作数栈中值进行其他计算

Arithmetic：算术
Operator：运算符

*/
public class ArithmeticOperator {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        System.out.println(x / y);//0

//        System.out.println(x/0);//java.lang.ArithmeticException: / by zero
        System.out.println(1.0 / 0.0); //Infinity 无穷大
        System.out.println("------------------------");

        System.out.println(5 % 2);//1
        System.out.println(2 % 5);//2
        System.out.println("------------------------");

        System.out.println(5 % 2);//1
        System.out.println(5 % -2);//1 商-2，余数1
        System.out.println(-5 % 2);//-1 商-2，余数是-1
        System.out.println(-5 % -2);//-1 商2，余数是-1
        //商*除数 + 余数 = 被除数

        System.out.println("------------------------");
        //System.out.println(5%0);java.lang.ArithmeticException: / by zero
        System.out.println(5.6%1.2);//0.7999999999999998 近似值
        System.out.println(5.6%0.0);//NaN

        System.out.println("------------------------");
        int a = -1;
        int b = +a;
        int c = -b;
        System.out.println(a);//-1
        System.out.println(b);//-1
        System.out.println(c);//+1

        System.out.println("------------------------");
        int i = 1;
        i++;
        System.out.println("i=" + i);//i=2
        ++i;
        System.out.println("i=" + i);//i=3

        System.out.println("------------------------");
        int j= 1;
        System.out.println(j++);//1
        /*
		（1）先取j的值，现在是1，放到操作数栈中
		（2）然后j自增，j=2
		（3）取操作数栈中的值，输出
		*/

        System.out.println(++j);//3
		/*
		（1）先对j自增，j=3
		（2）然后取j的值，放到操作数栈中
		（3）取操作数栈中的值，输出
		*/

        System.out.println("------------------------");
        int m = 1;
        m = ++m;
        System.out.println("m = " + m);//2
		/*
		说明：赋值是最后算的
		先算右边 ++m
		(1)先对m进行自增，m =2
		(2)取出m的值，放到操作数栈中
		(3)把操作数栈中值又重新赋值给m
		*/

        m = m++;
        System.out.println("m = " + m);//2
		/*
		说明：赋值是最后算的
		先算右边 m++
		(1)先取出m的值 2，放到操作数栈中
		(2)紧接着对m进行自增，m = 3
		(3)把操作数栈中值2 又重新赋值给m
		*/

    }
}
