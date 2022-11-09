package cn.itcast.thread_继续线程;
/*
死锁：
    当两个或更多个线程，互相等待对方想要的锁/资源时，可能会出现死锁情况，要尽量避免同步的嵌套。
 */
public class DeadLock {
    public static void main(String[] args) {
        Object g = new Object();
        Object m = new Object();

        Owner s = new Owner(g,m);//卖家线程
        Customer c = new Customer(g,m);//顾客线程

        new Thread(s).start();
        new Thread(c).start();
    }
}
//卖家
class Owner implements Runnable{
    private Object goods;//商品
    private Object money;//钱

    public Owner(Object goods, Object money) {
        super();
        this.goods = goods;
        this.money = money;
    }

    @Override
    public void run() {
        synchronized (goods) {//锁对象是goods，要进入第一层同步代码块，需要先占有goods锁
            System.out.println("先给钱");
            synchronized (money) {//锁对象是money ，要进入第二层同步代码块，需要占用money锁
                //因为第二层同步代码块是在第一层里面，所以此时在占用money锁时，并没有释放goods锁
                System.out.println("发货");
            }
        }
    }
}
class Customer implements Runnable{
    private Object goods;
    private Object money;

    public Customer(Object goods, Object money) {
        super();
        this.goods = goods;
        this.money = money;
    }

    @Override
    public void run() {
        synchronized (money) {//先要占用money锁
            System.out.println("先发货");

            synchronized (goods) {//接着占用goods锁
                System.out.println("再给钱");
            }
        }
    }
}