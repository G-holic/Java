package cn.itcast08.exer.param;

/*
（1）声明数组工具类ArraysTools
- 方法1：String toString(int[] arr)，遍历结果形式：[元素1，元素2，。。。]
- 方法2：int[] grow(int[] arr)，可以实现将一个数组扩大为原来的2倍
（2）在测试类的main中调用测试
 */
public class ArrayTools {
    String toString(int[] arr) {
        String str = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                str += arr[i];
            } else {
                str += "," + arr[i];
            }
        }
        str += "]";
        return str;
    }

    int[] grow(int[] arr){
        int[] newArr = new int[arr.length*2];
        //把原来arr数组的元素复制到newArr
        //arr是你原来的房子
        //newArr是你新买的更大的房子
        //需要把原来arr房子里面东西搬过去
        for (int i = 0; i < arr.length; i++) {
            newArr[i] =arr[i];
        }
        return newArr;
    }
}
