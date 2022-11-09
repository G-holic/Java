package cn.itcast06.class06;
/*
2、二维数组的初始化
(1)静态初始化
数组名 = new 元素的数据类型[][] {{第一行/组的元素列表}, {第二行/第二组的元素列表},...};
（2）动态初始化
A：规则的矩阵，每一行的列数相同的
    数组名 = new 元素的数据类型[总行数][每一行的总列数];
B：不规则的二维表（每一行的列数不相同，即每一行有长有短）
    ①先确定行数
        数组名 = new 元素的数据类型[总行数][]; //每一行的列数暂不指定，未定，待定
    ②再依次确定每一行的列数
 */

public class Test08DoubleDimensionalArray {
    public static void main(String[] args) {
        int[][] arr = new int[5][];//二维数组一共有5行，但是每一行几个元素未定
        System.out.println(arr[0]); //把二维数组看成一维数组的话，元素类型是int[]类型，int[]数组是引用数据类型，默认值就是null
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

        for (int i = 0; i < arr.length; i++) {//外循环控制行下标
            //arr[i]代表一行，一行又是一个一维数组
            /*
            发生了空指针异常NullPointerException，
            当发生空指针异常时，先找.前面的东西，看它是否为null，
            这里arr[i]是null，所以会发生空指针异常

            如果要解决空指针异常，必须给arr[i]赋值。
            因为arr[i]是代表一行，代表一个一维数组，所以必须给他new一个一维数组
            arr[i] = new int[下标为i行的长度，元素个数];
            arr[0] ，长度为1
            arr[1] ，长度为2
            arr[2] ，长度为3
            arr[3] ，长度为4
            arr[4] ，长度为5
             */
            arr[i] = new int[i+1];
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = i + 1;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
