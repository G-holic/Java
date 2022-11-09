package cn.itcast.annotation_注解;

import java.lang.annotation.Annotation;

/*
回忆：
注解：
@Override：标记某个重写的方法
@Deprecated：标记某个类、方法已过时
@SuppressWarnings：抑制警告
@Test：JUnit测试的标记

1、自定义注解
（1）语法格式
【修饰符】 @interface 注解名{
}

2、如何使用自定义注解
可以在类、方法、成员变量等上面加注解

3、自定义注解包含三个部分
（1）声明
例如：
public @interface MyAnnotation {
}

（2）使用
@MyAnnotation
public class MyClass {
}

（3）读取
如果没有第（3）读取部分，前面的代码就完全没用。

就好比说，@Override
声明：
public @interface Override {
}
使用：
class Son extends Father{
    @Override //注解的使用
    public void method() {
        System.out.println("Son.method");
    }
}
读取：
编译器会读取这个注解，会对方法进行格式检查

4、元注解
给注解加注释的注解
@Target：用来解释/注释某个注解可以用在哪里
    可以用注解的位置一共有10个。
    ElementType是一个枚举类型，每一个常量对象，代表一个注解可以使用的位置。
    其中
    ElementType.TYPE：表示是类型上面
    ElementType.FIELD：表示是属性/字段/成员变量上面
@Retention：用来解释/注释某个注解的生命周期
    每一个注解的生命周期有3个阶段：
    SOURCE：源代码
    CLASS：字节码
    RUNTIME：运行时，内存中
            只有RUNTIME阶段才能被反射读取

@Documented：用来解释/注释某个注解是不是可以被javadoc工具读取到API文档中。
@Inherited：用来解释/注释某个注解是不是可以被子类继承
 */
public class TestAnnotation {
    public static void main(String[] args) {
        // 写读取MyClass类上面的MyAnnotation注解的代码
        // 1.获取Class对象
        Class clazz = MyClass.class;

        // 2.获取注解对象Annotation
        Annotation annotation = clazz.getAnnotation(MyAnnotation.class);
        System.out.println(annotation);// @cn.itcast.annotation_注解.MyAnnotation()

        MyAnnotation my = (MyAnnotation) annotation;
        System.out.println(my.value());//调用my注解的value方法  // 李四
        System.out.println(my.info());//调用my注解的info方法   // 我是李四

        System.out.println("-----------------");
        Class subClass = MySub.class;
        Annotation a2 = subClass.getAnnotation(MyAnnotation.class);
        System.out.println(a2);// @cn.itcast.annotation_注解.MyAnnotation()
    }
}
class Father{
    public void method(){
        System.out.println("Father.method");
    }
}

class Son extends Father{
    @Override // 注解的使用
    public void method() {
        System.out.println("Son.method");
    }
}