package cn.itcast08.exer.param;
/*
创建对象：
    new 类名()
    new 类名(实参列表)
    如果没有把new表达式赋值给一个变量，那么这样的对象称为匿名对象。
    只要是对象，就可以调用这个类的方法等
 */
public class Tools {
    public static void main(String[] args) {
        int i = 0;
        new Tools().change(i); // 因为Tools对象只在这里用了一次，所以匿名对象直接调用change方法了
        i = i++;// （1）先取i的值，放到操作栈中，（2）i自增为1（3）把操作栈中的0赋值给i
        System.out.println("i = " + i);
    }

    void change(int i) { // //形参i是基本数据类型，所以change方法中修改i的值，和实参无关
        i++;
        System.out.println("change方法中i = " + i);
    }
}
