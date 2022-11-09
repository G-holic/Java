package cn.itcast.review;

public class TestReview2 {
    public static void main(String[] args) {
        Circle[] arr = {new Circle(2.5), new Circle(4.5), new Circle(1.0)};

        for (Circle circle : arr) {
            circle.setRadius(circle.getRadius() * 2);
//            circle = new Circle(10); // 修改元素值，失败
        }

        for (Circle circle : arr) {
            // 修改Circle元素的属性值，成功
            System.out.println(circle);
        }
    }
}
