package cn.itcast.class01;
/*
中文问题：
1、如果xx.java文件的编码是UTF-8，你有不想改文件的编码
怎么让它编译通过
javac -encoding UTF-8 Problem1.java

2、修改xx.java源文件的编码
notepad++软件的格式/编码菜单-->转为ANSI

ANSI:表示选择操作系统默认编码，中文操作系统，默认GBK

如果希望之后创建的.java默认都是ANSI，可以：
设置菜单-->首选项-->新建-->右边编码
*/
public class Problem1 {
    public static void main(String[] args){
        System.out.println("李四");
    }
}
