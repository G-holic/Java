package cn.itcast.reflect_反射;

import org.junit.Test;

import java.lang.reflect.Constructor;

/*
反射的应用之二：创建任意类型的对象
当然不包括 基本数据类型和void，抽象类，接口等。

方案一：
步骤：
（1）先获取这个类的Class对象
（2）调用Class对象的newInstance()方法来创建实例对象
这种方式创建对象有限制，必须要求这个类有无参的公共构造器。

方案二：
步骤：
（1）先获取这个类的Class对象
（2）先获取有参构造器对象
（3）调用构造器对象的newInstance(...)方法来创建实例对象
如果构造器是非公共的，那么需要调用 构造器对象的setAccessible(true)

结论：为了后期很多的框架可以为你的类自动创建的对象更方便，请保留你这个类公共的无参构造。
 */
public class TestCreateObject {
    @Test
    public void test01() throws Exception {
//        AtTest a = new AtTest();// 不可行
        Class<?> clazz = Class.forName("cn.itcast.ext.demo.AtTest");
        Object obj = clazz.newInstance();
        // obj是AtTest类的对象
        System.out.println(obj);// cn.itcast.ext.demo.AtTest@5e8c92f4
    }

    @Test
    public void test02() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class<?> clazz = Class.forName("cn.itcast.ext.demo.AtTest");
        Object obj = clazz.newInstance();
        /*
        java.lang.InstantiationException: cn.itcast.ext.demo.AtTest
        Caused by: java.lang.NoSuchMethodException: cn.itcast.ext.demo.AtTest.<init>()
        解释：AtDemo没有无参构造
         */
        //obj是 AtDemo类的对象
        System.out.println(obj);//
    }

    @Test
    public void test03() throws Exception {
        Class<?> clazz = Class.forName("cn.itcast.ext.demo.AtDemo");
        Constructor<?> c1 = clazz.getDeclaredConstructor(String.class, int.class);// 通过构造器的形参类型列表来确定具体是哪个构造器
        c1.setAccessible(true);// 跳过权限修饰符检查
        Object obj = c1.newInstance("李四", 666);
        System.out.println(obj);// AtDemo{info='李四', num=666}

    }
}
