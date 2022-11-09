package cn.itcast07.exam;

/*
1、随机产生10个[0,100)的偶数，并按照从大到小的顺序排列。
（可以使用冒泡排序或直接选择排序）
 */
public class Exam1 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        System.out.println("排序之前：");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 50 + 1) * 2;
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // 冒泡排序(从小到大)
//        System.out.println("\n排序之后：");
//        for (int i = arr.length - 1; i >= 0; i--) {
//            for (int j = 0; j < arr.length - 1; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    int temp = arr[j + 1];
//                    arr[j + 1] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
        // 冒泡排序(从大到小)
        System.out.println("\n排序之后：");
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            ;

        }
    }
}
