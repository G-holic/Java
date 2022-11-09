package cn.itcast.cast_类型转换;

public class Man extends Person{
    @Override
    public void eat() {
        System.out.println("狼吞虎咽吃饭");
    }

    @Override
    public void walk() {
        System.out.println("大步流星走路");
    }

    public void smoke(){
        System.out.println("吞云吐雾");
    }
}
