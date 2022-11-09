package cn.itcast.class02;

public class Exer15_2 {
    public static void main(String[] args) {
        boolean x = true;
        boolean y = false;
        short z = 42;

        /*
		if(y=true)
		if((z++==42)&&(y==true))	z++;
		if((x=false) || (++z==45))  z++;*/

        //外面的条件，y=true赋值操作 结果if(true),并且y被修改为true
        if (y = true){
            /*
			(1)z++，先取z的值42，放到操作数栈中，然后z自增为43
			(2)判断== 42==42成立
			(3)&&，没有满足短路，右边继续
			(4)y==true，条件成立
			(5)&&  true && true，成立
			*/
            if ((z++ == 42) && (y == true)) { //if(true)
                z++; //执行 z = 44
            }
        }
        /*
		(1)x=false,虽然是赋值，false
		(2)|| ，没有满足短路，右边继续
		(3)++z，z先自增为45，取45
		(4)判断 45==45成立
		(5)||  false || true，结果为true
		*/
        if ((x = false) || (++z == 45)){ //if(true)
            z++; // 执行 z = 46
        }

        System.out.println("z = " + z); // 46
    }
}
