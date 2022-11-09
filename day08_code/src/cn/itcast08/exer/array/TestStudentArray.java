package cn.itcast08.exer.array;

import java.util.Scanner;

/*
（1）定义学生类Student
- 声明姓名和成绩实例变量，
- String getInfo()方法：用于返回学生对象的信息
（2）测试类的main中创建一个可以装3个学生对象的数组，从键盘输入3个学生对象的信息，并且按照学生成绩排序，显示学生信息
 */
public class TestStudentArray {
    public static void main(String[] args) {
        Student[] arr = new Student[3];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个学生的信息：");
            arr[i] = new Student();
            System.out.print("姓名： ");
            arr[i].name = input.next();
            System.out.print("成绩： ");
            arr[i].score = input.nextInt();


//            System.out.print("姓名： ");
//            String name = input.next();
//            System.out.print("成绩： ");
//            int score = input.nextInt();
//
//            Student stu = new Student();
//            stu.name = name;
//            stu.score = score;
//            arr[i] = stu;
        }

        System.out.println("\n所有学生的信息如下： ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getInfo());
        }

        System.out.println("按照成绩排序：");
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j].score > arr[j + 1].score) {
                    //交换两个成绩是错误
                    /*int temp = arr[j].score;
                    arr[j].score = arr[j+1].score;
                    arr[j+1].score = temp;*/
                    //交换两个学生对象
                    Student temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getInfo());
        }
        input.close();
    }
}
