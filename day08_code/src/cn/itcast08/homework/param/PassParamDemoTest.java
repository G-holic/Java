package cn.itcast08.homework.param;

public class PassParamDemoTest {
    public static void main(String[] args) {
        PassParamDemo demo = new PassParamDemo();

        int x = 1;
        demo.doubleNumber(x);
        System.out.println("x = " + x);


        char c = 'a';
        demo.toUpperCase(c);
        System.out.println("c = " + c);

        Circle circle = new Circle();
        circle.radius = 1;
        demo.expandCircle(circle, 5);
        System.out.println("circle.radius = " + circle.radius);

        int[] arr = {1, 2, 3, 4, 5};
        demo.doubleElement(arr);
        System.out.println("调用doubleElement方法之后：");
        System.out.println("arr数组的元素：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        demo.grow(arr);
        System.out.println("\n调用grow方法之后：arr的数组长度：" + arr.length);
        System.out.println("arr数组的元素：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
