package cn.itcast07.method;
/*
1、什么是方法？
方法，又称为函数。它代表一段独立的可复用的功能代码。
例如：
    Math.random()，random()它是一个方法，它代表一个产生[0,1)范围小数的功能
    System.out.println()，println()是一个方法，它代表输出xx并换行的功能。

2、方法的特点/原则
（1）必须先声明后使用
（2）必须调用才会执行，不调用不执行，调用一次执行一次

3、方法的声明
（1）位置
类中，方法外
【修饰符】 class 类{
    方法1(){
    }
    方法2(){
    }
}

【修饰符】 class 类{
    方法1(){
        方法2(){//错误，不能嵌套定义方法
        }
    }
}

（2）格式
【修饰符】 class 类{
    【修饰符】 返回值类型  方法名(【形参列表】){
        方法体语句;
    }
}


【修饰符】：可以很多，public,protected,private,static,final,native....。
         今天先用public（这样才能跨包使用），如果没有跨包使用的需求，可以不加public。
方法名：代表方法功能的名称，尽量见名知意
    println：打印并换行
    sqrt：求平方根（Square root ）
    random：求随机数
    方法名的要求，从第二个单词开始首字母大写。

返回值类型：
    这个方法完成指定功能后，需要返回的结果值的类型。
    如果没有结果值返回，那么就要用 void。
    如果有结果值返回，那么就必须用对应的数据类型表示。

    如果返回值类型不是void，那么在方法体中，必须加return语句，用于返回结果，否则编译报错。

【形参列表】：如果不需要参数，就不用写，
            如果需要参数就要写参数的类型和参数的名称。
            参数的作用是，给这个方法传数据用的。
            这个数据可以用来完成方法的功能。

            形参列表的格式：
            数据类型 参数名
            数据类型 参数名1, 数据类型 参数名2 ...
方法体：
    完成方法功能的语句


（3）演示
声明一个数学工具类，MyMathTools，它包含一个方法，可以求两个整数和

（4）方法的调用
目前咱们学的方法都是非静态。
 */
public class TestMethod {
    public static void main(String[] args) {
//        method();
        //1、先创建对象
        MyMathTools myMathTools = new MyMathTools();
        //2、通过对象调用方法
        int result = myMathTools.add(2,4);//result变量用于接收add方法的返回值，结果
        System.out.println("result = " + result);

        System.out.println("2+4=" + myMathTools.add(2,4));
    }
    public  static void method(){
        System.out.println("hello");
    }
}
