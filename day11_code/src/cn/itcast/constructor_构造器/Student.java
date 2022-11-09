package cn.itcast.constructor_构造器;

public class Student {
    private String name;

    /*
    如果没有编写任何构造器，那么编译器将会添加一个
    public Student(){
    }*/
    public Student() {//也可以手动添加无参构造

    }

    public Student(String name) {// 有参构造
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
