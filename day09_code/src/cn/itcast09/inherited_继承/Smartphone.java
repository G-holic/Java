package cn.itcast09.inherited_继承;
/*
智能手机子类，关于来电显示号码这个功能有改进，不仅仅显示号码，
可以显示头像，姓名/来电地区等
 */
//Smartphone：智能手机
public class Smartphone extends Phone{
    public void showFunction(){
        senMessage();
        call();
        showNumber();
    }

    @Override
    public void showNumber() {
        // 重写的意思，就是重新实现这个方法，就是重新编写方法体
        System.out.println("显示头像");
        System.out.println("显示名称等");

        // 想要继续保留父类被重写的功能：显示来电号码
        super.showNumber(); // 调用父类的功能
    }

    @Override
    //这个是用于注释，标记，该方式是子类重写父类的方法，不是子类自己扩展的方法
    //如果去掉@Override，对于代码执行来说，没有任何影响，但是会影响一些代码的编译
    //在重写的方法上面保留@Override，可以让编译器帮你检查是否满足重写的种种要求。
    public Father getOwner() {// Father是小于Person。可以
        return new Father();
    }

    public String getInfo(){
        // return "手机名称：" + name + "，价格：" + price;//因为父类中的name和price是private
        return "手机名称：" + getName() + "，价格：" + getPrice();
    }
}
