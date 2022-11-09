package cn.itcast07.exer.method;

/*
* （1）声明一个MyInt类，

- 包含一个int类型的value属性
- 包含一个方法boolean isNatural()方法，用于判断value属性值是否是自然数。自然数是大于等于0的整数。
- 包含一个方法int approximateNumberCount()方法，用于返回value属性值的约数个数。在[1, value]之间可以把value整除的整数都是value的约数。
- 包含一个方法boolean isPrimeNumber()方法，用于判断value属性值是否是素数。如果value值在[1, value]之间只有1和value本身两个约数，并且value是大于1的自然数，那么value就是素数。
- 包含一个方法int[] getAllPrimeNumber()方法，用于返回value属性值的所有约数。返回[1, value]之间可以把value整除的所有整数。
*
* /*
return的作用：
（1）返回结果值
（2）结束当前方法的执行
 */
public class MyInt {
    int value;

    boolean isNatural() {
        return value >= 0; //返回结果是true和false,条件表达式满足，就返回true，否则返回false
    }

    int approximateNumberCount() {
        //在[1, value]之间可以把value整除的整数都是value的约数
        int count = 0;
        for (int i = 1; i <= value; i++) {
            if (value % i == 0) {
                count++;
            }
        }
        return count;
    }

    boolean isPrimeNumber() {
        //如果value值在[1, value]之间只有1和value本身两个约数，并且value是大于1的自然数，那么value就是素数。
//        if (value <= 1) {
//            return false;
//        }
//        if (approximateNumberCount() == 2) {
//            return true;
//        }
//        return false;
        // 简写以上代码
        return value > 1 && approximateNumberCount() == 2;//value大于1，并且约数的个数只有2个
    }

    int[] getAllPrimeNumber() {
        /*
        第一步：先创建一个数组，用来装所有的约数
        约束的个数，就是approximateNumberCount()的返回值
         */
        int[] allApproximateNumber = new int[approximateNumberCount()];
        /*
        第二步：一一找这些约数，放到allApproximateNumber数组中
        在[1,value]之间找约数
         */
        for (int i = 1, index = 0; i <= value; i++) {
            if (value % i == 0) {
                allApproximateNumber[index++] = i;
            }
        }
        return allApproximateNumber; //数组名中存储的是数组的首地址
    }
}
