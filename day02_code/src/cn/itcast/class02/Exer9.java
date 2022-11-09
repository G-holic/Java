package cn.itcast.class02;

public class Exer9 {
    public static void main(String[] args) {
        int i = 1;
        int j = i++;
        /*
		(1)先取出i的值1，放到操作数栈中
		(2)i自增，i自增为2
		(3)把操作数栈中的1赋值给j

		j=1, i=2
		*/

        int k = i++ * ++j + --i * j--;
        // 2 * 2 + 2 * 2

        /*
		(1)i++
		先取i的值2，放到操作数栈中，紧接着i自增为3
		(2)++j
		j先自增为2，取j的值放到操作数栈中，
		(3)算*
		2*2=4

		(4)--i
		i先自减，i自减为2，取i的值2放到操作数栈中，
		(5)j--
		先取j的值2放到操作数栈中，j自减为1
		(6)算*
		2*2=4

		(7)算+
		4+4 = 8

		（8）赋值给k
		*/
        System.out.println("i = " + i); // 2
        System.out.println("j = " + j); // 1
        System.out.println("k = " + k); // 8

    }
}

