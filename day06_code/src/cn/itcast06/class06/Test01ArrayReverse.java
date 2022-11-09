package cn.itcast06.class06;

public class Test01ArrayReverse {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 2, 5};

        //让arr中的元素实现反转：{5,2,5,4,1}
        //让arr中的元素实现反转：{5,2,5,4,1}
        /*
        方式：
        方式一：借助一个新数组    浪费一个数组
        方式二：首尾元素互换
            思考：谁和谁换
                        arr[0]~arr[4]
                        arr[1]~arr[3]
                 换几次:2次
                    arr.length/2
         */
        // 1.
//        for (int i = 0; i < arr.length/2; i++) {
////            arr[i] = arr[arr.length-1-i];
//            int temp = arr[i];
//            arr[i] = arr[arr.length-1-i];
//            arr[arr.length-1-i] = temp;
//        }

        for (int left = 0, right = arr.length - 1; left < right; left++, right--) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
        // 遍历显示
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }
}
