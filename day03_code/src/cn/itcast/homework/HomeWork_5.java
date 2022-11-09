package cn.itcast.homework;

/*
 * 5. 定义变量week赋值为上一年12月31日的星期值（可以通过查询日历获取），
 * 定义变量year、month、day，分别赋值今天日期年、月、日值。
 * 计算今天是星期几。*/
public class HomeWork_5 {
    public static void main(String[] args) {
        int week = 5; // 查询日历可知
        int year = 2022;
        int month = 9;
        int day = 3;

        //判断这一天是当年的第几天==>从1月1日开始，累加到xx月xx日这一天
        //(1)[1,month-1]个月满月天数
        //(2)单独考虑2月份是否是29天（依据是看year是否是闰年）
        //(3)第month个月的day天

        //声明一个变量days，用来存储总天数
        int days = 0;

        switch (month) {
            case 12:
                //累加的1-11月
                days += 30;//这个30是代表11月份的满月天数
                //这里没有break，继续往下走
            case 11:
                //累加的1-10月
                days += 31;//这个31是代表10月的满月天数
                //这里没有break，继续往下走
            case 10:
                days += 30;//9月
            case 9:
                days += 31;// 8月
            case 8:
                days += 31;//7月
            case 7:
                days += 30;//6月
            case 6:
                days += 31; //5月
            case 5:
                days += 30; //4月
            case 4:
                days += 31;//3月
            case 3:
                days += 28; // 2月
                //在这里考虑是否可能是29天
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    days++; // 多加一天
                }
            case 2:
                days += 31; // 1月
            case 1:
                days += day; //第month月的day天
        }

        // 计算星期
        week += days;
        week %= 7;

        //输出结果
        System.out.print(year + "年" + month + "月" + day + "日是星期");

        switch (week) {
            case 0:
                System.out.print("日");
                break;
            case 1:
                System.out.print("一");
                break;
            case 2:
                System.out.print("二");
                break;
            case 3:
                System.out.print("三");
                break;
            case 4:
                System.out.print("四");
                break;
            case 5:
                System.out.print("五");
                break;
            case 6:
                System.out.print("六");
                break;
        }
    }

}
