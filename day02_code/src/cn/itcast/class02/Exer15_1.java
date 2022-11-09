package cn.itcast.class02;
// 面试题反馈
public class Exer15_1 {
    public static void main(String[] args) {
        boolean x = true;
        boolean y = false;
        short z = 42;

//        if ((z++ == 42) && (y == true)) z++;
//        if ((x = false) || (++z == 45)) z++;
        /*
		(1)z++，先取z的值42，放到操作数栈，z自增为43
		(2)判断==  42==42结果是true
		(3)&&，左边是true，右边继续看，没有满足短路的条件
		(4) y==true，不成立false
		(5)算&& true && false，结果是false
		*/
        if((z++==42)&&(y==true)){//if(false)不成立
            z++;//不执行
        }
        /*
		(1)x=false这是赋值，整个表达式结果是false
		(2)|| 左边是false,右边继续看，没有满足短路的条件
		(3)++z，z先自增为44，然后取44
		(4)判断==  44==45不成立false
		(5)false || false，结果是false
		*/
        if((x=false) || (++z==45)){//if(false)
            z++;//不执行
        }

        System.out.println("z = " + z); // 44
    }
}
