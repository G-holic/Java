package cn.itcast07.method;

public class TestStudent {
    public static void main(String[] args) {
        // 1. 创建学生对象
        Student s = new Student();

        // 在给s对象的属性赋值之前，调用Student类的introduce()方法
        System.out.println(s.introduce());//直接输出返回值 (都是默认值）

        s.name="张三";
        s.age = 23;
        s.score = 89;

        //再次调用s对象的introduce()方法
        System.out.println(s.introduce());

        Student s2 = new Student();
        System.out.println(s2.introduce());
    }
}
