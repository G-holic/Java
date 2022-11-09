package cn.itcast.exer.exer5;

public interface Rollable extends Playable,Bounceable{
    public static final Ball ball = new Ball("PingPang");
    //接口中的成员变量，只能是public static final公共的静态的常量
}
