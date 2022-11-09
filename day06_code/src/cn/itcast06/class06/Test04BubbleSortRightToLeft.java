package cn.itcast06.class06;

public class Test04BubbleSortRightToLeft {
    public static void main(String[] args) {
        int[] arr = {6, 9, 2, 9, 1};
        /*
        最终目标：从小到大
        排序过程：每一轮从最右边开始，往左边移动较小的元素
        第一轮：
            arr[4]<arr[3]? 1<9  成立  {6,9(前),2,1,9(后)}
            arr[3]<arr[2]? 1<2  成立  {6,9(前),1,2,9(后)}
            arr[2]<arr[1]? 1<9(前)  成立  {6,1,9(前),2,9(后)}
            arr[1]<arr[0]? 1<6  成立  {1,6,9(前),2,9(后)}

         第二轮：
             arr[4]<arr[3]? 9(后)<2不成立
            arr[3]<arr[2]? 2<9(前)成立，{1,6,2，9(前),9(后)}
            arr[2]<arr[1]? 2<6 成立   {1,2,6，9(前),9(后)}

         第三轮：
             arr[4]<arr[3]?   9(后)<  9(前)不成立
             arr[3]<arr[2]?   9(前)<6  不成立
         第四轮：
             arr[4]<arr[3]?   9(后)<  9(前)不成立
         */
        for (int i = 1; i < arr.length; i++) {
            /*
            当i=1，
                arr[4]<arr[3]       arr[j]<arr[j-1] j=4
                arr[3]<arr[2]       arr[j]<arr[j-1] j=3
                arr[2]<arr[1]       arr[j]<arr[j-1] j=2
                arr[1]<arr[0]       arr[j]<arr[j-1] j=1  j>=1
             当i=2
                arr[4]<arr[3]
                arr[3]<arr[2]
                arr[2]<arr[1]
             当i=3
                arr[4]<arr[3]
                arr[3]<arr[2]
             当i=4
                arr[4]<arr[3]
             */
            for (int j = arr.length - 1; j >= i; j--) {
                //后面的元素<前面的元素，交换
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
