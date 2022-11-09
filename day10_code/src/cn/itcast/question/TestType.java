package cn.itcast.question;

/*
疑惑1：
    某个引用数据类型的变量，并没看到new对象，但是这个变量可以.出它的方法或其他成员？

回答：
(1)无论这个变量有没有对象，它只要是某个类型的变量，在编译时，就可以通过这个变量.出这个类中的成员（权限修饰符允许）
(2)运行时，如果这个变量并没有指向一个实际存在的对象，那么运行时一定会发生空指针异常NullPointerException

疑惑2：
    对象的创建应该在哪里？
    （1）在=后面直接new
    （2）在其他地方new，通过调用方法返回了new好的对象，其实一直传递的是对象的首地址
    只要有对象的首地址，这个对象在堆中存在，我们就可以获取到这个对象的信息。
    那么运行时就不会报空指针异常。
 */
public class TestType {
    public static void main(String[] args) {
        /*
        代码分为两个阶段；
        （1）编译时
        （2）运行时
         */
        Employee employee = null;
//        System.out.println(employee.getInfo());//这个代码编译可以通过，但是运行会报错NullPointerException

        System.out.println("-------------");
        Employee e1 = new Employee();//（1）在=后面直接new
        System.out.println(e1.getInfo());


        EmployeeView ev = new EmployeeView();
        ev.add();
        Employee e2 = ev.get();//得到对象的地址值0x1111

        System.out.println(e2.getInfo());
    }
}
