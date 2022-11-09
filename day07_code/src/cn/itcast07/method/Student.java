package cn.itcast07.method;

public class Student {
    String name;
    int age;
    int score;

    // 声明一个方法，自我介绍，返回当前学生对象自己的属性值
    public String introduce() {
        //这里的this指的是调用introduce()的对象
        // return "姓名：" + this.name +"，年龄：" + this.age +"，成绩：" + this.score;
        //没有重名问题，歧义问题，可以省略this.
        //说明 本类的成员方法可以直接使用本类自己的成员变量
        return "姓名：" + name + "，年龄：" + age + "，成绩" + score;
    }
}
