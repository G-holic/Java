package cn.itcast.exception_异常;

import org.junit.Test;

/*
如何获取异常的信息？
异常的信息包含：
（1）异常的类型
（2）异常的原因message
（3）异常的堆栈跟踪信息

在catch分支中捕获了一个异常对象之后，可以获取异常的信息。
（1）e.printStackTrace();//打印异常的详细信息，包括（1）（2）（3）
（2）e.getMessage()方法。配合System.err.println()方法
（3）e.getClass()方法，配合System.err.println()方法
（4）e.getStackTrace()方法，配合System.err.println()方法
 */
public class TestExceptionInfo {
    public static void main(String[] args) {
        try {
            Object obj = 15;
            String str = (String) obj;
        } catch (Exception e) {
//            e.printStackTrace();//打印异常的详细信息，包括（1）（2）（3）
//            String message = e.getMessage();
//            System.err.println("message = " + message); // （2）异常的原因

//            Class aClass = e.getClass();
//            System.err.println("aClass = "+ aClass); // （1）异常的类型

            StackTraceElement[] stackTraceElements = e.getStackTrace(); //（3）异常的堆栈跟踪信息
            for (int i = 0; i < stackTraceElements.length; i++) {
                System.err.println("stackTraceElements = " + stackTraceElements[i]); //（3）异常的堆栈跟踪信息
            }


        }

        /*
        Exception in thread "main" java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String
        at cn.itcast.exception_异常.TestExceptionInfo.main(TestExceptionInfo.java:18)
        （1）异常的类型：java.lang.ClassCastException
        （2）异常的原因：java.lang.Integer cannot be cast to java.lang.String
        （3）异常的堆栈跟踪信息：main(TestExceptionInfo.java:18)
        */


    }

    @Test
    public void test() { // 可以看到更多的异常跟踪信息
        Object obj = 15;
        String str = (String) obj;
    }
}
