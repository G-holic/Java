package cn.itcast.exer;

public class Exercise5 {
    static int i = 0;
    public static void main(String[] args) {
        System.out.println(test());//2
        System.out.println(i);//2
    }

    public static int test(){
        try{
            return ++i; //要执行（1）i会自增,i=1(2)并且加载i的值放到操作数栈中（3）执行finally
        }finally{
            return ++i;//(1)i会自增,i=2（2)并且加载i的值放到操作数栈中（3）结束当前方法，并返回操作数栈中2
//            ++i;
        }
    }
}
