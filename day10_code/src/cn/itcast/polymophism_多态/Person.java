package cn.itcast.polymophism_多态;

public class Person {
    private String name;

    /*private Dog dog;
    private Cat cat;*/
//  问题是：无法确定这个人的宠物具体是哪种，后期也不方便扩展*/

    private Pet pet;//只是一个宠物
    private Pet[] pets = new Pet[5]; // 可以养很多宠物
    private int total;

    public void adopt(Pet pet){// 形参是Pet类型， 是Dog的父类
        this.pet = pet;
        //Pet pet = new Dog();

        pets[total++] = pet;
    }

    public void feed(){
//        pet.eat();
        for (int i = 0; i < total; i++) {
            pets[i].eat();
        }
    }
}
