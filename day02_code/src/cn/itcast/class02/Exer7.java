package cn.itcast.class02;

public class Exer7 {
    public static void main(String[] args) {
        //1.定义一个变量，赋值为一个四位数整数，例如1234
        int num = 1234;

        //2.通过运算操作求出个位，十位，百位，千位
        int ge = num % 10;
        int shi = num / 10 % 10;
        int bai = num / 100 % 10;
        int qian = num / 1000 % 10;

        System.out.println(num + "个位上的数是：" + ge);
        System.out.println(num + "十位上的数是：" + shi);
        System.out.println(num + "百位上的数是：" + bai);
        System.out.println(num + "千位上的数是：" + qian);
    }


}
