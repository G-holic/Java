package cn.itcast.class04;

import java.util.Scanner;

public class Test01Switch {
    public static void main(String[] args) {
        // 根据指定的月份输出对应季节
        Scanner input = new Scanner(System.in);

        System.out.println("请输入月份值(1-12)： ");
        int month = input.nextInt();

        switch (month){ // 理由贯穿
            case 1:
            case 2:
            case 12:System.out.println("冬季");break;
            case 3:
            case 4:
            case 5:System.out.println("春季");break;
            case 6:
            case 7:
            case 8:System.out.println("夏季");break;
            case 9:
            case 10:
            case 11:System.out.println("秋季");break;
            default:
                System.out.println("输入有误");
        }

        //语法错误
/*        switch(month){
            case 1,2,12:
                System.out.println("冬季");break;
            case 3,4,5:
                System.out.println("春季");break;
            case 6,7,8:
                System.out.println("夏季");break;
            case 9,10,11:
                System.out.println("秋季");break;
            default:
                System.out.println("输入有误");
        }*/

        /*        switch(month){
            case 1|2|12: //1|2|12常量表达式，计算，按位或

       *//*         1：  00000001
                2：  00000010
                12： 00001100
                1|2|12： 00001111 ->15*//*

                System.out.println("冬季");break;
            case 3|4|5:

//               3:  00000011
//                4： 00000100
//                5： 00000101
//                3|4|5： 00000111 ->7

                System.out.println("春季");break;
            case 6|7|8:

//                6： 00000110
//                7:  00000111
//                8： 00001000
//                6|7|8：00001111 -> 15

                System.out.println("夏季");break;
            case 9|10|11:
                System.out.println("秋季");break;
            default:
                System.out.println("输入有误");
        }*/

        input.close();
    }
}
