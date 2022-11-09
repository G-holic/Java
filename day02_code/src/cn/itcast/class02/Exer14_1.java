package cn.itcast.class02;

public class Exer14_1 {

    public static void main(String[] args) {
        int x = 1;
        int y = 1;

        /*
		(1)x++，先取x的值1，放到操作数栈中，x自增为2
		(2)判断==  1==2，不成立,false
		(3)&不发生短路
		(4)++y，y先自增为2，然后取2
		(5)判断== 2==2，成立，true
		(6)&  false & true，结果是false
		*/
        if (x++ == 2 & ++y == 2) { //if(false)不成立
            x = 7; //不执行
        }
        System.out.println("x = " + x + ",y =" + y); // x = 2 // y = 2
    }


}
