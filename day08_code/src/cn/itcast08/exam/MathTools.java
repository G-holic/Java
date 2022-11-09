package cn.itcast08.exam;

public class MathTools {
    int add(int a, int b) {
        return a + b;
    }
    int subtract(int a, int b){
        return a-b;
    }
    int abs(int a){
        if (a<0){
            return -a;
        }
        return a;
//        return a>=0?a:-a;
    }

}
