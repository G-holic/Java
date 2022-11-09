package cn.itcast.class04;

// 九九乘法表
public class LoopExer6 {
    public static void main(String[] args) {
        //这个结构实现9行
        /*for (int i = 1; i <= 9 ; i++) {
            System.out.println();//换行
        }*/

        for (int i = 1; i <= 9; i++) {
            //每一行在换行之前，要输出i个式子
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + (i * j) + "\t");
            }
            System.out.println(); //换行
        }
    }
}
