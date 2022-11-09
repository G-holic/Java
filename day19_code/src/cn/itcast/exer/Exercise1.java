package cn.itcast.exer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;

public class Exercise1 {
    public static void main(String[] args) {
//        （1）创建一个Collection集合（暂时创建ArrayList集合对象），并指定泛型为<String>
        Collection<String> coll = new ArrayList<String>();
//        （2）添加如下单词到集合中，
//        hello,java,world,atguigu,love,you,mom,dad,noon
        coll.add("hello");
        coll.add("java");
        coll.add("world");
        coll.add("atguigu");
        coll.add("love");
        coll.add("you");
        coll.add("mom");
        coll.add("dad");
        coll.add("noon");
//        （3）使用foreach遍历输出，
        for (String s : coll) {
            System.out.print(s+" ,");
        }
        System.out.println();
//        （4）使用集合的removeIf方法删除回文单词，为Predicate接口指定泛型<String>
        // 回文单词是指正着读和反着读，拼写都是一样，例如mom
        System.out.println("删除回文单词");
        coll.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String s) {// 这里的s就是代表coll中的元素
                // 把s反转后和原来一样的字符串就是回文单词
                StringBuilder builder = new StringBuilder(s);
                builder.reverse();
//                return s.equals(builder);//错误，语法不会报错，运行结果不对。  这么写表示一个String对象，一个StringBuilder对象，在equals比较，它俩类型不同，一定不等。
                return s.equals(builder.toString());// 把builder转为String
            }
        });
//        （5）再使用Iterator迭代器输出剩下的单词以及单词的长度，为Iterator接口指定泛型<String>。
        Iterator<String> iterator = coll.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.print(next+" ,");
        }
    }
}
