package cn.itcast.class01;
/*
常量值：
	代码里面写死的，固定不变的。
	一目了然的值。
整数常量值：1	 或 1L
小数常量值：1.5	或 1.5F
单字符常量值：'a'
布尔型常量值：true,false
字符串常量值："hello"
*/
public class ConstantValue {
    public static void main(String[] args) {
        System.out.println(1);//识别为int
        System.out.println(1L);//识别为long，数字后面加L或l
        System.out.println(1.5);//识别为double
        System.out.println(1.5F);//识别为float类型，数字后面加F或f
        System.out.println('a');//识别为char类型，单引号
        System.out.println(true);//识别为boolean类型
        System.out.println(false);//识别为boolean类型
        System.out.println("HelloWorld");//识别为String类型，双引号
        System.out.println("1");//识别为String类型，双引号
    }
}
