package cn.itcast.exer.exer3;
//（5）测试类中创建兔子和乌龟类的对象，并调用相应方法

public class Exer3 {

    public static void main(String[] args) {
       /* Rabbit r = new Rabbit();
        r.run();
        Tortoise t = new Tortoise();
        t.swim();
        t.run();*/

        Rabbit r = new Rabbit();
        Tortoise t = new Tortoise();

        Runner[] arr = new Runner[2];
        arr[0] = r;
        arr[1] = t;
        for (Runner runner : arr) {
            runner.run();
        }

        /*  Swimming[] swimmings = new Swimming[2];
        swimmings[0] = r;//报错，因为r是Rabbit类型的，它没有实现Swimming接口
        swimmings[1] = t;*/

        Swimming s = t;
        s.swim();

    }

}
