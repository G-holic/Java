package cn.itcast08.exer.overload;
/*
（1）声明一个图形工具类GraphicTools，包含两个重载方法
- 方法1：double triangleArea(double base ,double height)，
    根据底边和高，求三角形面积，
- 方法2：double triangleArea(double a,double b,double c)，
    根据三条边，求三角形面积，根据三角形三边求面积的海伦公式：
（2）在测试类的main方法中调用
 */
public class GraphicToolsTest {
    public static void main(String[] args) {
        GraphicTools tools = new GraphicTools();

        double base = 3;
        double height = 4;
        System.out.println(tools.triangleArea(base, height));

        double a = 3;
        double b = 4;
        double c = 5;
        System.out.println(tools.triangleArea(3,4,5));

        double x = 2;
        double y = 2;
        double z = 2;
        System.out.println(tools.triangleArea(x,y,z));

        System.out.println(tools.triangleArea(1,1,2));//0.0不是三角形
    }
}
