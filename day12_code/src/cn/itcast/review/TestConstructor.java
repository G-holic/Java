package cn.itcast.review;

import java.util.Date;

public class TestConstructor {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.Student();

        System.currentTimeMillis();
        System.out.println(System.currentTimeMillis());
    }
}

class Student {
    void Student() {
        System.out.println("不是无参构造，而是普通方法");
    }
}
