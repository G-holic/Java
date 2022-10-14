package cn.itcast.class01;
/*
变量：
	在程序运行期间，可以改变的量

如何声明变量？
	数据类型 变量名;

如何给变量赋值？
	变量名 = 变量值;

变量的使用有这些要求：
（1）变量必须先声明后使用
（2）变量在使用之前必须初始化
（3）变量值的类型必须与变量声明的类型一致或者兼容

一致：一样
int age = 18;  18是int类型的常量值，age也是int类型
兼容：可以装的下，=右边的值要 小于等于 =左边的变量类型
long bigNum =18; 18是int类型的常量值，bigNum是long类型

int age = 18L; 错误  18L是long类型的常量值，age是int类型
long > int

（4）变量有作用域
（5）同一个作用域中不能重复声明

变量的本质：代表内存（JVM中的内存）中的一块存储区域

变量三要素：
（1）数据类型：决定这块内存有多大，可以存什么数据
（2）变量名：给这块区域命名，就好比咱们这里叫做“宏福科技园”
（3）变量值：这块内存中真正的值

*/
public class Variable {
    public static void main(String[] args) {
        //声明一个变量，用来存储年龄
        int age = 18;
        System.out.println(age);

        /*
		for(int i=0; i<=10; i++){
			System.out.println(i);
		}
		*/

        //int age = 19;//错误，重复声明
        age = 19;
        System.out.println(age);

        age = (int)(Math.random()*100);
        System.out.println(age);
    }
    /*
	public static void method(){
		System.out.println(age);
	}*/
}
