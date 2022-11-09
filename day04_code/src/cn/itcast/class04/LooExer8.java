package cn.itcast.class04;

/*
8、一个数如果恰好等于它的因子之和，这个数就称为"完数"。（因子：除去这个数本身的约数）
例如6=1＋2＋3.编程 找出1000以内的所有完数
 */
public class LooExer8 {
    public static void main(String[] args) {
//        int sum = 0;//如果定义在这里，sum累加的是所有数的因子
        //找出1000以内的所有完数
        for (int i = 1; i < 1000; i++) {
            //判断i是否是完数，如果是，就打印i
            /*
            如何找i是完数的证据？
            (1)在[1, i-1]范围内找出i的所有因子，累加起来
            (2)判断这些因子之后是否等于i
             */
            int sum = 0;//在这里，每一个i的因子之和都从0开始累加
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (i == sum) {
                System.out.println("i = " + i);
            }
        }

    }
}
