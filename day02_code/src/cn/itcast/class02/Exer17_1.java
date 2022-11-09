package cn.itcast.class02;

public class Exer17_1 {
    public static void main(String[] args) {
        int m = 1;
        int n = 2;

        System.out.println("交换之前：");
        System.out.println("m = " + m);
        System.out.println("n = " + n);
        /*
		方式一：必须掌握，最通用，无论是那种类型的变量都可以
		借助第三个变量交换法。
		*/
        int temp = m; // 把m的值备份到temp中
        m = n; //把n的值赋值给m，m的值被覆盖掉，因为备份了，所以覆盖没问题
        n = temp; //把备份的m值，放到了n中

        System.out.println("交换之后：");
        System.out.println("m = " + m);
        System.out.println("n = " + n);
    }
}
