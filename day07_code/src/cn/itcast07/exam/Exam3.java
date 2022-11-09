package cn.itcast07.exam;

public class Exam3 {
    public static void main(String[] args) {
        Goods g1 = new Goods();
        g1.id = "1001";
        g1.name = "键盘";
        g1.price = 99.99;

        Goods g2 = new Goods();
        g2.id = "1002";
        g2.name = "鼠标";
        g2.price = 88.88;

        System.out.println("商品编号\t商品名称\t价格");
        System.out.println(g1.id+"\t" + g1.name+"\t"+g1.price);
        System.out.println(g2.id+"\t" + g2.name+"\t"+g2.price);

    }
}
