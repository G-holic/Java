package cn.itcast.class02;

public class Exer10 {
    public static void main(String[] args){
        int i = 1;
        int j = ++i + i++ * ++i + i++;
        // 2 + 2 * 4 + 4
        /*
		（1）++i
		i先自增为2，取i的值，放到操作数栈
		（2）i++
		先取i的值2，放到操作数栈中，i自增为3
		（3）++i
		i先自增为4，取i的值，放到操作数栈
		（4）算*
		4*2=8，压回栈
		（5）算+
		2+8=10，压回栈
		（6）i++
		先取i的值4，放到操作数栈中，i自增为5
		（7）算+
		10+4=14
		（8）赋值给j
		*/
        System.out.println("i = " + i); // 5
        System.out.println("j = " + j); // 14
    }
}
