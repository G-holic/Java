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
public class MathTools {
    int compare(int a, int b) {
        return a - b;
    }

    int compare(double a, double b) {
//        return a-b;//编译错误，因为a和b是double,相减的结果也是double，而方法的返回值类型要求是int
//        return (int)(a-b);//编译通过，但是有问题。假设a = 5.6，b=5.2，它俩不相等，但是 (int)(a-b)结果是0，意味着相等
        if (a > b) {
            return 1;//只要是正整数就可以，习惯上用1
        } else if (a < b) {
            return -1;
        } else {
            return 0;
        }
    }

    int compare(char a, char b) {
        return a - b;
    }
}
