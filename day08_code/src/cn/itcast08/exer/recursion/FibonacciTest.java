package cn.itcast08.exer.recursion;

/*
案例：已知斐波那契数列（Fibonacci），1,1,2,3,5,8,13,21,....斐波那契数列满足如下规律，
即从第三个数开始，一个数等于前两个数之和。f(n) = f(n-2) + f(n-1);
计算斐波那契数列（Fibonacci）的第n个值，
 */
public class FibonacciTest {
    public static void main(String[] args) {
        FibonacciTest t = new FibonacciTest();
        // 创建FibonacciTest的对象，目的是为了调用f方法
        for (int i = 1; i <=10; i++) {
            System.out.println("斐波那契数列第" + i + "个数" + t.f(i));
        }
        System.out.println(t.f(20));// 6765

        for (int i = 1; i <=10; i++) {
            System.out.println("斐波那契数列第" + i + "个数" + t.fValue(i));
        }
        System.out.println(t.fValue(20));//6765
    }

    // 不用递归的写法
    int fValue(int n) {
        if (n < 1) {//负数是返回特殊值1，表示不计算负数情况
            return 1;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        // 从第三个数开始， 等于前两个整数相加
        int beforeBefore = 1;// 相当于n=1的值
        int before = 1;// 相当于n=2的值
        int current = beforeBefore + before;// 相当于n=3的值
        // 再往后
        for (int i = 4; i <= n; i++) {
            beforeBefore = before;
            before = current;
            current = before + beforeBefore;
            /*
            假设i=4
                beforeBefore = before; //相当于n=2时的值
                before = current; //相当于n=3的值
                current = beforeBefore + before; //相当于n = 4的值
            假设i=5
                beforeBefore = before; //相当于n=3的值
                before = current; //相当于n = 4的值
                current = beforeBefore + before; //相当于n = 5的值
                ....
             */
        }
        return current;

    }


    // 使用递归的写法
    int f(int n) {//计算斐波那契数列第n个值是多少
        if (n < 1) {//负数是返回特殊值1，表示不计算负数情况
            return 1;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        return f(n - 2) + f(n - 1);
    }
}
