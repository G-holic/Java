package cn.itcast.test;

import cn.itcast.bean.Employee;
import cn.itcast.service.EmployeeService;

public class TestEmployeeService {
    public static void main(String[] args) {
        // 要调用EmployeeService类的addEmployee方法
        // 需要先创建EmployeeService类的对象
        EmployeeService es = new EmployeeService();

        Employee e1 = new Employee();
        e1.setName("张三");
        e1.setAge(22);
        e1.setGender('男');
        e1.setSalary(8000);
        e1.setTel("18291008611");
        e1.setEmail("@g_holic");

        es.addEmployee(e1);

        // 查看一下
        // 调用EmployeeService类的getAllEmployees()方法
        // 先获取到所有已经添加的员工
        Employee[] allEmployees = es.getAllEmployees();
        System.out.println("编号\t姓名\t性别\t年龄\t工资\t电话\t\t邮箱\n");
        for (int i = 0; i < allEmployees.length; i++) {
            System.out.println((i+1)+"\t\t"+allEmployees[i].getInfo());
        }
        /*
        上面的代码出现Exception in thread "main" java.lang.NullPointerException
	at cn.itcast.test.TestEmployeeService.main(TestEmployeeService.java:28)
	因为数组中有null元素。
	因为目前的getAllEmployees()实现的是直接返回 employees数组的。
	如何解决？
	重新实现EmployeeService类的getAllEmployees()方法
         */
        Employee employee = es.getEmployee(1);
        System.out.println("下标为1的： "+employee);
        employee = es.getEmployee(0);
        System.out.println("下标为0的： "+employee.getInfo());

        boolean b = es.removeEmployee(1);
        System.out.println("删除下标为1的："+b);
        b = es.removeEmployee(0);
        System.out.println("删除下标为0的："+b);
    }
}
