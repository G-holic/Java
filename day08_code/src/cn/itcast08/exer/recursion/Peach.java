package cn.itcast08.exer.recursion;

/*
猴子吃桃子问题，猴子第一天摘下若干个桃子，当即吃了所有桃子的一半，还不过瘾，又多吃了一个。
第二天又将仅剩下的桃子吃掉了一半，又多吃了一个。
以后每天都吃了前一天剩下的一半多一个。到第十天，只剩下一个桃子。试求第一天共摘了多少桃子？

明确的已知条件：
（1）第十天，只剩下一个桃子
（2）前面每一天，都是先吃掉一半，再多吃一个

如果算第1天桃子的数量？
第10天：1
第9天：
    第9天桃子的数量 / 2 - 1 = 第10天桃子的数量
    反过来
    第9天桃子的数量 = (第10天桃子的数量 + 1) * 2;

第8天：
    第8天桃子数量 / 2 - 1 = 第9天桃子的数量;
    第8天桃子数量 = (第9天桃子的数量 + 1 ) * 2;

 ....


 */
public class Peach {
    public static void main(String[] args) {
        // 使用循环
        int count = 1;
        for (int i = 9; i >= 1; i--) {
            System.out.println("第" + (i + 1) + "天的桃子数量：" + count);
            count = (count + 1) * 2;
        }
        System.out.println("第1天的桃子数量：" + count);

        System.out.println("=======================");
        Peach p = new Peach();
        for (int day = 10; day>=1; day--) {
            System.out.println("第" + day + "天的桃子数量：" + p.peachCount(day));
        }
    }

    //使用递归
    /*
    假设 int peachCount(int day)可以求第day的桃子数量
    当day = 10， return 1;                               第10天，peachCount(10) = 1
    当day = 9， return (第10天桃子的数量 + 1) * 2;         第9天，peachCount(9) =（ peachCount(9+1)+1）*2;
    当day = 8， return (第8天桃子的数量 + 1) * 2;
     */
    int peachCount(int day) {
        if (day < 1 || day > 10) {
            return 0;
        }
        if (day == 10) {
            return 1;
        }
        return (peachCount(day + 1) + 1) * 2;
    }
}
