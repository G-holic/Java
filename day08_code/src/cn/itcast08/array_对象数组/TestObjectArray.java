package cn.itcast08.array_对象数组;

/*
我们之前第4章学习了数组，元素都是int等基本数据类型的数组。
现在要讲的是对象数组，元素是引用数据类型。

演示：存储5个圆对象到数组中。
写代码先有类，再有对象。

数组的元素如果是引用数据类型，默认值是null。
对象数组中元素存储的是对象的首地址。
 */
public class TestObjectArray {
    public static void main(String[] args) {
        // 创建5个园对象，半径是随机产生，[1,10)之间
        // （1）先声明和创建数组，长度为5
        // 元素的类型：Circle
        // 一维数组的声明和动态初始化的公式
        // 元素的数据类型[] 数组名 = new 元素的数据类型[长度];
        Circle[] arr = new Circle[5];

        // （2）为元素赋值
        // 元素类型是Circle，那么必须赋值为Circle的对象
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Circle();
            /*
            Math.random() => [0,1)
            Math.random()*9 => [0,9)
            Math.random()*9+1 => [1,10)
             */
            arr[i].radius = Math.random() * 9 + 1;
            System.out.println(arr[i].getInfo());
            //因为arr[i]是Circle类型的对象，就可以调用就Circle类中声明的属性和方法
        }
    }
}
