package cn.itcast07.exer.method;

public class Employee {
//    public String name;
    String name;
    MyDate birthday;
    //birthday是MyDate类型的变量，就可以调用MyDate类中的getDateInfo()


    //set：设置，修改
    void setBirthday(int year, int month, int day) {
        birthday = new MyDate();
        birthday.year = year;
        birthday.month = month;
        birthday.day = day;
    }

    String getEmpInfo() {

//        return "姓名：" + name + "，生日：" + birthday.year + "年" + birthday.month + "月" + birthday.day + "日";
        return "姓名：" + name + "，生日：" + birthday.getDateInfo() ;
    }
}
