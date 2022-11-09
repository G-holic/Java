package cn.itcast07.homework.variable;

public class MathTools {
    boolean isEven(int... nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                return false;
            }
        }
        return true;
    }

    boolean isPositive(int... nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= 0) {
                return false;
            }
        }
        return true;
    }

    int[] toArray(int... nums) {
        int[] arr = new int[nums.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = nums[i];
        }
        return arr;
    }
}
