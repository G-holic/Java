package cn.itcast.exer1;

//Rectangle：矩形
//Graphic：图形
public class TestGraphic {
    public static void main(String[] args) {
        //先创建图形对象数组
        Graphic[] arr = new Graphic[4];
//        arr[0] = new Rectangle();
//        arr[0].setLength(4);//编译报错，为什么？
        /*
        arr[0]现在是Graphic类型，编译时看父类，
        父类Graphic类中没有声明setLength方法
         */

        Rectangle r1 = new Rectangle();
        r1.setLength(5);
        r1.setWidth(2);

        Rectangle r2 = new Rectangle();
        r2.setLength(4);
        r2.setWidth(1);

        Circle c1 = new Circle();
        c1.setRadius(2.5);

        Circle c2 = new Circle();
        c2.setRadius(1.6);

        arr[0] = r1;
        arr[1] = r2;
        arr[2] = c1;
        arr[3] = c2;

        //在排序前输出信息
        System.out.println("排序前：");
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getInfo());
        }

        //排序
        for(int i = 1; i < arr.length; i++) {
            for(int j = 0; j < arr.length-i; j++) {
                if(arr[j].area() > arr[j+1].area()){// 比较面积
                    Graphic temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;// 交换对象
                }
            }
        }

        //排序后遍历数组
        System.out.println("排序后");
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getInfo());
        }
    }

}
