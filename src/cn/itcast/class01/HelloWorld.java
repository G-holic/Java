package cn.itcast.class01;
/*
Java程序的开发步骤：
1、编写代码
注意：
（1）代码的结构
类{
	方法{
		语句;
	}
}
（2）必须把代码文件保存为xx.java
.java称为后缀名，或扩展名，它是代表文件的类型
文件名建议和类名一样，例如：HelloWorld.java

2、编译
(1)编译工具：javac.exe
(2)使用格式
javac xx.java

例如：
javac HelloWorld.java
(3)编译的结果：生成了xx.class文件，称为字节码文件


3、运行
（1）工具：java.exe
（2）格式
java 主类名

主类名：包含main方法的类名

说明：
关注大小写
关注格式
关注标点符号，必须是英文半角输入

*/
public class HelloWorld {//class代表类，HelloWorld是类名
    //方法，它是最特殊的一个方法，叫做主方法，main方法
    //它是Java程序的入口
    //格式是固定的：public static void main(String[] args){}
    public static void main(String[] args){
        //语句
        //输出""中的hello java
        System.out.println("hello java");
    }

}
