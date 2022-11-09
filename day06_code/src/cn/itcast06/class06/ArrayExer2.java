package cn.itcast06.class06;

/*
 1
 2 2
 3 3 3
 4 4 4 4
 5 5 5 5 5
 */
public class ArrayExer2 {
    public static void main(String[] args) {
        int[][] arr = {
                {1},
                {2, 2},
                {3, 3, 3},
                {4, 4, 4, 4},
                {5, 5, 5, 5, 5},
        };
        for (int i = 0; i < arr.length; i++) {//外循环控制行下标  i是行下标
            for (int j = 0; j < arr[i].length; j++) {//内循环控制列下标 j是列下标
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
