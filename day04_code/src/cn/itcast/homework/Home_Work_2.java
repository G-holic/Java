package cn.itcast.homework;

/*
 * 2、趣味折纸
 * 世界最高山峰是珠穆朗玛峰，它的高度是8848.86米，假如我有一张足够大的纸，
 * 它的厚度是0.1毫米。请问，我折叠多少次，可以折成珠穆朗玛峰的高度?
 * */
public class Home_Work_2 {
    public static void main(String[] args) {

        int count = 0;

        double height = 88848.86 * 1000;

        for (double paper = 0.1; paper < height; paper *= 2) {
            count++;
        }
        System.out.println(count);
    }
}
