package cn.itcast09.exer1;

/*
（2）测试类的main中创建一个可以装3个矩形对象的数组，并调用set方法为对象的属性赋值，依次长是8,7,6，宽是2,3,4
- 遍历输出矩形对象数组
- 按照矩形对象的length属性值从小到大排序后，遍历输出矩形对象数组
- 按照矩形对象的面积从小到大排序后，遍历输出矩形对象数组
 */
public class TestRectangle {
    public static void main(String[] args) {
        Rectangle[] arr = new Rectangle[3];
        System.out.println("排序之前：");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Rectangle();
            arr[i].setLength(8 - i);
            arr[i].setWidth(2 + i);
            System.out.println(arr[i].getInfo());
        }

        System.out.println("按照length之间从小到达排序：");
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j].getLength() > arr[j + 1].getLength()) {
                    Rectangle temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getInfo());
        }

        System.out.println("按照面积之间从小到达排序：");
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j].area() > arr[j + 1].area()) {
                    Rectangle temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getInfo());
        }
    }
}
