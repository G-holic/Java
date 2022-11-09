package cn.itcast.constructor_构造器;

/*
idea快捷生成构造器
* */
public class TestIdea {
    public static void main(String[] args) {
        // 创建员工对象
        //1、调用无参构造创建员工对象
        Employee e1 = new Employee();

        //2、调用有参构造创建员工对象
        Employee e2 = new Employee(2, "李四");
        Employee e3 = new Employee(3, "张三", "10086", 12000);
        Employee e4 = new Employee(4, "王五", "10010", 12000, "北京", 18, '男');

        System.out.println(e1.getInfo());
        System.out.println(e2.getInfo());
        System.out.println(e3.getInfo());
        System.out.println(e4.getInfo());
    }


}
