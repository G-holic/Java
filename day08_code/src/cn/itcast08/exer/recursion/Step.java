package cn.itcast08.exer.recursion;

/*
有n级台阶，一次只能上1步或2步，共有多少种走法？
当n=1，总共只有1级台阶，那么只有1种走法，是1
当n=2，总共只有2级台阶，那么有2种走法，分别是1,1  和 2
当n=3，总共只有3级台阶，那么有3种走法，分别是1,1,1  , 2,1和 1,2
当n=4，总共只有4级台阶，那么有5种走法，分别是1,1,1,1  和 1,2,1 、 2,1,1 ，  1,1,2和2,2
。。。。
规律：
    看最后一步，要么从n-1级台阶上跨1级到第n级台阶，要么从n-2级台阶上跨2级到第n级台阶。
    至于前面怎么上到n-1级和n-2级的，咱们不管。
    假设f(n)是表示走到第n级台阶的总走法
    f(n) = f(n-1) + f(n-2)
 */
public class Step {
    public static void main(String[] args) {
        Step s = new Step();//创建对象的目的是为了调用f方法
        for (int i = 1; i <= 10; i++) {
            System.out.println("第" + i + "级台阶一共有" + s.f(i));
        }
        System.out.println("===============");
        for (int i = 1; i <= 10; i++) {
            System.out.println("第" + i + "级台阶一共有" + s.stepTotal(i));
        }
    }

    // 使用递归
    int f(int n) {
        if (n < 1) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return n;
        }
        return f(n - 1) + f(n - 2);
    }

    // 不使用递归
    int stepTotal(int n) {
        if (n < 1) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return n;
        }
        // 计算n=3的情况
        int lastTwo = 1;// 相当于n=1级台阶，从它上面跨2级直接上到第3级台阶
        int lastOne = 2;// 相当于n=2级台阶，从它上面跨1级直接上到第3级台阶
        // 这里的2是代表之前上到n=2这级台阶一共有2种走法
        int total = lastTwo + lastOne; //相当于n=3级台阶的总走法
        //计算n=4以及更大的
        for (int i = 4; i <= n; i++) {
            lastTwo = lastOne;
            lastOne = total;
            total = lastOne + lastTwo;
            /*
            假设n=4
                lastTwo = lastOne;  //相当于n=2级台阶，从它上面跨2级直接上到第4级台阶
                lastOne = total;//相当于n=3级台阶的总走法，从它上面跨1级上到第4级台阶
                total = lastTwo + lastOne;//相当与n=4级台阶的总走法
             假设n=5
                lastTwo = lastOne;  //相当于n=3级台阶的总走法，从它上面跨2级上到第5级台阶
                lastOne = total;//相当与n=4级台阶的总走法，从它上面跨1级上到第5级台阶
                total = lastTwo + lastOne;//相当与n=5级台阶的总走法
             */
        }
        return total;
    }
}
