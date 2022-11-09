package cn.itcast09.exer1;

/*
（1）定义矩形类Rectangle，
- 声明实例变量长和宽，全部私有化private，
- 提供相应的get/set方法，如果set方法的参数值<=0，则提示矩形的长和宽必须是正数
- 声明public double area()，返回矩形面积
- 声明public double perimeter()：返回矩形的周长
- 声明public String getInfo()：返回矩形的长、宽、面积、周长信息
（2）测试类的main中创建一个可以装3个矩形对象的数组，并调用set方法为对象的属性赋值，依次长是8,7,6，宽是2,3,4
- 遍历输出矩形对象数组
- 按照矩形对象的length属性值从小到大排序后，遍历输出矩形对象数组
- 按照矩形对象的面积从小到大排序后，遍历输出矩形对象数组

编写代码的习惯：先写所有的成员变量的声明，再写方法
 */
public class Rectangle {
    private double length;
    private double width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length <= 0) {
            System.out.println("矩形的长必须是正数");
            return;// 结束当前方法的执行，那么 this.length = length;就不执行了
        }
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width <= 0) {
            System.out.println("矩形的宽必须是正数");
            return;// 结束当前方法的执行，那么 this.width = width;就不执行了
        }
        this.width = width;
    }

    public double area() {
        return length * width;
    }

    public double perimeter() {
        return length * 2 + width * 2;
    }

    public String getInfo() {
        return "长：" + length + ",宽：" + width + ",面积：" + area() + ",周长：" + perimeter();
    }
}
