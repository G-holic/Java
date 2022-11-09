package cn.itcast08.exer.array;

/*
（1）定义学生类Student
- 声明姓名和成绩实例变量，
- String getInfo()方法：用于返回学生对象的信息
 */
public class Student {
    String name;
    int score;

    String getInfo() {
        return "姓名： " + name + ",成绩： " + score;
    }
}
