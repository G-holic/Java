package cn.itcast.exer;
/*（1）声明一个Person<T>类，包含姓名和伴侣属性，其中姓名是String类型，而伴侣的类型不确定，用T表示，
        因为伴侣可以是Person，可以是Animal（例如：金刚），可以是Ghost鬼（例如：倩女幽魂），
        可以是Demon妖（例如：白娘子），可以是Robot机器人（例如：剪刀手爱德华）。。。。

        Person<T>类属性私有化，提供有参构造、get/set方法、重写toString方法。*/
public class Person<T> {
    private String name;
    private T lover;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, T lover) {
        this.name = name;
        this.lover = lover;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getLover() {
        return lover;
    }

    public void setLover(T lover) {
        this.lover = lover;
    }

    @Override
    public String toString() {
        if (lover instanceof Person){//如果伴侣是Person类型的话。就返回她的名字
            return "Person{" +
                    "name='" + name + '\'' +
                    ", lover=" + ((Person) lover).getName() +
                    '}';
        }
        return "Person{" +
                "name='" + name + '\'' +
                ", lover=" + lover +
                '}';
    }
}
