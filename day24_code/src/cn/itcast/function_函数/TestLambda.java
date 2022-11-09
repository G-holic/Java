package cn.itcast.function_函数;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Predicate;

/*
Java8最重要的几个特性：
1、Lambda表达式
2、StreamAPI
3、接口的变化：静态方法和默认方法
4、新版（第三代）日期时间API
5、Optional类
6、...


1、Lambda表达式的作用是 给函数式接口的变量或形参赋值用的。传递一段代码，
    这段代码本质上就是函数式接口的抽象方法的方法体。
2、语法格式
(形参列表) -> {Lambda体}

(形参列表) ：是函数式接口的抽象方法的形参列表
->：称为Lambda操作符，中间不能有空格
{Lambda体}：就是函数式接口的抽象方法的方法体。

3、Lambda表达式在某些情况下，可以简化
(1)当{Lambda体}里面只有一个语句时，那么可以省略{}，同时省略{}里面的;
(2)当{Lambda体}里面只有一个语句时，那么可以省略{}，同时省略{}里面的; 如果此时这个语句是一个return语句，那么要连同return一起省略。
(3)当(形参列表)的形参类型是已知的，或者可以自动推断的，那么形参列表的类型可以省略
(4)当(形参列表)的形参类型是已知的，或者可以自动推断的，那么形参列表的类型可以省略；
如果此时省略了形参的数据类型之后，只剩下一个形参，它是这样的(形参名)，那么此时()也可以省略。
说明：如果形参列表是()，()不能省略
     如果形参不止一个，()也不能省略
     如果Lambda体中不止一个语句{}等也不能省略。
 */
public class TestLambda {
    @Test
    public void test01() {
        /*
        使用Lambda表达式给Runnable接口的变量赋值。要实现打印一句话“hello lambda”
        Runnable接口的抽象方法：void run()
        * */
        Runnable r = () -> {
            System.out.println("hello lambda"); // 这个; 是输出语句的;
        };//这个分号时  赋值语法 数据类型 变量名 = 变量值;

        new Thread(r).start();// hello lambda
    }

    @Test
    public void test02() {
        // test01等价于原来这种匿名写法
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("hello lambda");
            }
        };

        new Thread(r).start();// hello lambda
    }

    @Test
    public void test03() {
        // 只有一个语句时，可以简化
        /*Runnable r = () ->
            System.out.println("hello lambda");
        new Thread(r).start();// hello lambda*/
        new Thread(() -> System.out.println("hello lambda")).start(); // hello lambda
    }

    @Test
    public void test04() {
        /*
        案例2：
            在一个元素都是字符串的集合中，删除 包含“o”字母的单词
         */
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("lisi");
        list.add("java");
        list.add("bigdata");

        // 删除  包含“o”字母的单词
        list.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.contains("o");
            }
        });
        // 从匿名内部类修改为Lambda表达式
        list.removeIf((String s) -> {
            return s.contains("o");
        });
        // 简化
        list.removeIf((String s) -> s.contains("o"));

        // 再简化Lambda表达式
        list.removeIf((s) -> s.contains("o"));

        // 最终
        list.removeIf(s -> s.contains("o"));


        System.out.println(list);// [lisi, java, bigdata]
    }

    @Test
    public void test05() {
        String[] arr = {"hello", "Bob", "Rose", "java", "cha"};
        // 匿名内部类写法
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });
        //Lambda表达式
        Arrays.sort(arr, (String o1, String o2) -> {
                    return o1.compareToIgnoreCase(o2);
                }
        );

        // 再简化
        Arrays.sort(arr, (o1, o2) -> o1.compareToIgnoreCase(o2));
        System.out.println(Arrays.toString(arr));// [Bob, cha, hello, java, Rose]
    }
}
