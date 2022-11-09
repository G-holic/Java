package cn.itcast.class02;

public class Exer14_3 {
    public static void main(String[] args) {
        int x = 1;
        int y = 1;
        /*
		(1)x++，先取x的值1，放到操作数栈中，x自增为2
		(2)判断== 1==1成立，true
		(3)|不会短路，右边要看
		(4)++y，y先自增为2，再取2
		(5)判断==， 2==1，不成立false
		(6)算| true | false结果是true
		*/
        if (x++ == 1 | ++y == 1) { // if(true)成立
            x = 7; // 执行
        }
        System.out.println("x = " + x + ",y =" + y); // x = 7  y = 2
    }
}
