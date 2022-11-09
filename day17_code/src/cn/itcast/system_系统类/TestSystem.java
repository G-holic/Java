package cn.itcast.system_系统类;

import org.junit.Test;

import java.util.Properties;

/*
1、java.lang.System类：系统类
 */
public class TestSystem {
    @Test
    public void test01() {
        long timeMillis = System.currentTimeMillis();
        System.out.println(timeMillis);//距离1970年至今的毫秒值
    }

    @Test
    public void test02() {
        Properties properties = System.getProperties();
        System.out.println(properties);//系统属性

    }

    @Test
    public void test03() {
        System.out.println(System.getProperty("java.version"));//JDK版本
        System.out.println(System.getProperty("user.language"));//语言环境的语句类型
        System.out.println(System.getProperty("user.country"));//语言环境的国家名称
        System.out.println(System.getProperty("file.encoding"));//文件的编码
        System.out.println(System.getProperty("user.name"));//用户名
        System.out.println(System.getProperty("os.version"));//操作系统的版本
        System.out.println(System.getProperty("os.name"));//操作系统的名称

    }

    @Test
    public void test04() {
        for (int i = 0; i < 10; i++) {
            MyDemo my = new MyDemo();
        }

        System.gc();// 通知GC来工作，进行内存的整理，回收垃圾对象占用的内存

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test05() {
        try {
            int a = 1;
            int b = 2;
            System.out.println(a/b);
            //根据惯例，非 0 的状态码表示异常终止。
//            System.exit(0);
        }catch (ArithmeticException e){
            e.printStackTrace();
        }finally {
            System.out.println("finally");
        }
    }


}

class MyDemo {
    // 正常来说这个方法是用于编写资源释放的代码
    // 通常这个代码用于是否JVM以外的内存
    // 这个方法不是由程序员调用，当对象给GC回收之前，GC会自动调用这个方法
    @Override
    protected void finalize() throws Throwable {
        System.out.println("我轻轻的走了，不带走一段代码...");
    }
}