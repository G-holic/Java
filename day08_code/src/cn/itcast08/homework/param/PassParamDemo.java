package cn.itcast08.homework.param;

/*
*1、方法的参数传递机制分析
* 在PassParamDemo类中，声明如下方法，并体会方法的参数传递机制，并尝试画图分析结果

- void  doubleNumber(int num)：将num变为原来的2倍大

- void toUpperCase(char letter)：将letter的小写字母转为大写字母

- void expandCircle(Circle  c，double times)：将Circle的c对象的半径扩大为原来的times倍。圆Circle类，包含radius属性。

- void doubleElement(int[] arr)：把arr数组的元素扩大2倍
- void grow(int[] arr)：将arr数组的长度变为原来的1.5倍
* */
public class PassParamDemo {
    void doubleNumber(int num) {
        num *= 2;
    }

    void toUpperCase(char letter) {
        letter -= 32;
    }

    void expandCircle(Circle c, double times) {
        c.radius *= times;
    }

    void doubleElement(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2;
        }
    }

    void grow(int[] arr) {
        arr = new int[arr.length * 2];
    }
}
