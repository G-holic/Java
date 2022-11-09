package cn.itcast07.method;

public class Rectangle {
    //length和width是实例变量，因为它们在方法外面声明，它们不是static修饰的，是非静态的成员变量，通常叫做实例变量
    double length;
    double width;


    void print(char sign) {
        for (int i = 0; i <= length; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(sign);
            }
            System.out.println();
        }
    }

    String getInfo() {
        return "长：" + length + ",宽：" + width;
    }
}
