package cn.itcast.exer;
//（2）声明Demon妖类，包含姓名属性，属性私有化，提供有参构造、get/set方法、重写toString方法。
public class Demon {
    private String name;

    public Demon(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Demon{" +
                "name='" + name + '\'' +
                '}';
    }
}
