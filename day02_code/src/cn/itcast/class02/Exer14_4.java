package cn.itcast.class02;

public class Exer14_4 {
    public static void main(String[] args) {
        int x = 1;
        int y = 1;
        /*
		(1)x++，先取x的值1，放到操作数栈中，x自增为2
		(2)判断== 1==1成立，true
		(3)||会发生短路，右边不看了
		*/
        if (x++ == 1 || ++y == 1) { // if(true || ?) if(true)成立
            x = 7; // 执行
        }
        System.out.println("x = " + x + ",y =" + y); // x = 7  y = 1
    }
}
