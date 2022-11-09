package cn.itcast.class02;

public class Exer13 {
    public static void main(String[] args){
        int a = 1;
        int b = 2;
        int c = 0;
        boolean flag = false;
        if(flag=true){ //=赋值，if(true)，同时修改了flag的值
            c = a++ + b;//执行
			/*
			(1)a++，先取a的值1，放到操作数栈中，a自增为2
			(2)算+，1+2=3
			(3)赋值 c=3
			*/
        }

        if(flag=false){//又是赋值，flag被赋值给false，if(false)不成立
            c = ++a - b;//不执行
        }
        System.out.println("a = " + a);//2
        System.out.println("b = " + b);//2
        System.out.println("c = " + c);//3
    }
}
