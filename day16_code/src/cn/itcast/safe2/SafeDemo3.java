package cn.itcast.safe2;

/*
实例变量可以共享，但是前提必须是同一个对象。

    @Override
    public void run() {
        if (target != null) {
            target.run(); //这里三个Thread对象的target是同一个，都是TicketRunnable的对象t
        }
    }
 */
public class SafeDemo3 {
    public static void main(String[] args) {
        TicketRunnable t = new TicketRunnable();

        // 代理同一个对象
        Thread t1 = new Thread(t, "窗口一");
        Thread t2 = new Thread(t, "窗口二");
        Thread t3 = new Thread(t, "窗口三");

        t1.start();
        t2.start();
        t3.start();

    }
}

class TicketRunnable implements Runnable {
    private int i = 100;
    private Object lock = new Object();

    @Override
    public void run() {
        while (i >= 1) {

            // 同步代码块
//            synchronized (lock){
            synchronized (this) { // 指向TicketRunnable一个对象
                if (i >= 1) { // 加入条件
                    try {
                        Thread.sleep(100);//这里加入休眠是为了让问题暴露的更明显
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    i--;
                    System.out.println(Thread.currentThread().getName() + "卖出1张票，剩余" + i + "张");
                }

            }

        }

    }


}
