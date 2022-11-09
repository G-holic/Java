package cn.itcast06.class06;

public class Test03BubbleSortBetter {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 9, 7};
//        int[] arr = {1, 3, 5, 7, 9};
        /*
        从小到大
        第一轮：
            arr[0]与arr[1] 不换
            arr[1]与arr[2] 不换
            arr[2]与arr[3] 不换
            arr[3]与arr[4] 不换

            确定数组是已经有序了
            不需要第二轮
         */

        int lun = 0;
        for (int i = 1; i < arr.length; i++) {
            lun++;
            //标记法
            boolean flag = true; // 假设已经有序
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = false;//数组还未有序，还在调整顺序当中
                    //如果这一轮，if条件一次都没有满足，说明没有需要交换的，说明数组已经有序了
                }
            }
            if (flag) { //这个条件不属于内循环
                break; //结束的是外循环
            }
        }
        System.out.println("比较了" + lun + "轮");
        //显示结果
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
