package cn.itcast.communicate2;

/*
问题升级：饭店招人了。招了一个厨师，沈彦和他的女朋友。
 */
public class TestCommunicate2 {
    public static void main(String[] args) {
        Workbench w = new Workbench();

        new Thread("小肖") {
            public void run() {

                while (true) {
                    w.put();
                }

            }
        }.start();

        new Thread("小沈") {
            public void run() {

                while (true) {
                    w.put();
                }

            }
        }.start();

        new Thread("小肖女朋友（花花）") {
            public void run() {
                while (true) {
                    w.take();
                }
            }
        }.start();
        new Thread("小沈女朋友（菲菲）") {
            public void run() {
                while (true) {
                    w.take();
                }
            }
        }.start();

    }
}
//Workbench工作台
class Workbench{
    private final int MAX_TOTAL = 1;
    private int total;//菜的数量

    //同步方法的锁对象，非静态方法的锁对象是this
    public synchronized void put(){
        while(total >= MAX_TOTAL){
//            做菜的线程停下来等待
            try {
                this.wait();//this.可以省略
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        total++;
        System.out.println(Thread.currentThread().getName()+"做了一份菜，数量：" + total);
        this.notifyAll();// 全部唤醒
    }

    public synchronized void take(){
        while(total<=0){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        total--;
        System.out.println(Thread.currentThread().getName()+"取走了一份菜，数量：" + total);
        this.notifyAll();// 全部唤醒
    }
}
