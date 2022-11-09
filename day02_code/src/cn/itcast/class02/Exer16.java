package cn.itcast.class02;

public class Exer16 {
    public static void main(String[] args) {
        int a = 3;
        int b = 6;
        int c = 4;
        /*
		思路：
		（1）先把a和b中的最大值找出来，放到一个max变量中
		*/
        int max = a >= b ? a : b;
        //经过上面的运算，能够确定的是max中一定是a和b中较大者

		/*
		（2）确定max和c谁更大，更大的继续放在max中
		*/
        //int max = max >= c ? max : c;//如果max前面在加int，表示重复声明

        max = max >= c ? max : c;
        System.out.println("最大值是：" + max);
    }
}
