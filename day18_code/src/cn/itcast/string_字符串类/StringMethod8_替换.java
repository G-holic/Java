package cn.itcast.string_字符串类;
/*
8、字符串替换
（29）String replace(xx,xx)：不支持正则
（30）String replaceFirst(正则，value)：替换第一个匹配部分
（31）String repalceAll(正则， value)：替换所有匹配部分
 */
import org.junit.Test;

public class StringMethod8_替换 {
    @Test
    public void test01(){
        String str = "李四是一个好男人";
        // 希望把李四替换成"**"
        str = str.replace("李四", "**");
        System.out.println("str = " + str);//str = **是一个好男人
    }

    @Test
    public void test02(){
        String str = "hello244world.java;887";
        // 里面的非字母的字符去掉
//        str = str.replaceFirst("[^a-zA-Z]+","");
//        System.out.println("str = " + str);//str = helloworld.java;887
        str = str.replaceAll("[^a-zA-Z]+","");
        System.out.println("str = " + str);//str = helloworldjava
    }

}
