package cn.itcast.polymophism_多态;

public class Dog extends Pet{
    @Override
    public void eat(){
        System.out.println("狗狗啃骨头");
    }

    public void watchHouse(){
        System.out.println("看家");
    }
}
