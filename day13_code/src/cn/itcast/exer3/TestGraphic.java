package cn.itcast.exer3;
/*
（4）在测试类中，

- 创建两个矩形（2,3）,（3,6），创建2个三角形(3,4,5）,（6,6,6)，
- 创建Shape数组中，把上面4个对象放到数组中，遍历显示信息
*/

public class TestGraphic {
    public static void main(String[] args) {
        Shape[] arr = new Shape[4];
        arr[0] = new Rectangle(2, 3);
        arr[1] = new Rectangle(3, 6);
        arr[2] = new Triangle(3, 4, 5);
        arr[3] = new Triangle(6, 6, 6);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
