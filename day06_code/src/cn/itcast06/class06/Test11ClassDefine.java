package cn.itcast06.class06;
/*
类的定义/声明格式：
【修饰符】 class 类名{
}

【修饰符】可以缺省。
    修饰符的详细内容后面学习。
    这里先说一下，public和缺省public有什么区别？
    （1）
    如果class前面有public，要求.java文件名必须与class后面的类名相同（包括单词和大小写）。
    一个.java文件只能有一个public的类。

    如果class前面没有public，不要求类名与.java文件名相同。
    建议大家一个.java只写一个类，类名和.java文件名相同，这样便于维护。
    （2）如果class是public的，可以跨包使用，
        如果class没有public，那么不能跨包使用。

类名：
    尽量见名知意。
    每一个单词的首字母大写。
 */
public class Test11ClassDefine {
    public static void main(String[] args) {
        Student s = new Student();
    }
}
