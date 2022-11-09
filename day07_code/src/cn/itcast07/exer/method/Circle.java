package cn.itcast07.exer.method;

/*
（1）声明一个圆的图形类，包含实例变量/属性：半径
（2）将圆求面积、求周长、返回圆对象信息分别封装为3个方法
double area()：求面积
double perimeter()：求周长
String getInfo()：返回圆对象信息，例如："半径：xx，周长：xx，面积：xx"
（3）在测试类的main中，创建2个圆类的对象，并给两个圆对象的半径属性赋值，最后显示两个圆的半径值、周长和面积值
​	提示：圆周率可以使用Math.PI
 */
public class Circle {
    double radius;

    // 如果这些方法只是在本包使用，可以不加public
    //当调用这个方法时，就可以获取“圆”对象的面积值
    double area() {
        return Math.PI * radius * radius;
    }

    //mainJi()方法的复用性，没有area()方法高
    void mainJi() {
        System.out.println("面积： " + Math.PI * radius * radius);
    }

    double perimeter() {
        return 2 * Math.PI * radius;
    }

    String getInfo() {
        //        return "半径：" + radius + "，周长：" + perimeter + "，面积：" + area;//报错，如果没有写(),perimeter和area就是变量的意思
        return "半径：" + radius + "，周长：" + perimeter() + "，面积：" + area();
    }
}
