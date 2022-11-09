package cn.itcast.class04;

/*
循环的嵌套：
    在一个循环的循环体中，又出现了另一个循环结构。
    for、while、do...while三者之间完全可以互相嵌套。
    接下来大家见到最多的for-for

执行特点：外循环循环一次，内循环要循环一轮。
 */
public class TestForFor {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        /*
        (1)外循环int i=1;
        (2)外循环i<=5;
        (3)外循环的循环体     外循环的第一次循环体执行
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();

            内循环循环要执行一轮：
            (1-1)内循环int j=1;
            (1-2)内循环j<=i;
            (1-3)内循环的循环体
                 System.out.print(j);  输出1
            (1-4)j++   j=2
            (1-5)内循环j<=i;  条件不成立，结束内循环第一轮

            System.out.println();换行
         （4）外循环i++  i=2
         （5）外循环 i<=5;
         （6）外循环的循环体     外循环的第二次循环体执行
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();

            内循环循环要执行第二轮：
            (1-1)内循环int j=1;
            (1-2)内循环j<=i;
            (1-3)内循环的循环体
                 System.out.print(j);  输出1
            (1-4)j++   j=2
            (1-5)内循环j<=i;
            (1-6)执行内循环第二轮第二次
                   System.out.print(j);  输出2
            (1-7)j++   j=3
            (1-8)内循环j<=i;   不成立，结束内循环的第二轮

            System.out.println();换行

          （7）外循环i++ i=3
          ....
         */
    }
}
