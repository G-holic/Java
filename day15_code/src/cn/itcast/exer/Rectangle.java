package cn.itcast.exer;
/*（1）声明一个Rectangle矩形类，
- 属性：length和width
- 无参和有参构造
- 提供get/set方法
- 重写toString方法，返回矩形对象信息
- 实现java.lang.Cloneable接口，重写Object类的clone()方法*/
public class Rectangle implements Cloneable{
    private double length;
    private double width;

    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }

    //如果调用这个方法的位置，和当前类是本包，那么可以不用修改为public
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
