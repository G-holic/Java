package cn.itcast07.exer.field;

public class OOPExer3 {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.name = "张三";
        //        e1.birthday = "1995-5-1";
        //报错，因为birthday是MyDate类型
        //"1995-5-1"是String类型，它们类型不一致也不兼容，无法这样赋值

        /*
        如下代码编译没问题，运行报错NullPointerException
        发生空指针异常就找.前面东西，看它是否为null。
        e1不为null
        e1.birthday是null
            e1.birthday是MyDate类型，是“类”类型，是引用数据类型之一。
            引用数据类型的实例变量默认值是null
         */
 /*     e1.birthday.year = 1995;
        e1.birthday.month = 5;
        e1.birthday.day = 1;*/

        //只要是引用数据类型，就要赋值对象
        //e1.birthday的声明在Employee类中，这里不用声明了
        e1.birthday = new MyDate();
        e1.birthday.year = 1995;
        e1.birthday.month = 5;
        e1.birthday.day = 1;

        System.out.println("e1员工的姓名： " + e1.name + "，生日： " + e1.birthday.year + "年" + e1.birthday.month + "月" + e1.birthday.day + "日");
    }
}
