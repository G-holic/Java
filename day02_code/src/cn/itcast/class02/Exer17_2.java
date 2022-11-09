package cn.itcast.class02;

public class Exer17_2 {
    public static void main(String[] args) {
        int m = 1;
        int n = 2;

        System.out.println("交换之前：");
        System.out.println("m = " + m);
        System.out.println("n = " + n);

        /*
		方式二：使用按位异或运算符
		整数类型可以
		按位异或 找不同的
		*/
        m = m ^ n; // m的新值 = 旧的m ^ 旧的n
        n = m ^ n; // n的新值 = m的新值 ^ 旧的n = 旧的m ^ 旧的n ^ 旧的n = 旧的m;
        m = m ^ n; //m的更新值 = m的新值 ^ 新的n = 旧的m ^ 旧的n ^ 旧的m = 旧的n;

        System.out.println("交换之后：");
        System.out.println("m = " + m);
        System.out.println("n = " + n);
    }
}
