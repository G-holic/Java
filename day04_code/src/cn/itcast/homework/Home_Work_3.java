package cn.itcast.homework;

/*
3、实现输入如下任一个数字三角形
1
12
123
1234
12345

和

1
22
333
4444
55555

和

    1
   222
  33333
 4444444
555555555

*/
public class Home_Work_3 {
    public static void main(String[] args) {
        // 3.1
        for (int i = 0; i < 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        // 3、2
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println(

            );
        }

        // 3、3
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < 6 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

    }
}
