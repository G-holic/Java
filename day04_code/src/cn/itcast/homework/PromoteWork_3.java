package cn.itcast.homework;

/*
O*****O
*O***O*
**O*O**
***O***
**O*O**
*O***O*
O*****O

开发提示：

* 平面图形涉及到有行有列，考虑到嵌套for循环
* 一个外循环控制行，一个内循环控制输出内容
* 在内循环中，根据变量的变化规律，判断输出"O"还是"*"
* */
public class PromoteWork_3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {
            //(1)打印该行的*或o
			/*
			发现O+*的总个数是7个
			当i=1, 当j=1和j=7的时候是O，其余的是*
			当i=2, 当j=2和j=6的时候是O，其余的是*
			当i=3, 当j=3和j=5的时候是O，其余的是*
			当i=4, 当j=4的时候是O，其余的是*
			当i=5, 当j=5和j=3的时候是O，其余的是*
			当i=6, 当j=6和j=2的时候是O，其余的是*
			当i=7, 当j=7和j=1的时候是O，其余的是*
			*/

            for (int j = 1; j <= 7; j++) {
                if (i == j || j == 8 - i) {
                    System.out.print("O");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();

        }
    }
}
