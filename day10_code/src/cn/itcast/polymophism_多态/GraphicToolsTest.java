package cn.itcast.polymophism_多态;

public class GraphicToolsTest {
    public static void main(String[] args) {
        GraphicTools tools = new GraphicTools();

        Rectangle r1 = new Rectangle();
        r1.setLength(5);
        r1.setWidth(2);

        Rectangle r2 = new Rectangle();
        r2.setLength(6);
        r2.setWidth(3);

        Graphic max = tools.maxArea(r1, r2);
        /*
        形参是(Graphic g1, Graphic g2)
        实参是Rectangle的r1和r2，
        这个也是多态引用

        Graphic g1 = r1;//左边是形参，右边是实参
        Graphic g2 = r2;//左边是形参，右边是实参
         */
        System.out.println(max.getInfo());
        /*
        max变量看起来是Graphic类型，实际是Rectangle类型的
         */

        System.out.println("------------------");
        Circle c1 = new Circle();
        c1.setRadius(2.5);

        Graphic max2 = tools.maxArea(r1, c1);
        /*
        形参是(Graphic g1, Graphic g2)
        实参是一个Rectangle的r1,一个是Circle的c1
        Graphic g1 = r1
        Graphic g2 = c1
         */
        System.out.println(max2.getInfo());
        /*
        max2编译时是Graphic类型，实际返回的是Circle对象，因为它的面积大
         */
    }
}
