package cn.itcast.exam;
//1、请计算9与7按位与、按位或、按位异或的结果
/*
正数的原码、反码、补码都一样。
按位与、按位或、按位异或是基于补码计算。
....1001
....0111

....1001
....0111
....0001

....1001
....0111
....1111

....1001
....0111
....1110

9&7 = 1
9|7 = 15
9^7 = 14


*/
public class Exam1 {
    public static void main(String[] args) {

        System.out.println(9 & 7); // 1
        System.out.println(9 | 7); // 15
        System.out.println(9 ^ 7); // 14
    }

}
