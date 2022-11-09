package cn.itcast09.encapsulability_封装;

/*
二、成员变量选择哪种权限修饰符？
1、实际应用中，习惯上，先声明为private。称为属性私有化。
但是如果确实这个成员变量需要扩大它的可见性范围，那么可以把private修改为其他合适的修饰符。
例如：扩大到本包，那么就是缺省的
例如：扩大到其他包的子类中，那么就是protected
例如：扩大到任意位置，那么就是public

2、为什么？
因为属性其实就是代表对象的“数据”，那么对象的数据是非常重要的，不应该完全暴露，至少要可控。

3、演示

4、如何使用私有化的属性
如果这个属性确实要被外部使用，需要提供get或set方法。
get方法：供调用者获取属性值的方法
set方法：供调用者修改属性值的方法

5、get/set方法要注意的地方
（1）如果方法中有局部变量（通常是形参）与对象的实例变量“重名”，
那么需要在实例变量的前面加"this.“，
如果没有重名问题，在实例变量前面可以加"this.”，也可以不加"this.“

（2）get/set的方法名，通常都是
get + 属性名，并且属性名的首字母大写
set  + 属性名，并且属性名的首字母大写

（3）如果属性（实例变量）是boolean类型，
那么它对应的get方法，就会把get单词换成is。

 */
public class TestField {
    public static void main(String[] args) {
        Student s1 = new Student();
        /*s1.name = "张三";
        s1.score = 89;
        s1.age = 23;
        //以上代码正常使用没问题，但是如果出现以下代码
        s1.score = -89;
        s1.age = -23;
        //这样写，逻辑上有问题，语法上没法控制*/

        //这里是调用者的角色，调用s1学生对象的姓名name的get和set
        System.out.println("修改之前，姓名：" + s1.getName());
        s1.setName("张三");
        System.out.println("修改之后，姓名：" + s1.getName());

        System.out.println("修改之前，年龄：" + s1.getAge());
        s1.setAge(34);
        System.out.println("修改之后，年龄：" + s1.getAge());


    }
}
