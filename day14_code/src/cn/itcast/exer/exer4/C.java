package cn.itcast.exer.exer4;

interface A{
    int x = 1;
}
class B{
    int x = 2;
}
public class C extends B implements A{
    public void pX(){
//        System.out.println(x);//编译报错，因为此时x有歧义，不明确是A或B中的哪个
        System.out.println(super.x);
        System.out.println(A.x);
    }

    public static void main(String[] args) {
        new C().pX();//匿名对象，调用方法

   /*     C c = new C();//小写的c相当于对象名
        c.pX();*/
    }
}
