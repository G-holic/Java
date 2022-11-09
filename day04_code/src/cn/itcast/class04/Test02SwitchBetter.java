package cn.itcast.class04;
/*
用year、month、day分别存储今天的年、月、日值，然后输出今天是这一年的第几天。
   注：判断年份是否是闰年的两个标准，满足其一即可
​       1）可以被4整除，但不可被100整除
​       2）可以被400整除
例如：1900，2200等能被4整除，但同时能被100整除，但不能被400整除，不是闰年
 */
public class Test02SwitchBetter {
    public static void main(String[] args) {
        int year = 2022;
        int month = 3;
        int day = 30;

         /*
        累加总天数
        （1）累加第month月的day天
        （2）累加[1, month-1]月的满月总天数
        1,3,5,7,8，10,12是31天
        4,6,9,11是30
        2有28天或29天
         */
        //定义一个变量用来存储总天数
//        int days = 0;
//        days += day;

        int days = day;//已经累加了第month月的day天

        //累加[1, month-1]月的满月总天数
        //如果使用if..else，非常繁琐
        /*if(month==5){
            days += 31 + 28 + 31 + 30;
        }else if(month==6){
            days += 31 + 28 + 31 + 30 + 31;
        }
*/
        boolean leap_year = year % 4==0 && year %100!=0 || year %400==0;
        switch (month){
            case 12:
                days += 30;//30代表11月的总天数
            case 11:
                days += 31;//31代表10月的总天数
            case 10:
                days += 30;//30代表9月的总天数
            case 9:
                days += 31;//31代表8月的总天数
            case 8:
                days += 31;//31代表7月的总天数
            case 7:
                days += 30;//30代表6月的总天数
            case 6:
                days += 31;//31代表5月的总天数
            case 5:
                days += 30;//30代表4月的总天数
            case 4:
                days += 31; //31代表3月的总天数
            case 3:
                if (leap_year){
                    days += 29;//29是代表闰年2月的总天数
                }else {
                    days += 28; //28是代表平年2月的总天数
                }
            case 2:
                days += 31; //31代表1月的总天数
        }
        System.out.println(year+"年" + month +"月" +day +"日是这一年的第" + days +"天");
    }
}
