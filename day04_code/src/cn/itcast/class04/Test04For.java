package cn.itcast.class04;
/*
for循环的语法结构：
for(循环变量初始化表达式; 循环条件表达式; 迭代表达式){
    循环体语句块
}

要求：
（1）for(;;)两个分号不能多也不能少。
（2）循环条件表达式必须是boolean，如果两个;;中的循环条件表达式省略，表示条件永远成立，
如果循环体中没有break等结束循环，那么该循环就成了死循环。

执行特点：
（1）循环变量初始化表达式;
（2）判断循环条件，如果循环条件表达式为true，就执行（3），否则就结束循环
（3）执行循环体语句块
（4）执行迭代表达式
（5）回到（2）
 */

public class Test04For {
    public static void main(String[] args) {

//        for (;;){ // 重复执行，死循环
//            System.out.println("李四");
//        }

/*        for (int i = 1; i <= 5; i++) {
            System.out.println("我爱尚硅谷" + i);
        }
        System.out.println("i = " + i);//错误，i超过它的作用域*/

        /*
        (1)int i=1;
        (2) i<=5;成立
        (3)执行循环体语句 System.out.println("我爱尚硅谷");
        (4)执行迭代表达式  i++(i=2)  ，这里写i++或++i或i=i+1或i+=1都可以
        (5)i<=5;成立
        (6)执行循环体语句 System.out.println("我爱尚硅谷");
        (7)行迭代表达式  i++(i=3)
        (8)....
         */

        int i;
        for (i = 1; i<=5; i++){
            System.out.println("我爱尚硅谷" + i);
        }
        System.out.println("i = " + i);


    }
}
