package cn.itcast.homework;

/*
 *1、5个一行输出1-100之间的偶数
 *输出1-100偶数，每5个一行，一行中的每个数字之间使用逗号分隔
 * */
public class Home_Work_1 {
    public static void main(String[] args) {
//        for (int i = 2; i <= 100; i+=2) {
//            if (i % 10 != 0) {
//                System.out.print(i+",");
//            }else {
//                System.out.println(i);
//            }
//        }
        int count = 0;

        for (int i = 2; i <= 100; i += 2) {
            count++;
            if (count < 5) {
                System.out.print(i + ",");
            } else {
                System.out.println(i);
                count = 0; // 重置 变量
            }
        }
    }
}
