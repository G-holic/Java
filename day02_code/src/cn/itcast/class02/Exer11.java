package cn.itcast.class02;

public class Exer11 {
    public static void main(String[] args) {
        int i = 0;
        int result = ++i / --i; // 1 / 0
        //java.lang.ArithmeticException:
		/*
		i先自增为1，取1
		i先自减为0，取0

		1/0
		*/
        System.out.println("result=" + result);
    }
}
