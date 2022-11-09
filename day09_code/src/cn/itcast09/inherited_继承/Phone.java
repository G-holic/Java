package cn.itcast09.inherited_继承;

public class Phone {
    private String name;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void senMessage(){
        System.out.println("发短信");
    }
    public void call(){
        System.out.println("打电话");
    }
    public void showNumber(){
        System.out.println("显示来电号码");
    }

    public Person getOwner(){
        return new Person();// 功能省略了
    }
}
