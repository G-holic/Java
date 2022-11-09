package cn.itcast.interfacetype_接口;
/*
implements：实现接口。等价于（可以看成）继承
 */
public class Bird extends Animal implements Flyable, Jumping{

    @Override
    public void fly() {
        System.out.println("我要飞回家");
    }

    @Override
    public void test() {// 不能加default
        System.out.println("小鸟默认用翅膀飞，重写了父接口的默认方法");
    }

    @Override
    public void Jumping() {
        System.out.println("我要跳回家");
    }
}
