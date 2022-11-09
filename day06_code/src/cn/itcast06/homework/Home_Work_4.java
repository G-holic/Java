package cn.itcast06.homework;

import java.util.Scanner;

// 4、查字
/*
*公司年会有一个寻找锦鲤的游戏，每一个员工随意写一个字，如果在“锦鲤”词库中有这个字，那么就奖励500元锦鲤红包，否则就没有，每人只能玩一次。

现有锦鲤字库如下，它们按照Unicode编码值从小到大排序：
* char[] koiFishWords = {'一','今','地','定','尚','年','开','我','果','火','爱','硅','结','花','谷','遍'};
*
* */
public class Home_Work_4 {
    public static void main(String[] args) {
        char[] koiFishWords = {'一', '今', '地', '定', '尚', '年', '开', '我', '果', '火', '爱', '硅', '结', '花', '谷', '遍'};

        Scanner input = new Scanner(System.in);
        System.out.print("请输入你写的一个字: ");
        char word = input.next().charAt(0);

        int index = -1;
        for (int left = 0, right = koiFishWords.length - 1; left <= right;) {
            int mid = left + (right - left) / 2;
            if (koiFishWords[mid] == word) {
                index = mid;
                break;
            } else if (koiFishWords[mid] > word) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        if (index != -1) {
            System.out.println("你是锦鲤！！！恭喜获得锦鲤红包500元");
        } else {
            System.out.println("抱歉，差点运气！");
        }

    }
}
