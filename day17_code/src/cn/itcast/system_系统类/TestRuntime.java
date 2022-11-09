package cn.itcast.system_系统类;

import org.junit.Test;

/*
2、JVM的运行环境类java.lang.Runtime
(1)它是单例设计的，因为同一个Java程序，只能有一个JVM的运行环境。
(2)做内存的分析
long totalMemory()
long freeMemory()

（3）gc()：通知GC进行工作
 */
public class TestRuntime {
    @Test
    public void test01() {
        Runtime runtime = Runtime.getRuntime();// 获取单例对象
        long total = runtime.totalMemory();//总内存，当前OS给JVM分配的总内存
        System.out.println("total = " + total);
        long f = total / 1024 / 1024;
        System.out.println("f = " + f + "MB");
        String s = "";
        for (int i = 0; i < 1000; i++) {
            s += i;//字符串拼接
        }
        long free = runtime.freeMemory();//空闲内存
        System.out.println("free = " + free);
        long use = total - free;
        System.out.println("use = " + use);
    }
}
