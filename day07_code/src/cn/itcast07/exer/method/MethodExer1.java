package cn.itcast07.exer.method;

public class MethodExer1 {
    public static void main(String[] args) {
        // 1.创建圆对象
        Circle c1 = new Circle();
        c1.radius = 2.5;

        Circle c2 = new Circle();
        c2.radius = 3.0;

        // 如果单独想要获取面积值
        System.out.println("c1的面积： "+c1.area());

        //如果想要获取c1对象的完整信息
        String info = c1.getInfo();
        System.out.println(info);

        //调用c1对象的mainJi方法
        c1.mainJi();

        //如果此时我有另一个需求，比较两个圆对象的面积大小
        if(c1.area() > c2.area()){
            System.out.println("c1更大");
        }else {
            System.out.println("c2更大");
        }
    }
}
