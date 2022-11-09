package cn.itcast09.exer3;
//（4）在测试类的main方法中创建三个类的对象，并调用相应的方法测试

public class TestPerson {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("张三");
        p.setGender('男');
        p.setAge(25);
        System.out.println(p.getInfo());

        Student s = new Student();
        s.setName("张三丰");
        s.setAge(5);
        s.setGender('男');
        s.setScore(89);
        System.out.println(s.getInfo());

        Teacher t = new Teacher();
        t.setName("柴林燕");
        t.setAge(18);
        t.setGender('女');
        t.setSalary(10000);
        System.out.println(t.getInfo());
    }
}
