package cn.itcast.class02;
/*
一个char类型的变量可以赋值为：
（1）单引号引起来的字符
（2）可以用字符的Unicode编码值的十进制值形式
（3）可以用字符的Unicode编码值的十六进制值形式
（4）部分字符需要用转义的方式表示
\t：Tab
\n：换行   把光标移到下一行行首
\\：\
\'：'
\"："
\b：退格键
\r：回车  把光标移到本行行首
*/
public class TestChar {
    public static void main(String[] args) {
        char c1 = 'a';
        char c2 = 97;
        char c3 = '\u0061';

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

//        System.out.println('\'); // 报错
        System.out.println('\\');
        System.out.println('\'');
        System.out.println("'"); // 这个方式输出单引号，不用转义
        System.out.println("\"");
        System.out.println('"'); //这方式输出双引号就不用转义

        System.out.println("--------------------");
        System.out.println("hello\tjava");
        System.out.println("hello\rjava");
        System.out.println("hello\njava");

        System.out.println("-------------------------");
        System.out.println("hello\tworld\tjava.");
        System.out.println("chailinyan\tis\tbeautiful.");
        System.out.println("姓名\t基本工资\t年龄");
        System.out.println("张三\t10000.0\t23");
    }
}
