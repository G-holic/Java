package cn.itcast.exer;

import java.util.HashMap;

/*
（2）案例需求
- 声明一个Employee员工类型，包含属性编号、姓名、薪资，属性私有化，提供有参构造，get/set，重写toString。
- 添加n个员工对象到一个HashMap<Integer,Employee>集合中，其中员工编号为key，员工对象为value。
- 调用Map的forEach遍历集合
- 调用Map的replaceAll方法，将其中薪资低于10000元的，薪资设置为10000。
- 再次调用Map的forEach遍历集合查看结果
 */
public class Exercise4 {
    public static void main(String[] args) {
        HashMap<Integer, Employee> map = new HashMap<>();
//        其中员工编号为key，员工对象为value
        map.put(1, new Employee(1, "张三", 12000));
        map.put(2, new Employee(2, "李四", 14000));
        map.put(3, new Employee(3, "王五", 7000));

//        调用Map的forEach遍历集合
        map.forEach((key, value) -> System.out.print(key + ":" + value + " "));
//        1:Employee{id=1, name='张三', salary=12000.0} 2:Employee{id=2, name='李四', salary=14000.0} 3:Employee{id=3, name='王五', salary=7000.0}
//        调用Map的replaceAll方法，将其中薪资低于10000元的，薪资设置为10000。
        /*
        第一步：搞清楚replaceAll方法的签名
        public void replaceAll(BiFunction<? super K, ? super V, ? extends V> function)
        第二步：搞清楚BiFunction<T, U, R> 接口的抽象方法
        R apply(T t, U u);
        第三步：搞清楚，T,U,R分别是什么
        从replaceAll方法的签名中可以看出：
            T ->? super K       ==> key
            U ->? super V       ==> value
            R ->? extends V     ==> value  返回的是value对象，经过处理的value对象
         */
        map.replaceAll((key, value) -> {
            if (value.getSalary() < 10000) {
                value.setSalary(10000);
            }
            return value;
        });
//        map.replaceAll((key, value) ->value.getSalary() < 10000 ? value.setSalary(10000) : value);
        System.out.println();
//        再次调用Map的forEach遍历集合查看结果
        map.forEach((key, value) -> System.out.print(key + ":" + value + " "));
//        1:Employee{id=1, name='张三', salary=12000.0} 2:Employee{id=2, name='李四', salary=14000.0} 3:Employee{id=3, name='王五', salary=10000.0}
    }
}
