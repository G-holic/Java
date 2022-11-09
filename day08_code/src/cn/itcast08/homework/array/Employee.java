package cn.itcast08.homework.array;
/*
* 声明一个Employee员工类，包含属性：编号(id)、姓名(name)、薪资(salary)、年龄(age)，包含如下方法：

- String getInfo()：返回员工的详细信息，每一个

- void setInfo(int  i, String n, double s, int a)：可以同时给id,name,salary,age赋值

声明一个EmployeeManager员工管理类，包含：

- Employee[]类型的allEmployees，长度指定为5
- int类型的实例变量total，记录allEmployees数组实际存储的员工数量
- boolean addEmployee(Employee emp)：添加一个员工对象到allEmployees数组中，如果数组已满，则不添加并提示数组已满

- Employee[] getEmployees()：返回total个员工对象


在测试类的main中添加6个员工对象，并且遍历输出。
*
* */
public class Employee {
    int id;
    String name;
    double salary;
    int age;

    String getInfo() {
        return "编号：" + id + ",姓名：" + name + ",薪资：" + salary + ",年龄" + age;
    }

     void setInfo(int i, String n, double s, int a){
        id = i;
        name = n;
        salary = s;
        age = a;
    }


}
