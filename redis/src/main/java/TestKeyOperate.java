

import org.junit.Test;
import redis.clients.jedis.Jedis;

import java.security.Key;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

public class TestKeyOperate {
    private static Jedis jedis = new Jedis("10.107.24.12", 6379);

    public static void main(String[] args) {
        System.out.println("启动中.........."+jedis.ping());
        jedis.flushDB();
    }

    @Test
    public void getTest(){
        String res1 = jedis.set("username","12345");
        String res2 = jedis.set("book","1234567");
        String res3 = jedis.set("app","123456");
        System.out.println("res1 = " + res1);
        System.out.println("res2 = " + res2);
        System.out.println("res3 = " + res3);
    }



    @Test
    public void KeySet(){
        Set<String> keys = jedis.keys("*");
        System.out.println(jedis.get("app"));
//        Map<String,String> values =  jedis.hgetAll("username");
        for (String key : keys) {
            System.out.println(key);
            System.out.println(jedis.get(key) + " ");
        }

    }
    @Test
    public void test(){
        int[] arr = {1,4,2,5};
        for (int i : arr) {
            System.out.println("i = " + i);
        }
    }
}
