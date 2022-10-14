package cn.itcast.class01;

public class MyInfo {
    public static void main(String[] args) {
        String name = "李四";
        int age = 22;
        String gender = "男";
        Double weight = 62.5;
        boolean marry = false;

        System.out.println("name");//原样显示字符串常量值"name"
        System.out.println(name);//把变量name中的值输出
        System.out.println(age);
        System.out.println(gender);
        System.out.println(weight);
        System.out.println(marry);

        System.out.println("----------------");
        // + 表示拼接，把"姓名："字符串常量 和name字符串变量的值，拼接起来，构成一个字符串值
        System.out.println("我叫"+name+"年龄"+age+"岁"+"性别"+gender+"体重"+weight+"kg"+"婚姻情况是"+marry);

    }
}
