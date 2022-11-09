package cn.itcast06.class06;

/*
类的成员：
    成员变量
    成员方法
    构造器
    代码块
    成员内部类


成员变量：
1、成员变量声明的位置：必须在类中方法外
2、成员变量声明的格式
【修饰符】 class 类名{
    【修饰符】 数据类型 变量名;
}

成员变量的修饰符有很多：public,protected,private,static,final,transient,volatile等。
数据类型：可以是8种基本数据类型，也可以是引用数据类型。

3、演示
学生类，要声明如下几个成员变量：姓名、年龄、成绩、性别、手机号码

4、成员变量的使用
.：是成员访问符

在其他类中使用，需要通过  “对象.成员变量  ”

5、成员变量的特点
（1）成员变量有默认值
整数类型默认值是0
小数类型默认值是0.0
char类型默认值是\u0000空字符
boolean类型默认值是false
引用数据类型默认值是null

（2）成员变量的值是每一个对象“独立”的。
好比：每一个同学来了，填写个人信息，自己填写自己的。

实例=对象
今天学习的所有成员变量都是实例变量，非静态。

 */
public class Test13Field {
//    int a = 1; // 成员变量

    public static void main(String[] args) {
//        int a = 1; // 不是成员变量

        //局部变量
//        String name;
//        System.out.println("name = " + name);//报错，未初始化
        //第一步：先要创建对象
        Student stu = new Student();

        //第二步：给学生对象的属性/成员变量赋值
        stu.name = "张三";
        stu.age = 24;
        stu.score = 89;
        stu.gender = '男';
        stu.tel = "10085";

        System.out.println("stu.name = " + stu.name);
        System.out.println("stu.age = " + stu.age);
        System.out.println("stu.score = " + stu.score);
        System.out.println("stu.gender = " + stu.gender);
        System.out.println("stu.tel = " + stu.tel);

        Student stu2 = new Student();
        System.out.println("stu2.name = " + stu2.name);
        System.out.println("stu2.age = " + stu2.age);
        System.out.println("stu2.score = " + stu2.score);
        System.out.println("stu2.gender = " + stu2.gender);
        System.out.println("stu2.tel = " + stu2.tel);
    }
}
