package cn.itcast.class02;
/*
6、赋值运算符
基本赋值运算符：=
扩展赋值运算符：
+=
-=
*=
/=
%=
&=
|=
^=
>>=
<<=

注意：
（1）=左边必须是变量，不能是常量值，不能是表达式
（2）=右边的值（常量、变量、表达式）的类型必须<=左边变量的类型
（3）=永远是最后算的

（4）扩展的赋值运算符，当最后的赋值结果类型大于左边的变量类型时，会自动发生强制类型转换

所以扩展的赋值运算符可能发生溢出或损失精度。



*/
public class AssignOperator {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

//        a = b + 1;
//        b + 1 = a; // 报错 =左边只能写变量
        byte b1 = 127;
        byte b2 = 2;
        //b1 = b1 + b2; //b1+b2会自动升级为int  int>byte
        b1 += b2; //相当于 b1 = b1+b2 此时会把int强制转换为byte
        System.out.println(b1); // -127

        a *= a + b;
        //等价于 a = a * (a+b)
        System.out.println(a);// 3

    }
}
