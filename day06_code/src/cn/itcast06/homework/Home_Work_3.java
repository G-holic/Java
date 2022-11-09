package cn.itcast06.homework;

import java.util.Scanner;

// 3、查找满分学员
/*
*从键盘输入本组学员的人数，再从键盘输入本组学员的姓名和成绩，显示学员姓名和成绩。最后查找是否有满分(100)学员，如果有显示姓名，否则显示没有满分学员。
*
* */
public class Home_Work_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入本组学员的人数： ");
        int count = input.nextInt();

        String[] names = new String[count];
        int[] grades = new int[count];
        for (int i = 0; i < grades.length; i++) {
            System.out.print("请输入第"+(i+1)+"个学员的姓名");
            names[i] = input.next();

            System.out.print("请输入第"+(i+1)+"个学员的成绩");
            grades[i] = input.nextInt();
        }
        input.close();

        System.out.println("所有学员的成绩如下：");
        for (int i = 0; i < grades.length; i++) {
            System.out.println(names[i]+" "+grades[i]);
        }

        boolean flag = false;
        System.out.print("本组满分的学员: ");
        for (int i = 0; i < grades.length; i++) {
            if (grades[i]==100){
                System.out.println(names[i]);
                flag = true;
            }
        }
        if (!flag){
            System.out.println("不存在");
        }

    }
}
