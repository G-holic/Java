package cn.itcast08.array_对象数组;

public class TestTwoArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1},
                {2,2},
                {3,3,3},
                {4,4,4,4}
        };
        /*
        可以把二维数组看成一维数组，元素类型是int[]，它就是对象数组了。
        把{1}看成对象
        把{2,2}看成对象
        把{3,3,3}看成对象
        把{4,4,4,4}看成对象
         */

        int[][] nums = new int[4][];// 创建了长度为4的一维数组，元素类型是int[]
        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums[i]); // null
            nums[i] = new int[i+1];
            /*
            当i=0时，nums[0] = new int[1]; //又创建一个数组对象，一维数组，元素类型是int,长度是1
            当i=1时，nums[1] = new int[2]; //又创建一个数组对象，一维数组，元素类型是int,长度是2
            当i=2时，nums[2] = new int[3]; //又创建一个数组对象，一维数组，元素类型是int,长度是3
            当i=3时，nums[3] = new int[4]; //又创建一个数组对象，一维数组，元素类型是int,长度是4
             */
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = i+1;
                System.out.print(nums[i][j]);
            }
            System.out.println();
        }
    }
}
