package cn.itcast.class02;
/*
2、比较运算符/关系运算符
大于：>
小于：<
大于等于：>=
小于等于：<=
等于：==
不等于：!=

Compare：比较
Operator：运算符

注意：
（1）比较运算符计算的结果只有两种：true/false
所以比较表达式通常都是作为判断条件来使用

（2）等于 ==是表示判断， =是表示赋值，容易混淆
*/
public class CompareOperator {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        System.out.println(a < b); // true
        System.out.println(a > b); // false
        System.out.println(a == b); // false

        boolean flag = false;
//        System.out.println(flag = true); // true  = 是赋值，把true赋值给flag，然后显示它的值
        System.out.println(flag == true); // false

        if (flag == true){ // if(false): 表示条件不成立
            System.out.println("条件成立"); // 不打印
        }
        if (flag = true){ // 赋值 if(true)
            System.out.println("李四"); // 打印
        }

//        if (a = 1){ // //如果不小心写错了，编译报错  a = 1是赋值，结果是1，if(1)是错误的
//            System.out.println("李四");
//        }

    }

}
