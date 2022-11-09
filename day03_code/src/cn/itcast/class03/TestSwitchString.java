package cn.itcast.class03;

import java.util.Scanner;

public class TestSwitchString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("请输入星期名称： ");
        String week = input.next();

//        switch (week){
//            case "monday":
//                System.out.println(1);
//                break;
//            case "tuesday":
//                System.out.println(2);
//                break;
//        }
        if(week == "monday"){ //week是String类型，不能用==比较，需要用equals方法
            System.out.println(1); // 无打印
        }else if(week == "tuesday"){
            System.out.println(2);
        }
        input.close();
    }
}
