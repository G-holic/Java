package cn.itcast.reflect_反射;

import org.junit.Test;

import java.lang.reflect.Method;

/*
四、反射的应用之四：在运行时动态的调用任意类的任意方法
步骤：
(1）获取Class对象
（2）创建这个类的实例对象
前提条件是这个类有公共的无参构造
（3）先获取你要调用的方法的Method对象
（4）调用方法
通过Method对象.invoke(实例对象，实参)
 */
public class TestMethodReflect {
    @Test
    public void test01() throws Exception{
/*
        通过反射 调用 cn.itcast.ext.demo.AtTest类的doubleNum(int num)方法
*/
        // 1.获取Class对象
        Class clazz = Class.forName("cn.itcast.ext.demo.AtTest");
        // 2.创建这个类的实例对象
        Object obj = clazz.newInstance();// obj是AtTest类的对象

        // 3.先获取你要调用的方法的Method对象
        Method doubleNumMethod = clazz.getDeclaredMethod("doubleNum", int.class);//int.class表示 doubleNum有一个形参的类型是int类型
        /*
        如何唯一的确定某个类的方法？
        （1）类：通过clazz对象确定是AtGuiguClass类
        （2）方法名：doubleNum
        （3）形参列表：因为有可能doubleNum会有重载
         */
        // 4.通过Method对象.invoke(实例对象，实参)
        Object returnValue = doubleNumMethod.invoke(obj, 10);
        /*
        这里的5相当于是 在调用 doubleNum方法时，给方法的实参
        这里returnValue是调用完 doubleNum方法得到的返回值
         */
        System.out.println("returnValue = " + returnValue);// returnValue = 20
    }
}
