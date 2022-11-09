package cn.itcast.review;

public class TestReview {
    public static void main(String[] args) {
        Week w1 = Week.MONDAY;
        String name = w1.name();
        System.out.println(name);// MONDAY
        //w1和 "MONDAY" 它们看起来好像一样，但是是不同类型的对象
        //w1是Week类型
        //"MONDAY"是String类型

        Week[] values = Week.values();

        System.out.println("-------------------");

        String str1 = "123";
        String str2 = "456";

        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);

        System.out.println(str1 + str2); // 拼接 123456
        System.out.println(num1 + num2); // 相加 579

        //Java是一种强类型的语言
        int a= 123;
        // 转成字符串
        String string = a+ "";
        String string1 = String.valueOf(a); // 其他包装类也是用valueOf()

        // 字符大小写转换
        char small = 'a';
        char big = (char)(small-32);
        char big1 = Character.toUpperCase(small);

        System.out.println("------------------");
        // 缓存对象
        Byte b1 = 1;
        Byte b2 = 1;
        System.out.println(b1 == b2);//比较地址

        Integer i1 = 1;
        Integer i2 = 1;
        System.out.println(i1 == i2);//true

        Integer x = 156;
        Integer y = 156;
        System.out.println(x == y);// false   范围-128~127（注意：字符类型是0~127）


        System.out.println("------------------");
        // 包装对象不可变
        Integer num = 1;
        change(num);
        System.out.println("num = " + num); // 1



    }
    public static void change(Integer i){
        i++;//i指向了新对象 2
        System.out.println("i = " + i); // 2
    }
}
