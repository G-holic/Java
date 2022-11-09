package cn.itcast.exam;
// 2、请判断以下程序的输出结果
public class Exam2 {
    public static void main(String[] args) {
        int i = 1;
        int j = 2;
        i += j++;
        /*
		i += j++; 等价于  i = i + j++;
		(1)先加载i的值1，放到操作数栈中
		(2)处理j++
		先取j的值2，放到操作数栈中，j自增为3
		(3)算加，
		用操作数栈中 1和2相加是3
		(4)赋值给i
		*/
        j = i++ / 2 + ++i * j--;
        // 3 / 2 + 5 * 3
        /*
		(1)i++
		先取i的值3，放到操作数栈中，i自增为4

		(2)算/
		3/2结果是1

		(3)++i
		i先自增为5，然后取i的值5放到操作数栈中，
		(4)j--
		先取j的值3，放到操作数栈中，j在自减为2
		(5)算*
		5*3=15

		(6)算加法
		用1+15=16
		(7)赋值给j
		*/
        System.out.println("i = " + i); // 5
        System.out.println("j = " + j); // 16
    }
}
