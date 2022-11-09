package cn.itcast.cast_类型转换;

import cn.itcast.polymophism_多态.Pet;

/*
向上转型：
    自动类型转换。
    当把子类对象赋值给父类的变量时，在“编译时”会自动类型提升为父类的类型。
向下转型：
    如果需要调用子类“扩展”的方法时，必须进行向下转型，通过强制类型转换完成。这样才能通过编译。

对象的本质类型从头到尾都没有变，只是骗编译器的。

什么情况下，向上转型和向下转型才能成功，编译也通过，运行也通过
向上转型：只要满足  对象是这个变量的子类类型就可以。
    Person p1 = new Man();
    Person p2 = new Woman();
向下转型：必须满足，对象的运行时类型 <= ()中向下转的类型
    Person p1 = new Man();
    Man m = (Man)p1;
    p1的运行时类型是Man（怎么看运行时类型，就是new单词后面的类型），()是中Man ，相等是可以

    Person p3 = new ChineseMan();
    Man m2 = (Man)p3;
    p3的运行时类型是ChineseMan，()中是Man，ChineseMan<Man可以

    如果没有满足<=的关系，运行时会发生ClassCastException
    Person p1 = new Man();
    Woman w = (Woman)p1;
     p1的运行时类型是Man，()中Woman，  Man和Woman没有关系，不能转

     Person p4 = new Person();
     Man m3 = (Man)p4;
     p4的运行时类型是Person，()中Man类型， Person < Man满足吗，不满足，就不能转


如何避免向下转型编译通过，运行发生ClassCastException？
加instanceof判断
语法格式：
    变量/对象 instanceof 类型
instanceof的作用是判断某个变量/对象的运行时类型是否<=instanceof后面写的类型。


强调：
    无论是向上转型还是向下转型，都是针对编译时类型，骗编译器。
    运行时类型从头到尾都不会改变，new后面是什么类型，就是什么类型。
    向上转型与向下转型是针对父子类的关系进行。对象的个数没有变。
 */
public class TestClassCast {
    public static void main(String[] args) {
        Person p1 = new Man();
        p1.eat();
        p1.walk();

//        p1.smoke();//编译时看父类Person，Person类中没有这个方法，编译不通过
        Man m = (Man) p1;// 强制类型转换
        m.smoke();

//        Woman w = (Woman) p1;//编译通过，因为p1是Person类型，按照语法，可以向下转为它的子类类型Woman
//        w.makeUp();  // 运行不通过 Exception in thread "main" java.lang.ClassCastException:

        Person p3 = new ChineseMan();
        Man m2 = (Man) p3;

//        Person p4 = new Person();
//        Man m3 = (Man)p4; // 运行时不通过

        System.out.println("--------------");
        Person[] arr = new Person[4];
        arr[0] = new Man();
        arr[1] = new ChineseMan();
        arr[2] = new Woman();
        arr[3] = new Person();

        for (int i = 0; i < arr.length; i++) {
            arr[i].eat();
            arr[i].walk();

            /*
            arr【0】中的对象的运行时类型是Man
            arr【1】中的对象的运行时类型是ChineseMan
            它们if条件是满足的
             */
            if (arr[i] instanceof Man) {// 避免运行报错 instanceof
                Man man = (Man) arr[i];
                man.smoke();// 不加任何东西，运行报错java.lang.ClassCastException:
            }
            System.out.println();
        }
        System.out.println("---------------------------------");
//        Person person = "张三"; //左边是Person类型，右边是String，它们之间没有“父子类”关系。
//        String str = (String)p1;//编译都不通过，因为p1是Person类型，()中是String类型，它们之间没有父子类关系，编译不同。
    }

}
