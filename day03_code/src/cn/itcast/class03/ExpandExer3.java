package cn.itcast.class03;


/*
* 3、用一个year变量保存今年的年份值，并显示今年的总天数

闰年的判断标准：

（1）要么能被4整除，同时不能被100整除

（2）要么能被400整除*/
public class ExpandExer3 {
    public static void main(String[] args) {
        int year = 2022;

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + "是闰年");
            System.out.println("总天数是：365天");
        } else {
            System.out.println(year + "不是闰年");
            System.out.println("总天数是：365天");
        }

    }
}
