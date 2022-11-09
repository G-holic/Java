package cn.itcast08.array_对象数组;

public class Circle {
    double radius;

    double area() { // 面积
        return Math.PI * radius * radius;
    }

    double perimeter() {
        return 2 * Math.PI * radius;
    }

    String getInfo() {
        return "半径： " + radius + ",面积：" + area() + ",周长：" + perimeter();
    }
}
