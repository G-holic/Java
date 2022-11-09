package cn.itcast.homework;

/*
案例：判断今年是否是闰年
闰年的判断标准是：

​       1）可以被4整除，但不可被100整除

​       2）可以被400整除


1. 定义一个int类型变量year，赋值为今年年份值
2. 定一个一个boolean类型变量，用来保存这个年份是否是闰年的结果
3. 输出结果*/
public class Work_6 {
    public static void main(String[] args) {
        int year = 2000;
        boolean result = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;

        System.out.println(year + (result ? "是闰年" : "不是闰年"));
    }

}

