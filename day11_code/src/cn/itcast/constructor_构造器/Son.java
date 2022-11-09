package cn.itcast.constructor_构造器;

public class Son extends Father {
    public Son() {
        // 调用父类的无参构造，默认的（可以省略）
    }

    public Son(String info) {
        super(info);//调用父类的有参构造
    }
}
