package cn.itcast.exer.exer2;
/*
（1）声明一个LiveAble接口

* 包含两个抽象方法：
  * void eat();
  * void breathe();
* 包含默认方法  default void sleep()，实现为打印“静止不动”
* 包含静态方法 static void drink()，实现为“喝水”
 */
public interface LiveAble {
    //接口中的抽象方法，public和abstract可以省略
    void eat();
    void breathe();

    //默认方法，省略了public
    default void sleep(){
        System.out.println("静止不动");
    }

    //静态方法，省略了public
    static void drink(){
        System.out.println("喝水");
    }
}
