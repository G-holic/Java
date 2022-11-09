package cn.itcast.exer.exer2;
/*
4、在测试类中，分别创建两个实现类的对象，调用对应的方法。通过接口名调用静态方法
 */
public class Exer2 {
    public static void main(String[] args) {
//        Animal a1 = new Animal();
//        a1.eat();
//        a1.breathe();
//        a1.sleep();
//        Plant p1 = new Plant();
//        p1.eat();
//        p1.breathe();
//        p1.sleep();

        LiveAble[] arr= new LiveAble[2];
        arr[0] = new Animal();
        arr[1] = new Plant();
        // foreach快捷键iter
        for (LiveAble liveAble : arr) {
            liveAble.eat();
            liveAble.breathe();
            liveAble.sleep();
        }
        LiveAble.drink();


    }

}
