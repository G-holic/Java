package cn.itcast.map_集合;

import org.junit.Test;

import java.util.*;

/*
1、Collection和Map的区别？
Collection：是表示一组对象
Map：是表示一组键值对(key,value)

Map特点：
    key不允许重复，value允许重复
    如果key重复了，后面的value会覆盖前面的value

2、java.util.Map<K,V>的方法
（1）添加
* V put(K key,V value)
* void putAll(Map<? extends K,? extends V> m)

（2）删除
* void clear()
* V remove(Object key)

（3）修改
没有，就是重新put，而且只能修改value，不能修改key。
如果key被修改了，会导致原来的数据找不到，也删不掉。

（4）查询
V get(Object key)
* boolean containsKey(Object key)
* boolean containsValue(Object value)
* boolean isEmpty()
int size()：获取键值对的数量

（5）遍历
* Set<K> keySet()：获取所有的key，然后遍历所有的key
* Collection<V> values()：获取所有的value，遍历所有的value
* Set<Map.Entry<K,V>> entrySet()：遍历所有的 键值对(key,value)
    Map中所有的键值对(key,value)都是Map.Entry接口的实现类
 */
public class TestMap {
    @Test
    public void test01() {
        // HashMap是Map接口的一个实现类
        // HashMap<K,V>：K代表的是key类型，V代表的是value的类型
        // 例如：存储咱们班的学员姓名和他（她）对象的姓名
        // 最终实现，可以根据咱们班学员的姓名，快速找到他（她）对象的姓名
        // 咱们班学员的姓名当key，他（她）对象的姓名当value
        HashMap map = new HashMap();
        map.put("周旭", "小花");
        map.put("杨震", null);
        map.put("沈彦", "小花");
//       map.put("沈彦","小薇");
        /*
        key不允许重复，value允许重复
        如果key重复了，后面的value会覆盖前面的value
        * */

        System.out.println(map);// {杨震=null, 沈彦=小花, 周旭=小花}
    }

    @Test
    public void test02() {

        HashMap<String, List<String>> map = new HashMap();
        map.put("周旭", Arrays.asList("小花"));
        map.put("杨震", null);
        map.put("沈彦", Arrays.asList("小花", "小薇"));

        System.out.println(map);// {杨震=null, 沈彦=[小花, 小薇], 周旭=[小花]}
    }

    @Test
    public void test03() {
        // HashMa无序（输出遍历的顺序和添加的顺序不一致）
        HashMap<String, Integer> map = new HashMap();
        // 姓名对应成绩
        map.put("张三", 89);
        map.put("李四", 96);
        map.put("王五", 89);

        HashMap<String, Integer> map2 = new HashMap();
        // 姓名对应成绩
        map.put("张三", 100);
        map.put("赵六", 96);
        map.put("钱七", 89);

        map.putAll(map2);
        System.out.println(map);// {钱七=89, 李四=96, 张三=100, 王五=89, 赵六=96}
    }

    @Test
    public void test04() {
        HashMap<String, Integer> map = new HashMap();
        // 姓名对应成绩
        map.put("张三", 89);
        map.put("李四", 96);
        map.put("王五", 89);

        map.remove("李四");// 根据key删除一对键值对
        System.out.println(map);// {张三=89, 王五=89}

        map.put("李四", null);// 删除原来的96，其实使用null覆盖96
        System.out.println(map);// {李四=null, 张三=89, 王五=89}
    }

    @Test
    public void test05() {
        // HashMap 存储跟hash值有关
        HashMap<MyKey, Integer> map = new HashMap<>();
        MyKey k1 = new MyKey(1);
        map.put(k1, 1);
        MyKey k2 = new MyKey(1);
        map.put(k2, 2);
        System.out.println(map);// {MyKey{num=1}=1, MyKey{num=1}=2}

//        k1.setNum(10); // 不要修改key的值！！！！
//        System.out.println(map.get(k1));// 1  MyKey重写了equals和hashCode方法 null
    }

    @Test
    public void test06() {
        HashMap<String, Integer> map = new HashMap<>();
        //姓名对应成绩
        map.put("张三", 89);
        map.put("李四", 96);
        map.put("王五", 89);

        System.out.println(map.containsKey("张三"));// true
        System.out.println(map.containsValue(100));// false
    }

    @Test
    public void test07() {
        HashMap<String, List<String>> map = new HashMap<>();

        map.put("周旭", Arrays.asList("小花"));
        map.put("杨震", null);
        map.put("沈彦", Arrays.asList("小花", "小薇"));// 是整体
        System.out.println(map);

        //查询有没有同学的女朋友是小薇
        System.out.println(map.containsValue("小薇"));//false
    }

    @Test
    public void test08() {
        HashMap<String, Integer> map = new HashMap<>();
        //姓名对应成绩
        map.put("张三", 89);
        map.put("李四", 96);
        map.put("王五", 89);

        //所有的key为什么用Set集合装，是因为所有的key不会重复。
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.print(key + " ");// 李四 张三 王五
        }
    }

    @Test
    public void test09() {
        HashMap<String, Integer> map = new HashMap<>();
        //姓名对应成绩
        map.put("张三", 89);
        map.put("李四", 96);
        map.put("王五", 89);

        Collection<Integer> values = map.values();
        for (Integer value : values) {
            System.out.print(value + " ");// 96 89 89
        }
    }

    @Test
    public void test10() {
        HashMap<String, Integer> map = new HashMap<>();
        //姓名对应成绩
        map.put("张三", 89);
        map.put("李四", 96);
        map.put("王五", 89);

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.print(entry.getKey() + ":" + entry.getValue());
            System.out.println();
            //李四:96
//            张三:89
//            王五:89
        }

    }

    @Test
    public void test11() {
        HashMap<String, List<String>> map = new HashMap<>();

        map.put("周旭", Arrays.asList("小花"));
        map.put("杨震", null);
        map.put("沈彦", Arrays.asList("小花", "小薇"));
        System.out.println(map);

        //查询有没有同学的女朋友是小薇
        Collection<List<String>> values = map.values();
        for (List<String> list : values) {
            if (list != null) {
                for (String name : list) {
                    if ("小薇".equals(name)) {
                        System.out.println("存在"); // 存在
                    }
                }
            }
        }
    }
}
