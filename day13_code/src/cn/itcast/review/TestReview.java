package cn.itcast.review;

public class TestReview {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
//        Object[] arr = nums; // 错误

        int[][] two = {{1,2,3,4,5,},{2,4,51,51,},{5,32,6}};
        Object[] arr = two; // 可以， 因为二维数组可以看成元素是int[] 的一维数组
    }
}
