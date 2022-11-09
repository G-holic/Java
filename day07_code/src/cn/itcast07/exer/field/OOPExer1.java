package cn.itcast07.exer.field;

public class OOPExer1 {
    public static void main(String[] args) {
        //（2）在测试类的main中，创建2个圆类的对象，并给两个圆对象的半径属性赋值，最后显示两个圆的半径值、周长和面积值
        //提示：圆周率可以使用Math.PI
        Circle c1 = new Circle();
        c1.radius = 2.5;


        Circle c2 = new Circle();
        c2.radius = 3.0;

        System.out.println("c1圆对象的半径是： " + c1.radius + "，周长：" + 2 * Math.PI * c1.radius + "，面积：" + Math.PI * c1.radius * c1.radius);
        System.out.println("c2圆对象的半径是： " + c2.radius + "，周长：" + 2 * Math.PI * c2.radius + "，面积：" + Math.PI * c2.radius * c2.radius);
    }
}
