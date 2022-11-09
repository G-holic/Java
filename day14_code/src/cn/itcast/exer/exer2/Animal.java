package cn.itcast.exer.exer2;
/*
2、声明动物Animal类，实现LiveAble接口。
* void eat();实现为“吃东西”，
* void breathe();实现为"吸入氧气呼出二氧化碳"
* void sleep()重写为”躺下闭上眼睛睡觉"
 */
public class Animal implements LiveAble{

    @Override
    public void eat() {
        System.out.println("吃东西");
    }

    @Override
    public void breathe() {
        System.out.println("吸入氧气呼出二氧化碳");
    }

    @Override
    public void sleep() {
        System.out.println("躺下闭上眼睛睡觉");
    }
}
