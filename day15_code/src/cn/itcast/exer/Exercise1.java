package cn.itcast.exer;

/*1、新年倒计时
    （1）已知java.lang包下有一个Thread类，这个类有一个静态方法：
    public static void sleep(long millis) throws InterruptedException
    调用这个方法可以实现程序休眠millis毫秒（1000毫秒=1秒）。

    （2）在测试类的main中，在for循环中调用上面的sleep方法，实现新年倒计时10,9,8，...，1，新年到！

    - 每循环1次执行一次sleep方法，可以模拟1秒输出一个数字。
    - 使用try...catch处理异常*/
public class Exercise1 {
    public static void main(String[] args) {
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000); //选中要放到try中的代码，按快捷键ctrl + alt + T
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("新年快乐！");
    }
}
