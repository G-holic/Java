package cn.itcast.class03;

/*
输出语句：
1、输出并换行
    System.out.println(内容);
  ()中只能写一个值，如果有多个值，必须用“+”拼接起来
    如果()中什么都没写，表示空行

2、输出不换行
    System.out.print(内容);
    ()中也只能写一个值，如果有多个值，必须用“+”拼接起来
    如果()中什么都没写，编译报错。
3、了解，格式化输出
    System.out.printf(内容,变量列表);
    内容中需要用占位符
    %d：整数
    %f：小数
    %.nf：小数点留n位
    %c：单字符
    %s：字符串
    %b：boolean
 */
public class TestOutput {
    public static void main(String[] args) {
        System.out.println("hello");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("world");

        System.out.print("java");
        System.out.print("c");
        System.out.print("c++");
//        System.out.print(); // 报错

        System.out.println("-----------");
        int num = 1;
        double d = 12.6838532;
        char c = 'a';
        String str = "李四";
        //格式化输出，输出不同的数据类型，并且小数显示小数点后两位
        System.out.printf("num=%d,d=%.2f,c=%c,str=%s", num, d, c, str);

    }

}
