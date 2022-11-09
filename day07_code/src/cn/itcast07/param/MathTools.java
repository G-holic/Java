package cn.itcast07.param;

//案例：写一个方法可以求n个整数的和
public class MathTools {
    //    public int sum(int[] sums){ //  int[] sums 形参
//        int he =0;
//        for (int i = 0; i < sums.length; i++) {
//            he+=sums[i];
//        }
//        return he;
//    }
    public int sum(int... sums) { //  int[] sums 形参
        int he = 0;
        for (int i = 0; i < sums.length; i++) {
            he += sums[i];
        }
        return he;
    }
}
