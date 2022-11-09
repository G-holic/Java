package cn.itcast.exer;
// （1）声明一个坐标类Coordinate<T>，它有两个属性：x,y，都为T类型，属性私有化，提供有参构造、get/set方法、重写toString方法。
public class Coordinate<T> {
    private T x;
    private T y;

    public Coordinate(T x, T y) {
        this.x = x;
        this.y = y;
    }

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

    public T getY() {
        return y;
    }

    public void setY(T y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Coordinate{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
