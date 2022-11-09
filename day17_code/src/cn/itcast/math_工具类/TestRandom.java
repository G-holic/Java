package cn.itcast.math_工具类;

import org.junit.Test;

import java.util.Random;

/*
3、java.util.Random类

 */
public class TestRandom {
    @Test
    public void test(){
        Random rand = new Random();
        System.out.println(rand.nextInt());
        System.out.println(rand.nextDouble());
        System.out.println(rand.nextBoolean());
    }
    @Test
    public void test2(){
        Random rand = new Random();
        System.out.println(rand.nextInt(10));//[0,10)范围的整数
    }
}
