package cn.itcast.exer;
/*
（1）声明一个Rectangle矩形类，
- 属性：length和width
- 无参和有参构造
- 提供get/set方法
- 重写toString方法，返回矩形对象信息
- 实现java.lang.Cloneable接口，重写Object类的clone()方法

（2）在测试类中，创建一个Rectangle矩形对象，调用矩形对象的clone方法克隆出一个新对象，

使用try...catch处理CloneNotSupportedException异常，在catch中手动创建一个矩形对象，并用原来的矩形对象的length和width为新创建的矩形对象的length和width赋值
 */
public class Exercise2 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5,3);
        Rectangle r2 = null;
        try {
            r2  = (Rectangle) r1.clone();// 克隆的是Object对象，要向下转型
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();

            // 手动克隆
            /*  r2 = new Rectangle();
            r2.setLength(r1.getLength());
            r2.setWidth(r1.getWidth());*/
        }

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
    }


}
