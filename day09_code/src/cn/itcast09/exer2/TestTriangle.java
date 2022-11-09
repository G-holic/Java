package cn.itcast09.exer2;

public class TestTriangle {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.setBases(1,1,2);

        System.out.println("t对象的信息：" + t.getInfo());
        t.setBases(3,4,5);
        System.out.println("t对象的信息：" + t.getInfo());

        System.out.println("单独获取某条边c = " + t.getC());
        //单独修改c边长
//        t.setC(8);//编译错误，因为set方法对于外界来说，不存在
    }
}
