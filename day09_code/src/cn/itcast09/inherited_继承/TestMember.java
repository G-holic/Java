package cn.itcast09.inherited_继承;

/*
在继承的时候，子类会继承父类所有的成员变量（实例变量）和成员方法（实例方法）。
既然可以继承，
(1)在子类外面，子类的对象是否可以使用父类中声明的成员变量（实例变量）和成员方法（实例方法）
只要权限修饰符允许，通过子类对象可以直接使用父类中声明的成员变量（实例变量）和成员方法（实例方法）
(2)在子类中，如果要用到父类声明成员变量（实例变量）和成员方法（实例方法）
只要权限修饰符允许，可以直接使用，不需要通过“对象.”的方式来引用父类中声明的成员变量（实例变量）和成员方法（实例方法）
 */
public class TestMember {
    public static void main(String[] args) {
        // 创建子类对象
        Smartphone sp = new Smartphone();

        // 通过子类对象，调用父类中声明的方法
        sp.senMessage();
        sp.call();
        sp.showNumber();

        // 给sp对象的name属性赋值
        //        sp.name = "华为手机";
        sp.setName("华为手机");
        System.out.println("手机的名称： " + sp.getName());
        sp.setPrice(7800);
        System.out.println("手机的价格： " + sp.getPrice());

        // 调用子类自己生成的方法
        System.out.println(sp.getInfo());
    }
}
