package cn.itcast.class02;

public class Exer8 {
    public static void main(String[] args) {
        int i = 1;
        int j = i++;
        /*
		（1）先取i的值，放到操作数栈中
		（2）i自增，i=2
		（3）用操作数栈中1赋值给j

			j=1,i=2
		*/

        int k = i++ * ++j + ++i * j++;
        /*
		（1）i++
		先取i的值2，放到操作数栈中，紧接着i自增为3
		（2）++j
		j先自增为2，然后取j的值2放到操作数栈中，
		（3）算* ，取出操作数栈中2 和 2 相乘结果是4
		这个4重新放回操作数栈

		（4）++i
		i先自增为4，然后取i的值4放到操作数栈中，
		（5）j++
		先取j的值2到操作数栈中，紧接着j自增为3
		（6）算*，取出操作数栈中4 和 2 相乘结果是8
		这个8重新放回操作数栈

		（7）算+
		取出操作数栈中4 和 8 相加结果是12

		*/

        System.out.println("i = " + i); // 4
        System.out.println("j = " + j); // 3
        System.out.println("k = " + k); // 12
    }
}
