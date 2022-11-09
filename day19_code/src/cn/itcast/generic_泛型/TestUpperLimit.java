package cn.itcast.generic_泛型;

import org.junit.Test;

/*
四、声明泛型变量时指定上限
我们在声明<T>等类型变量时，可以给它限定“上限”。
语法格式：
    <T extends 上限>：表示T的类型必须是<=上限，即要么是上限本身，要是继承上限类或实现了上限接口的类型。

一个类型变量的上限可以是1个，也可以是多个。但是要求如果有多个的话，类只能有一个，其他的是接口类型。
而且类在左边，其他的类型在右边。
 */
public class TestUpperLimit {
    @Test
    public void test01(){
        XueSheng<Integer> x1 = new XueSheng<>("张三",89);
        XueSheng<Double> x2 = new XueSheng<>("张三",89.0);
//        XueSheng<Character> x3 = new XueSheng<>("张三",'A');//错误
//        XueSheng<String> x4 = new XueSheng<>("张三","优秀");//错误
//        XueSheng<Number> x5 = new XueSheng<>("张三",89.0);//错误（Number类型没有实现Comparable，它的子类都实现了该接口）
    }

    @Test
    public void test02(){
        Circle[] arr = new Circle[3];
        arr[0] = new Circle(1.5);
        arr[1] = new Circle(1.2);
        arr[2] = new Circle(1.8);
//        ArrayTools.sort(arr);//编译没有问题，运行运行有问题
        // java.lang.ClassCastException: cn.itcast.generic_泛型.Circle cannot be cast to java.lang.Comparable
    }

}

class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
}


    class ArrayTools{
    //这里 <T extends Comparable> 表示T类型的上限是Comparable，Comparable是接口，表示T 要实现Comparable接口的意思。
    // 用这个编译时就会告诉你报错，解决办法是Circle实现Comparable接口
    public static <T extends Comparable> void sort(T[] arr){
        for(int i = 1; i < arr.length; i++) {
            for(int j = 0; j < arr.length-i; j++) {
                Comparable left = (Comparable) arr[j];
                if(left.compareTo(arr[j+1])>0){
                    T temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    // 会报异常示例
    /*public static <T> void sort(T[] arr){
        for(int i = 1; i < arr.length; i++) {
            for(int j = 0; j < arr.length-i; j++) {
                Comparable left = (Comparable) arr[j];//这句有风险，这句代码要运行通过，要求T类型必须实现Comparable接口
                if(left.compareTo(arr[j+1])>0){
                    T temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }*/
}

/*
学生类，包含姓名和成绩。
现在成绩类型不确定，但是要求成绩必须是Number或Number的子类对象。
java.lang.Number表示数值类型，例如它的子类有。
加一个要求，成绩不仅要求是Number类或它的子类，还要求实现Comparable接口
 */
class XueSheng<T extends  Number & Comparable>{
    private String name;
    private T score;

    public XueSheng(String name, T score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getScore() {
        return score;
    }

    public void setScore(T score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "XueSheng{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}