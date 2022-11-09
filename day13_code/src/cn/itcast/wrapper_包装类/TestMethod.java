package cn.itcast.wrapper_包装类;

/*
（1）获取某个数据类型的范围：
最常用的包装类Integer，依次类推其他包装类。
包装类.MAX_VALUE
包装类.MIN_VALUE

（2）把十进制的整数转为其他进制
//查看25这个十进制值的二进制、八进制、十六进制
        System.out.println(Integer.toBinaryString(25));//把25转为二进制
        System.out.println(Integer.toOctalString(25));//把25转为八进制
        System.out.println(Integer.toHexString(25));//把25转为十六进制

 （3）基本数据类型的值与字符串之间的转换方法
 包装类有可以把字符串转为基本数据类型的方法
int Integer.parseInt(字符串)
double Double.parseDouble(字符串)
boolean Boolean.parseBoolean(字符串)
...
Integer.valueOf(字符串）
Double.valueOf(字符串）
....

（4）针对字符类型，有转大小写的方法
Character.toUpperCase(字符)
Character.toLowerCase(字符)

（5）比较大小

Double.compare(两个小数)
Integer.compare(两个整数)
返回值都是int类型，要么返回正整数，要么是负整数，要么是0，分别表示大于、小于、等于的关系。

 */
public class TestMethod {
    public static void main(String[] args) {
        System.out.println("int类型的最大值: " + Integer.MAX_VALUE);
        System.out.println("int类型的最小值: " + Integer.MIN_VALUE);

        System.out.println("--------------------------");
        System.out.println("long类型的最大值: " + Long.MAX_VALUE);
        System.out.println("long类型的最小值: " + Long.MIN_VALUE);

        System.out.println("--------------------------");
        // 查看25这个十进制值的二进制、八进制、十六进制
        System.out.println(Integer.toBinaryString(25));// 把25转为二进制
        System.out.println(Integer.toOctalString(25));// 八进制
        System.out.println(Integer.toHexString(25));// 十六进制

        System.out.println("--------------------------");
        // 把一下字符串转为基本数据类型的值
        String s1 = "123";
        int num = Integer.parseInt(s1);
        int numValue = Integer.valueOf(s1);
        System.out.println(num);
        System.out.println(numValue);

        String s2 = "2.86";
        double d1 = Double.parseDouble(s2);
        double d2 = Double.valueOf(s2);
        System.out.println(d1);
        System.out.println(d2);

        System.out.println("s1 + s2 = " + (s1 + s2));
        System.out.println("num + d1 = " + (num + d1));

        System.out.println("--------------------------");
        // 把基本数据类型变成字符串
        int i = 1;
        String str1 = i + ""; // 方法1: 变成字符串
        String str2 = String.valueOf(i); // 方法2: 变成字符串

        System.out.println("--------------------------");
        // 字符类型大小写转换
        char letter = 'a';
        // 转大写
        char big = (char) (letter - 32);// 方法1
        System.out.println(letter + "->" + big);

        char upper = Character.toUpperCase(letter); // 方法2
        System.out.println(letter + "->" + upper);

        // 转小写
        char lower = Character.toLowerCase(upper);
        System.out.println(upper + "->" + lower);

        System.out.println("--------------------------");
        // 比较两个小数的大小
        double x = 2.3;
        double y = 2.3;
        if (x > y) {
            System.out.println("x > y");
        } else if (x < y) {
            System.out.println("x < y");
        } else {
            System.out.println("x = y");
        }

        //如果x大于y，用正整数表示
        //如果x小于y，用负整数表示
        //如果x等于y，用0表示
        System.out.println(Double.compare(x, y));

    }

}
