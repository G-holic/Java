package cn.itcast07.exer.method;

public class MethodExer3 {
    public static void main(String[] args) {
        //先创建MyInt对象
        MyInt myInt = new MyInt();
        myInt.value = 9;

        // 调用方法
        System.out.println(myInt.value + "是自然数吗： " + myInt.isNatural());
        System.out.println(myInt.value + "约数的个数是： " + myInt.approximateNumberCount());
        System.out.println(myInt.value + "是素数吗： " + myInt.isPrimeNumber());
        System.out.println(myInt.value + "的所有约数是" + myInt.getAllPrimeNumber());//用一个数组类型的变量，接收数组的首地址
        int[] allPrimeNumber = myInt.getAllPrimeNumber();
        for (int i = 0; i < allPrimeNumber.length; i++) {
            System.out.print(allPrimeNumber[i] + " ");

        }
    }
}
