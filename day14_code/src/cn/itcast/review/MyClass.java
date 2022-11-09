package cn.itcast.review;

public class MyClass extends MyFather implements MyInter {

    public void method(){
        System.out.println(super.MAX_VALUE);
        System.out.println(MyInter.MAX_VALUE);
    }
}
class fa{
    public static void main(String[] args) {
        MyClass m = new MyClass();
        m.method();
    }
}