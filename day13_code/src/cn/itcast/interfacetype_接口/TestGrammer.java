package cn.itcast.interfacetype_接口;
/*
7.5.2 接口的声明格式
1、格式
[修饰符] interface 接口名{
}

表示类型的关键字：class,enum,interface, byte,short,int,long,float,double,char,boolean,void

2、接口的成员
（1）接口中不允许声明非公共的静态常量之外的成员变量，换句话说，如果要声明成员变量，只能声明公共的静态常量
public static final，这三个单词可以省略

（2）JDK1.8之前，接口中只允许有公共的抽象方法，不允许有其他方法。
public abstract：这两个单词可以省略

（3）JDK1.8之后，接口允许声明公共的静态方法
public static：其中public允许省略，static不允许省略

（4）JDK1.8之后，接口允许声明公共的默认方法
public default：其中public允许省略，default不允许省略

为什么JDK1.8之前，只允许有公共的抽象方法？
因为接口是代表行为标准，它只规定方法的“签名”。
    方法 = 方法头 + 方法体
    方法头又称为方法签名，【修饰符】 返回值类型  方法名(【形参列表】）;
    方法体 ：{语句}

    方法签名中已经能看出，如何使用这个方法，以及这个方法的功能（因为方法名是见名知意的一个标识符，代表方法功能）。
    至于方法体，不同的实现类（如果拿USB做比喻的话，不同的具体设备的实现标准是不同）

为什么JDK1.8之后，又引入了默认方法呢？
因为随着JDK的版本越来越多，里面的API难免需要升级。
早期如果定义了一个接口，它包含 1个抽象方法。
现在JDK版本升级了，想要给这个接口增加一个方法，如果按照JDK1.8之前原则，只能增加抽象方法。
如果给这个接口增加抽象方法，就会导致它的所有实现类，全部要跟着升级，重写这个新的抽象方法，这个影响就太大了。

为了避免这种情况，允许接口中出现默认方法。默认方法是有方法体，你可以写具体的实现，也可以是一个空{}。
实现类如果想要实现这个新的默认方法，可以选择重写，不想支持，就不重写。

为什么JDK1.8之后，又引入了静态方法呢？
原来很多接口，针对它的工具类性质的方法，都是单独用另一个类实现的。
例如：Collection接口  和Collections工具类
     Path接口 和Paths工具类
     .....
     这种一组一组的API越来越多，导致维护的难度越来越大。

     JDK1.8就觉得，可以被针对这个接口的工具类性质的静态方法，干脆放到接口中就好，少一个.java文件。


（5）JDK1.9之后，接口中允许出现私有方法。

为什么JDK1.9之前，接口中的成员全部都是公共的？
因为接口是代表标准，标准是给大家看到，给大家遵守的， 所以需要公开。

为什么JDK1.9之后，要增加私有方法呢？
因为自从JDK1.8运行在接口中出现默认方法和静态方法这种有方法体的形式之后，接口中出现了很多冗余代码。
很多方法实现有公共部分。
 */
public class TestGrammer {
}
