package cn.itcast.cast_类型转换;

public class Woman extends Person {
    @Override
    public void eat() {
        System.out.println("细嚼慢咽吃饭");
    }

    @Override
    public void walk() {
        System.out.println("小心翼翼走路");
    }

    public void makeUp() {
        System.out.println("画的美美的");
    }
}
