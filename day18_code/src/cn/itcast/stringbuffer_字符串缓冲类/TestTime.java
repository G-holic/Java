package cn.itcast.stringbuffer_字符串缓冲类;

import org.junit.Test;

public class TestTime {
    @Test
    public void testString() {
        long start = System.currentTimeMillis();//获取开始时间
        String s = new String("0");
        for (int i = 1; i <= 10000; i++) {//拼接了10000个值
            s += i;
        }
        long end = System.currentTimeMillis();//获取结束时间
        System.out.println("String拼接+用时：" + (end - start));//346

        /*
        Runtime.getRuntime()：获取当前JVM的运行环境
        totalMemory()：总内存
        freeMemory()：空闲内存
        差值：已使用内存
         */
        long memory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println("String拼接+memory占用内存: " + memory);//474536816字节
    }
    @Test
    public void testStringBuilder(){// 理论上这个更快（可以把循环增大测试）
        long start = System.currentTimeMillis();//获取开始时间
        StringBuilder s = new StringBuilder("0");
        for (int i=1;i<=10000;i++){
            s.append(i);//也是拼接和追加
        }
        long end = System.currentTimeMillis();
        System.out.println("StringBuilder拼接+用时："+(end-start));//6毫秒
        long memory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println("StringBuilder拼接+memory占用内存: " + memory);//9403632字节
    }

    @Test
    public void testStringBuffer(){
        long start = System.currentTimeMillis();
        StringBuffer s = new StringBuffer("0");
        for(int i=1;i<=10000;i++){
            s.append(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("StringBuffer拼接+用时："+(end-start));//2毫秒
        long memory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println("StringBuffer拼接+memory占用内存: " + memory);//9395376字节
    }

}
