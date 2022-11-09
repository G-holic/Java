package cn.itcast.homework;
/*

## 4、打印空心菱形

        * 开发提示：

        * 平面图形涉及到有行有列，考虑到嵌套for循环
        * 一个外循环控制行，两个内循环控制输出内容
        * 一个内循环负责输出空格，另一个内循环输出"*"或空格

        *
      *   *
    *       *
  *           *
*               *
  *           *
    *       *
      *   *
        *

        */

public class PromoteWork_4 {
    public static void main(String[] args) {
        // 上半部分
        for (int i = 1; i <= 5; i++) {
            /*
            i=1 4个空格 j=4,3,2,1 j>=i
            i=2 3个空格 j=4,3,2
            i=3 2个空格 j=4,3
            i=4 1个空格 j=4
            当i=5,打印0个空格，j=4,让循环条件一次都不满足

            * */
            for (int j = 4; j >= i; j--) {
                System.out.print("  ");
            }
            /*
            i=1 1个* j=1
            i=2 3个* j=1，2，3
            i=3 5个* j=1，2，3，4，5
            i=4 7个* j=1，2，3，4，5，6，7
            i=5 9个* j=1，2，3，4，5，6，7，8，9
            j=2 * i - 1
             */
            for (int j=1;j<=2*i-1;j++){
                if (j==1||j==2*i-1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }

            }
                System.out.println();

        }
        // 下半部分
        for (int i = 1; i <= 4; i++) {
            /*
            i=1 1个空格 j=1
            i=2 1个空格 j=1,2
            i=3 1个空格 j=1,2,3
            i=4 1个空格 j=1,2,3,4
            j<=i
             */
            for (int j=1;j<=i;j++){
                System.out.print("  ");
            }
            /*
            i=1 7个* j=1,2,3,4,5,6,7
            i=2 5个* j=1,2,3,4,5
            i=3 3个* j=1,2,3
            i=4 1个* j=1
            j = 9 - 2 * i

             */
            for (int j=1;j<=9-2*i;j++){
                if (j==1||j==9-2*i){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
