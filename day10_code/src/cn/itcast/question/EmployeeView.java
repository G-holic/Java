package cn.itcast.question;

public class EmployeeView {
    EmployeeService es = new EmployeeService();

    public void add() {
        Employee emp = new Employee();// 对象有内存地址 0x1111
                // emp中存储的是0x1111
        emp.setName("张三");
        es.add(emp);// 把0x1111传给了EmployeeService类的add方法的形参
    }

    public Employee get() {
        return es.get(0);//实参0传给了EmployeeService类的get(index)的形参index
    }
}
