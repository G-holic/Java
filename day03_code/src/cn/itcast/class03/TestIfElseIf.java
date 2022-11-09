package cn.itcast.class03;

import java.util.Scanner;

/*
（三）多分支条件判断
1、语法格式：
if(条件表达式1){
    当条件表达式1为true时，要执行的语句块1；
}else if(条件表达式2){
    当条件表达式2为true时，要执行的语句块2；
}else if(条件表达式3){
    当条件表达式3为true时，要执行的语句块3；
}
....
else{
    当上面所有的条件表达式都不成立时，要执行的语句块n+1；
}

2、执行特点
（1）从上往下依次看if()条件，如果上面有一个条件成立了，下面的条件就不看了
（2）只有上面的条件不成立，才会看下面的条件

3、注意：
（1）if()中的值，不管是常量、变量、表达式，结果只能是true/false。
（2）{}中如果只有一个语句（可以是空语句，单语句，复合语句），{}允许省略。建议大家保留。
（3）else不可以单独使用，必须配合if使用
（4）当多个if条件表示的范围是“互斥/没有交集”时，顺序无所谓。
     当多个if条件表示的范围是“包含/重叠部分”是，小的范围在上面，大的范围在下面


成绩：合理的范围[0,100]
100分：输出满分
[80-99]：优秀
[70-79]：良好
[60-69]：及格
[0,59]：不及格

 */
public class TestIfElseIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("请输入成绩[0,100]： ");
        int score = input.nextInt();

        if (score < 0 || score > 100) {
            System.out.println("成绩输入有误");
        } else if (score == 100) {
            System.out.println("满分");
        } else if (score >= 80) {
            System.out.println("优秀");
        } else if (score >= 70) {
            System.out.println("良好");
        } else if (score >= 60) {
            System.out.println("及格");
        } else {
            System.out.println("不及格");
        }
    }

}
