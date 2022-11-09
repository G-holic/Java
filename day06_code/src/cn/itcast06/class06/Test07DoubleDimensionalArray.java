package cn.itcast06.class06;
/*
2、二维数组的初始化
(1)静态初始化
数组名 = new 元素的数据类型[][] {{第一行/组的元素列表}, {第二行/第二组的元素列表},...};
（2）动态初始化
A：规则的矩阵（每一行的列数是相同的）
 数组名 = new 元素的数据类型[总行数][每一行的列数];

 */
public class Test07DoubleDimensionalArray {
    public static void main(String[] args) {
        int[][]  arr = new int[4][5]; //二维数组一共有4行，每一行都有5列

        //二维数组可以看成元素是一维数组的一维数组
        for (int i = 0; i < arr.length; i++) { // 外循环控制行下标

//            arr[i] 代表一行，一行又是一个一维数组
            for (int j =0;j<arr[i].length;j++){
                arr[i][j] = i+1;
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();

        }
    }
}
