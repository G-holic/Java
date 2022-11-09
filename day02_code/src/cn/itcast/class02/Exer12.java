package cn.itcast.class02;

public class Exer12 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 0;

        boolean flag = false;
        if (flag == true) { //条件不成立
            c = a++ + b; //不执行
        }

        if (flag == false) { //条件成立
            c = ++a - b; //执行
            /*
			(1)++a，a先自增为2，取2
			(2)减法 2-2=0
			(3)赋值  0
			*/
        }

        System.out.println("a = " + a); // 2
        System.out.println("b = " + b); // 2
        System.out.println("c = " + c); // 0
    }
}
