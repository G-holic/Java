package cn.itcast09.encapsulability_封装.other;

import cn.itcast09.encapsulability_封装.Father;

//TestOther它和Father类是不同包的类
//而且TestOther也不是Father类的子类
public class TestOther {
    public static void main(String[] args) {
        Father f = new Father();
//        System.out.println(f.a);//不行，因为a是private，只能本类
//        System.out.println(f.b);//不行，因为b的权限修饰符是缺省，只能本包
//        System.out.println(f.c);//不行，因为c的权限修饰符是protected，跨包的话只能是子类
        System.out.println(f.d);//可以
    }
}
