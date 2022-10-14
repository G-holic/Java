package cn.itcast.class01;
/*
大小写问题：
1、Java的代码中是严格区分大小写
2、xx.java文件的文件名是否区分大小写
对于window操作系统来说，文件名大小写都可以，
即javac 命令后面，文件名大小写都可以。
例如：当前代码的源文件  Problem2.java
编译的命令：javac problem2.java
可以找到

3、xx.class文件的文件名是否区分大小写？区别
因为xx.class文件的文件名是代表“类名”。
例如：当前代码的字节码文件  Problem2.class
运行的命令，必须是  java Problem2

建议大家，都区分。


*/
public class Problem2 {
    public static void main(String[] args){
        System.out.println("大小写问题");
    }
}
