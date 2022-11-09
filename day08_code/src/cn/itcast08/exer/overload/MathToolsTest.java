package cn.itcast08.exer.overload;

/*
（1）声明MathTools工具类，包含：
- int compare(int a, int b)：
比较两个整数大小关系，如果第一个整数比第二个整数大，则返回正整数，如果第一个整数比第二个整数小，则返回负整数，如果两个整数相等则返回0；
- int compare(double a, double b)：
比较两个小数大小关系，如果第一个小数比第二个小数大，则返回正整数，如果第一个小数比第二个小数小，则返回负整数，如果两个小数相等则返回0；
- int compare(char a, char b)：
比较两个字符大小关系，如果第一个字符比第二个字符编码值大，则返回正整数，如果第一个字符比第二个字符编码值小，则返回负整数，如果两个字符相等则返回0；
（2）在测试类的main方法中调用
 */
public class MathToolsTest {
    public static void main(String[] args) {
         MathTools tools = new MathTools();

        System.out.println(tools.compare(5,8)); //-3表示5<8
        System.out.println(tools.compare('d','8')); //44表示'd' > '8'
        System.out.println(tools.compare(5.4,5.6)); //-1表示5.4 < 5.6
    }
}
