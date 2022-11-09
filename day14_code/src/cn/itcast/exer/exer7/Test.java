package cn.itcast.exer.exer7;

/*
考点：
（1）实例变量是每一个对象“独立”的
这里创建了四个Inner的对象，四个Inner对象的a变量值都是独立的

（2）非静态内部类在main中创建对象时，需要依赖于外部类的对象
 */
public class Test{
    public Test(){
        Inner s1 = new Inner();
        s1.a = 10;
        Inner s2 = new Inner();
        s2.a = 20;
        Inner s3 = new Inner();
        System.out.println(s3.a);//5
    }
    class Inner{
        public int a = 5;
    }
    public static void main(String[] args) {
        Test t = new Test();
        Inner r = t.new Inner();//Inner是Test类的非静态内部类
        System.out.println(r.a);//5
    }
}
