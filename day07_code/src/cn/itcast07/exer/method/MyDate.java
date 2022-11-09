package cn.itcast07.exer.method;

public class MyDate {
    int year;
    int month;
    int day;
    //只要是MyDate类型的“变量”，就可以使用这些year,month,day变量
    //使用方式：MyDate类型的变量.year ...

    //只要是MyDate类型的“变量”，就可以调用这个方法
    //使用方式：MyDate类型的变量.getDateInfo()
    //没有public,只能本包中的其他类中使用，不能跨包使用
    String getDateInfo() {
        return year + "年" + month + "月" + day + "日";
    }
}
