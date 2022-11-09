package cn.itcast.thread_多线程;

/*
 * public final int getPriority() ：返回线程优先级
 * public final void setPriority(int newPriority) ：改变线程的优先级
 * 线程优先级高的，更多的机会/概率被优先调用。
 * 优先级有范围：[MIN_PRIORITY, MAX_PRIORITY]，即[1,10]
 * 3个常量值：
 *  MIN_PRIORITY:1
 *  MAX_PRIORITY:10
 *  NORM_PRIORITY:5
 */
public class ThreadMethod2 {
    public static void main(String[] args) {
//        System.out.println(Thread.MAX_PRIORITY);// 10
//        System.out.println(Thread.MIN_PRIORITY);// 1

        Thread t = new Thread() {
            @Override
            public void run() {
                /*// 让这个线程打印1~10的偶数
                for (int i = 2; i <= 10; i += 2) {
                    System.out.println("自定义线程: " + i);
                }*/
                System.out.println(getName() + " : " + getPriority()); // 打印当前优先级
            }
        };
//        t.setPriority(Thread.MAX_PRIORITY);// java.lang.IllegalArgumentException 非法参数范围   参数范围是(1~10)
        // 如果优先级不在 MIN_PRIORITY 到 MAX_PRIORITY 范围内。就会报这个异常
        t.start();

        /*// 让这个线程打印1~10的偶数
        for (int i = 2; i <= 10; i += 2) {
            System.out.println("主线程: " + i);
        }*/
        System.out.println(Thread.currentThread().getName() + " : " + Thread.currentThread().getPriority());
    }
}
