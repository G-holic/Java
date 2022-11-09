package cn.itcast.class02;
/*

4、条件运算符
条件表达式 ? 结果表达式1 : 结果表达式2

条件表达式如果为true，整个条件运算符的表达式取结果表达式1的值，否则取表达式2的值。
*/

public class ConditionOperator {
    public static void main(String[] args) {
        //判断两个变量a,b谁大，把大的变量赋值给max
        int a = 1;
        int b = 2;
        int max = a > b ? a : b;
        //如果a>=b成立，就取a的值赋给max，否则取b的值赋给max
        System.out.println(max);

        boolean marry = true;
        System.out.println(marry ? "已婚":"未婚");

    }
}
