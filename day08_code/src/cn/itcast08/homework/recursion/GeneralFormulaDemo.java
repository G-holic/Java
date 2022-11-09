package cn.itcast08.homework.recursion;
/*
* 通项公式如下：f(n)=n + (n-1) + (n-2) + .... + 1，
* 其中n是大于等于5并且小于10000的整数，例如：f(5) = 5 + 4 + 3 + 2 + 1，f(10) = 10 + 9 + 8 + 7+ 6 + 5 + 4 + 3 + 2 + 1，
* 请用递归的方式完成方法long f( int n)的方法体。
* */
public class GeneralFormulaDemo {
    public static void main(String[] args) {
        GeneralFormulaDemo demo = new GeneralFormulaDemo();
        System.out.println(demo.f(5));
    }

    long f(int n) {
        if (n < 1) {
            return -1;
        }
        if (n == 1) {
            return 1;
        }
        return n + f(n - 1);
    }
}
