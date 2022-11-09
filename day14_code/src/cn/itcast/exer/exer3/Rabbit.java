package cn.itcast.exer.exer3;

/*
（3）声明兔子类，实现Runner接口，
- 重写run()，实现为“兔子跑的快”
 */
public class Rabbit implements Runner {
    @Override
    public void run() {
        System.out.println("兔子跑的快");
    }
}
