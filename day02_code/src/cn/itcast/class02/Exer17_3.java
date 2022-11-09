package cn.itcast.class02;

public class Exer17_3 {
    public static void main(String[] args) {
        int m = 1;
        int n = 2;

        System.out.println("交换之前：");
        System.out.println("m = " + m);
        System.out.println("n = " + n);
		/*
		方式三：先求和再减
		有风险：当m和n的值比较大，会溢出，数据就错误
		m+n超过int范围就有问题。
		*/
        m = m + n; // 新的m = 旧的m + 旧的n
        n = m - n; // 新的n = 新的m - 旧的n = 旧的m + 旧的n - 旧的n = 旧的m
        m = m - n; // 更新的m =新的m -新的n = 旧的m + 旧的n - 旧的m = 旧的n

        System.out.println("交换之后：");
        System.out.println("m = " + m);
        System.out.println("n = " + n);
    }
}
