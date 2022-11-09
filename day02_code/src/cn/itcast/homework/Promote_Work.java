package cn.itcast.homework;

// 如下代码的运算结果是：
public class Promote_Work {
    public static void main(String[] args) {
        int i = 1;
        i *= 0.2;
        i++;
        System.out.println("i=" + i); // 1 整
        System.out.println("-------------");


        int h = 2;
        h *= h++;

        int j = 2;
        j *= j + 1;

        int k = 2;
        k *= ++k;

        System.out.println("h=" + h); // 4
        System.out.println("j=" + j); // 6
        System.out.println("k=" + k); // 6
        System.out.println("-------------");

        int a = 3;
        int b = 1;
        if (a == b) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal"); // Not Equal
        }
        System.out.println("-------------");

        int x = 8, y = 3;
        System.out.println(x >>> y); // 1
        System.out.println(x >>> y | 2); // 3

//        如何用最有效的的方法计算2乘以8
        System.out.println(2 << 3);

    }
}
