package cn.itcast08.method_方法;

public class TestVarParam {
    public static void main(String[] args) {
        TestVarParam t= new TestVarParam();
        System.out.println(t.sum(1,5,6,3,4,2));
        System.out.println(t.max(1,5,6,3,4,2));
    }

    //可以实现n个整数的和
    int sum(int... nums) {
        int he = 0;
        for (int i = 0; i < nums.length; i++) {
            he += nums[i];
        }
        return he;
    }

    //可以实现至少一个整数的情况，求最大值
    int max(int first, int... nums) {
        int max = first;
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
        }
        return max;
    }
}
