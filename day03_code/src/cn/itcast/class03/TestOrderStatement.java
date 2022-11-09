package cn.itcast.class03;
/*
顺序结构：
1、从上往下依次执行
2、上面的计算对下面有影响，特殊赋值操作
 */
public class TestOrderStatement {
    public static void main(String[] args) {
        int a = 1;
        System.out.println("a = " + a);
        int b =  2;
        System.out.println("b = " + b);
        a++;
        System.out.println("a = " + a);
        a++;
        System.out.println("a = " + a);
    }
}
