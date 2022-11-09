package cn.itcast06.class06;

/*
二维数组：
    当同样数据类型的数据，有多组需要一起存储，一起处理时，就需要用二维数组。
    例如：存储咱们班6个小组的学员成绩。

1、二维数组的声明
    元素的数据类型[][] 数组名; //推荐

    元素的数据类型 数组名[][];
    元素的数据类型[] 数组名[];

2、二维数组的初始化
(1)静态初始化
数组名 = new 元素的数据类型[][] {{第一行/组的元素列表}, {第二行/第二组的元素列表},...};

3、使用
（1）如何获取总行数：  二维数组名.length
（2）如何获取一行：   二维数组名[行下标]
    行下标的范围[0,  二维数组名.length-1]
（3）获取一行的元素个数：二维数组名[行下标].length  ==> 二维数组名[行下标]本质上是一个一维数组
（4）获取某一行某个元素：  二维数组名[行下标][列下标]
    列下标的范围[0, 二维数组名[行下标].length-1]

（5）遍历
    for(int i=0; i<   二维数组名.length； i++){
        for(int j=0; j<二维数组名[i].length; j++){
            ....
        }
    }

 */
public class Test06DoubleDimensionalArray {
    public static void main(String[] args) {
        //  例如：存储咱们班6个小组的学员成绩。
        /*
        int[][] grades;

        grades = new int[][]{
                {89,78,86,96,99},
                {89,87,56,99},
                {80,84,56,99,100,12}
        };
        */
        int[][] grades = {
                {89, 78, 86, 96, 99},
                {89, 87, 56, 99},
                {80, 84, 56, 99, 100, 12}
        };

        System.out.println("二维数组名： " + grades);
        //[[I@1b6d3586：[[：二维数组, I表示元素类型是int，@1b6d3586是hashCode值

        System.out.println("第一行的数据： " + grades[0]);
//        第一行的数据： [I@4554617c
        //[：一维数组，I表示元素类型是int，@4554617c是hashCode值
        /*
        从上面可以看出，可以把二维数组看成一维数组，
        元素类型是 int[],  例如：[I
        第1个元素：{89,78,86,96,99}
        第2个元素：{89,87,56,99}
        第3个元素：{80,84,56,99,100,12}

         */
        System.out.println("行数： " + grades.length);

        System.out.println("第一行的第1个数据： " + grades[0][0]);
        System.out.println("第一行的第2个数据： " + grades[0][1]);

        // 遍历二维数组
        for (int i = 0; i < grades.length; i++) { // 外循环循环行
            //grades[i]是一个一维数组
            /*
            grades[0]是一个一维数组{89,78,86,96,99}
            grades[1]是一个一维数组{89,87,56,99}
            grades[2]是一个一维数组{80,84,56,99,100,12}
             */
            for (int j = 0; j < grades[i].length; j++) {
                System.out.print(grades[i][j] + " "); //输出第i行的一个元素
            }
            System.out.println(); //输出完i行的元素之后，换行
        }
    }
}
