package cn.itcast.class04;
/*
break：
    中断
    用于switch或循环。
    作用：结束本层循环或switch

continue：继续（了解）
    只能用于循环
    作用：提前结束本次循环，继续下一次循环的准备。
       continue跳过了本次循环剩下的循环体语句。
 */

public class Test10Continue {
    public static void main(String[] args) {
        for (int i = 1; 1 < 5; i++) {
            if (i == 3) {
                break;
            }
            System.out.println(i);
        }
        //上面的代码可以输出1和2

        System.out.println("------------------");
        for (int i = 1; i <= 5; i++) { //两层循环
            for (int j = 1; j <= 5; j++) {
                System.out.print(i);
                /*
                i=1,j=1 就break终止了，只输出1
                i=2,j=1,2 break终止了，只输出2,2
                ...
                 */
                if (j == i) {
//                    break;//在内循环中，只能结束每一轮的内循环
                    continue;
                }
            }
            System.out.println();
        }
    }

}
