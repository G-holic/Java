package cn.itcast.exer;
/*
（1）声明一个坐标类Coordinate<T>，它有两个属性：x,y，都为T类型，属性私有化，提供有参构造、get/set方法、重写toString方法。

（2）在测试类中，创建两个不同的坐标类对象，分别指定T类型为String和Double，并为x,y赋值，打印对象
 */
public class Exercise3 {
    public static void main(String[] args) {
        Coordinate<String> c1 = new Coordinate<>("北纬38.6", "东经36.8");
        Coordinate<Double> c2 = new Coordinate<>(38.6, 36.8);
        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
    }
}
