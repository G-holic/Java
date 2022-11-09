package cn.itcast07.exer.field;

public class OOPExer2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "张三";
        s1.score = 89;

        Student s2 = new Student();
        s2.name = "李四";
        s2.score = 90;

        System.out.println("s1学生对象的姓名：" + s1.name + "，成绩：" + s1.score);
        System.out.println("s2学生对象的姓名：" + s2.name + "，成绩：" + s2.score);
    }
}
