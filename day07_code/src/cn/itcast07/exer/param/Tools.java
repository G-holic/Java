package cn.itcast07.exer.param;

public class Tools {
    int min(int... nums) {
        int minValue = nums[0]; //这句代码有问题，当没有传入数字时，nums[0]不存在，会发生空指针异常
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < minValue) {
                minValue = nums[i];
            }
        }
        return minValue;
    }

    int maxApproximate(int... nums) {
        int min = min(nums);// 找出它们中最小的

        int result = 1;
        for (int i = min; i >= 1; i--) {
            boolean flag = true;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] % i != 0) {
                    flag = false; //说明i不是它们的公约数
                    break;
                }
            }
            if (flag) {
                result = i;
                break;
            }
        }
        return result;
    }
}
