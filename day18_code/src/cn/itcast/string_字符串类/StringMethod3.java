package cn.itcast.string_字符串类;

import org.junit.Test;

import java.util.Scanner;

/*
3、和字符，或字符数组有关
（16）char charAt(index)：返回[index]位置的字符
（17）char[] toCharArray()： 将此字符串转换为一个新的字符数组返回

（18）String(char[] value)：返回指定数组中表示该字符序列的 String。
（19）String(char[] value, int offset, int count)：返回指定数组中表示该字符序列的 String。

（20）static String copyValueOf(char[] data)： 返回指定数组中表示该字符序列的 String
（21）static String copyValueOf(char[] data, int offset, int count)：返回指定数组中表示该字符序列的 String
（22）static String valueOf(char[] data, int offset, int count) ： 返回指定数组中表示该字符序列的 String
（23）static String valueOf(char[] data)  ：返回指定数组中表示该字符序列的 String
 */
public class StringMethod3 {
    @Test
    public void test01(){
        Scanner input = new Scanner(System.in);//使用有参构造创建Scanner对象
        System.out.print("请输入性别：");//不换行的输出
        char gender = input.next().charAt(0);
        /*
        input.next()，通过对象调用next方法，说明next()是非静态方法
        input.next()的返回值类型String类型，因为只有String类型才有charAt()方法，
        即input.next()的结果是一个字符串对象

        xx.charAt(0)：字符串对象再调用charAt()方法
        (0)是表示取字符串的第一个字符，即返回字符串内部的char[] value数组的第一个元素。
        */
        System.out.println("gender = " + gender);
        /*
        System.out：是System类的一个静态常量对象，因为通过System类名.访问的
        println方式是out对象调用，它是非静态方法，而且不是System类中的
         */
        input.close();
    }
    @Test
    public void test03(){
        String str = "hello";
        char[] chars = str.toCharArray();//是直接return内部的value数组吗，还是复制一个新数组呢
        //看源码发现是新建数组，因为要保证字符串对象不可变
        chars[0] = 't';
        System.out.println(str);// hello
    }

    @Test
    public void test04(){
        char[] arr = {'h','e','l','l','o'};
        System.out.println(new String(arr));//hello
        System.out.println(new String(arr,1,4));//ello
        System.out.println(String.valueOf(arr));//hello
        System.out.println(String.valueOf(arr,1,4));//ello
    }
}
