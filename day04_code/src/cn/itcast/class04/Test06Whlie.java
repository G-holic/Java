package cn.itcast.class04;

/*
 * 无论是哪一种循环，for,while,do...while，它们都能够实现“重复执行xx代码”的目标，
 * 也就是说它们完全可以互换。
 *
 * 1、语法结构
 * while(循环条件表达式){
 *    循环体语句块；
 * }
 *
 * 2、执行特点
 * （1）先判断循环条件表达式，如果条件成立就执行（2），否则就结束while循环
 * （2）执行循环体语句块
 * （3）回到（2）
 *
 * for和while有一个共同点：有可能第一次判断循环条件就不成立，循环体语句一次都不执行。
 * */
public class Test06Whlie {
    public static void main(String[] args) {
        // 输出五次 我是李四
        int i = 1;
        while (i <= 5) {
            System.out.println("我是李四");
            i++;
        }

        System.out.println("--------");
        int count = 1;
        while (true) {
            System.out.println("循环第" + count + "次");


            if (count == 5) {
                break;
            }
            count++;
        }
    }
}
