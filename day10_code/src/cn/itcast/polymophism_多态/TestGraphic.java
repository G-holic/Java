package cn.itcast.polymophism_多态;
//Rectangle：矩形
//Graphic：图形
public class TestGraphic {
    public static void main(String[] args) {
        /*
        需求：同一个数组中，希望既可以存储矩形对象，又可以存储圆对象
         */
        Graphic[] arr = new Graphic[4];
        Rectangle r1 = new Rectangle();
        r1.setLength(5);
        r1.setWidth(3);
        arr[0] = r1;
        //左边arr[0]是Graphic类型，右边r1它是Rectangle的对象，父类类型的变量/元素，存储子类的对象


        Rectangle r2 = new Rectangle();
        r2.setLength(6);
        r2.setWidth(2);
        arr[1] = r2;

        Circle c1 = new Circle();
        c1.setRadius(2.5);
        arr[2]  = c1;

        Circle c2 = new Circle();
        c2.setRadius(2.5);
        arr[3]  = c2;

        //遍历数组，打印这些图形的信息
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i].getInfo());
            /*
            从这里来到，我是调用Graphic父类的getInfo()方法
            但是它们执行的时候，根据元素里面存储的对象的实际类型，
            来找重写后的getInfo()方法执行
             */
        }
    }

}
