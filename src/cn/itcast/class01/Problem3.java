package cn.itcast.class01;
/*
问题：xx.java源文件名 和 代码中class后面的类名是否一定要一样？
编译：javac Problem3.java
运行：java WenTi3

结论：
	如果class不是public的，那么xx.java源文件名可以和类名不一样
	如果class是public的，那么xx.java源文件名必须和类名一样

建议：都保持一致
*/
public class Problem3 {
    public static void main(String[] args){
        System.out.println("文件名和类名是否一致问题");
    }
}
