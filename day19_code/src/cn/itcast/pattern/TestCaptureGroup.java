package cn.itcast.pattern;

import org.junit.Test;

import java.util.regex.Pattern;//这个类的对象代表一个正则表达式
import java.util.regex.Matcher;//用正则表达式的对象，匹配字符串之后的结果

public class TestCaptureGroup{
    @Test
    public void test01(){
        Pattern pattern = Pattern.compile("(\\d{4})-((\\d{2})-(\\d{2}))");
        Matcher matcher = pattern.matcher("2017-04-25");
        matcher.find();//必须要有这句，正式开始计算
        System.out.printf("\nmatcher.group(0) value:%s", matcher.group(0));
        System.out.printf("\nmatcher.group(1) value:%s", matcher.group(1));
        System.out.printf("\nmatcher.group(2) value:%s", matcher.group(2));
        System.out.printf("\nmatcher.group(3) value:%s", matcher.group(3));
        System.out.printf("\nmatcher.group(4) value:%s", matcher.group(4));
    }

    @Test
    public void test02(){
        Pattern pattern = Pattern.compile("(?<year>\\d{4})-(?<md>(?<month>\\d{2})-(?<date>\\d{2}))");
        Matcher matcher = pattern.matcher("2017-04-25");
        matcher.find();//必须要有这句
        System.out.printf("\n===========使用名称获取=============");
        System.out.printf("\nmatcher.group(0) value:%s", matcher.group(0));
        System.out.printf("\n matcher.group('year') value:%s", matcher.group("year"));
        System.out.printf("\nmatcher.group('md') value:%s", matcher.group("md"));
        System.out.printf("\nmatcher.group('month') value:%s", matcher.group("month"));
        System.out.printf("\nmatcher.group('date') value:%s", matcher.group("date"));
        matcher.reset();
        System.out.printf("\n===========使用编号获取=============");
        matcher.find();
        System.out.printf("\nmatcher.group(0) value:%s", matcher.group(0));
        System.out.printf("\nmatcher.group(1) value:%s", matcher.group(1));
        System.out.printf("\nmatcher.group(2) value:%s", matcher.group(2));
        System.out.printf("\nmatcher.group(3) value:%s", matcher.group(3));
        System.out.printf("\nmatcher.group(4) value:%s", matcher.group(4));
    }
}
