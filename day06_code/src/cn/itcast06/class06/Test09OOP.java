package cn.itcast06.class06;
/*
面向过程：
    以步骤为核心，
    代码的结构以函数为单位，程序是有一个一个的函数组成的。
    数据是在函数内和函数外，函数内是局部数据，函数外是全局数据。
    函数外的数据是所有函数共用的。
    函数内的数据是这个函数独立的。
面向对象：
    以类和对象为核心。
    代码的结构以类为单位。程序是由一个一个的类组成的。
    数据是在类里面的。数据分为在类中方法（函数）外，类中方法（函数）内。
    数据在类中方法外称为 成员变量/成员数据。 要么属于某个类共享，要么是每一个对象独立的。
    数据在类中方法内称为 局部变量/局部数据。 局部变量无法共享，每一个方法独立。

把大象装进冰箱，怎么实现？
面向过程：
数据：大象、冰箱
步骤：
1、把冰箱门打开，定义一个函数来实现
2、把大象装进去，定义一个函数来实现
3、把冰箱门关上，定义一个函数来实现

按照顺序调用这些函数。

面向对象：
有哪些类？提前名词法
人
大象
冰箱
这些类代表不同的事物，每一个事物有自己的属性和方法（功能，行为能力）。
class Person{
    String name;
    public void push(东西){
        if(东西 是 冰箱){
            冰箱.close();
        }else if(东西是大象){
            大象.walk();
        }
    }
    public void pull(东西){
        if(东西 是 冰箱){
            冰箱.open();
        }else if(东西是大象){
            大象.walk();
        }
    }
}

class Elephant{
    public void walk(){
        ....
    }
}

class Refrigerator{
    public void open(){
    }
    public void close(){
    }
    public void save(){
    }
}

class Test{
    public static void main(String[] args){
        Person p = new Person();
        p.name = "张三";

        Refrigerator r = new Refrigerator();

        Elephant e = new Elephant();

        p.pull(r);//人拉冰箱门
        p.pull(e);//人拉大象过来
        p.push(e);//人推大象到冰箱里
        p.push(r);//人推冰箱门
    }
}
 */
public class Test09OOP {

}
