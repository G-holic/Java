package cn.itcast.exer.exer4;

public class Sportsman extends Thread {
    private long time;
    private long runtimePerMeter;// 跑一米的时间
    private long restTime;// 休息时间
    //    private boolean flag; // 非静态的变量是相对独立的(应该把它设为静态变量使得所有变量能够共享)
    private static boolean flag = true; //所有Sportsman对象共享 // 设置变量控制他们是否到达终点
    private final int MAX_DISTANCE = 30;// 最多跑30米
    private int distance; // 已经跑了机密

    public Sportsman(String name, long runtimePerMeter, long restTime) {
        super(name);
        this.runtimePerMeter = runtimePerMeter;
        this.restTime = restTime;
    }

    public void run() {
        long start = System.currentTimeMillis();
        while (distance < MAX_DISTANCE && flag) {
            try {
                Thread.sleep(runtimePerMeter);//休眠1秒，模拟每打印1个数字，代表跑了1米，花了1秒
                distance++;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(getName() + "跑了" + distance + "米");
            if (distance == 10 || distance == 20) {
                try {
                    Thread.sleep(restTime);//休息1秒
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        if (distance == MAX_DISTANCE) {
            System.out.println(getName() + "已经到达终点");
            flag = false;
        }


        long end = System.currentTimeMillis();
        time = end - start;
        System.out.println(getName() + "耗时" + time / 1000 + "秒");
    }

    public long getTime() {
        return time;
    }

    public int getDistance() {
        return distance;
    }
}
