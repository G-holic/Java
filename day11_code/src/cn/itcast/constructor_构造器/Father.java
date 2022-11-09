package cn.itcast.constructor_构造器;

public class Father {
    private String info;

    // 写了一个无参构造
    public Father(){
        System.out.println("Father.无参构造");
    }

    public Father(String info){
        this.info = info;
        System.out.println("Father.有参构造");
    }
}
