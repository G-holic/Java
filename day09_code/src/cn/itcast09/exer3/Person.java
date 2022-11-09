package cn.itcast09.exer3;

/*
（1）声明父类：Person类
- 包含属性：姓名，年龄，性别，属性私有化，
- 包含get/set方法
- 包含getInfo()方法：例如：姓名：张三，年龄：23，性别：男
 */
public class Person {
    private String name;
    private int age;
    private char gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getInfo() {
        return "姓名： " + name + "，年龄： " + age + "，性别：" + gender;
    }
}
