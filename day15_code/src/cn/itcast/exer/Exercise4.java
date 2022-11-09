package cn.itcast.exer;

public class Exercise4 {
    public static void main(String[] args) {
        int test = test(3,5);
        System.out.println(test);//8
    }

    public static int test(int x, int y){
        int result = x;
        try{
            if(x<0 || y<0){//不满足
                return 0;//不执行
            }
            result = x + y;//执行 result=8
            return result;//return语句会（1）加载result变量的值，放到“操作数栈中”（2）执行finally（3）结束当前方法并返回操作数栈中的值
        }finally{
            System.out.println("test方法结束");
            result = x - y;//result = -2; 但是因为没有对result做其他计算，也没有return，result新的值不会被加载到“操作数栈中”
        }
    }
}
