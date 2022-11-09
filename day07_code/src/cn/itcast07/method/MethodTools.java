package cn.itcast07.method;

/*
在MethodTools类中，定义四个方法分别：
（1）无参无返回值
（2）有参无返回值
（3）无参有返回值
（4）有参有返回值
 */
public class MethodTools {
    /**
     * 声明一个方法，功能，输出一句话：hello 李四
     */
    public void sysHello() {
        System.out.println("hello 李四");
    }

    /**
     * 声明一个方法，功能，输出line行，column列，由某字符组成的矩形图形
     */
    public void printRectangle(int line, int column, char sign) {
        for (int i = 1; i <= line; i++) {
            for (int j = 1; j <= column; j++) {
                System.out.print(sign);
            }
            System.out.println();
        }
    }

    /**
     * 声明一个方法，功能，可以随机返回[0,100)之间的一个整数
     */
    public int getNumberLessThanHundred() {
        int num = (int) (Math.random() * 100);
        return num;
    }

    /**
     * 声明一个方法，功能，可以求两个整数的最大值
     */
    public int max(int a, int b) {
        return a > b ? a : b;
    }
}
