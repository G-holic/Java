package cn.itcast.view;

import cn.itcast.bean.Employee;
import cn.itcast.service.EmployeeService;
import cn.itcast.util.EMSUtility;

/*
EmployeeView复制界面的展示和调度
 */
public class EmployeeView {
    EMSUtility ems = new EMSUtility();
    EmployeeService es = new EmployeeService();

    public void enterMainMenu() {
        while (true) {
            System.out.println("-----------------员工信息管理-----------------");
            System.out.println("\t\t1 添加员工");
            System.out.println("\t\t2 修改员工");
            System.out.println("\t\t3 删除员工");
            System.out.println("\t\t4 员工列表");
            System.out.println("\t\t5 退  出");
            System.out.print("请选择(1-5)：");

            // 读菜单选择
            char select = ems.readMenuSelection();
            switch (select) {
                case '1':
                    addNewEmployee();
                    listAllEmployees();
                    break;
                case '2':
                    modifyEmployee();
                    listAllEmployees();
                    break;
                case '3':
                    deleteEmployee();
                    listAllEmployees();
                    break;
                case '4':
                    listAllEmployees();
                    break;
                case '5':
                    System.out.print("是否真的退出（Y/N）");
                    char confirm = ems.readConfirmSelection();
                    if (confirm == 'Y') {
                        return; // 退出
                    }
            }
            ems.readContinue();
        }
    }

    private void addNewEmployee() {
        System.out.println("-----------------添加员工-----------------");
        System.out.print("姓名： ");
        String name = ems.readString(20);//20这里表示名字不超过20个字符
        System.out.print("性别： ");
        char gender = ems.readChar();
        System.out.print("年龄： ");
        int age = ems.readInt();
        System.out.print("工资： ");
        double salary = ems.readDouble();
        System.out.print("电话： ");
        String tel = ems.readString(13);//13表示电话或手机号码不超过13个字符
        System.out.print("邮箱： ");
        String email = ems.readString(32);


        //把键盘输入的每一项信息，赋值给员工对象的属性
        Employee emp = new Employee();
        emp.setName(name);
        emp.setGender(gender);
        emp.setAge(age);
        emp.setSalary(salary);
        emp.setTel(tel);
        emp.setEmail(email);

        // 把员工对象添加到EmployeeService类的数组中
//        EmployeeService es = new EmployeeService(); // new一个对象，里面是null
        es.addEmployee(emp);

        System.out.println("-----------------添加完成-----------------");


    }

    // 负责修改某个员工的信息
    /*
    （1）先输入要修改的员工的编号
    （2）根据这个编号，找到员工对象调用EmployeeService类的
        getEmployee(编号-1)方法得到员工对象
    （3）一边展示员工对象原来的信息，一边接受新输入的信息，
        用新的信息set到员工对象中
    * */
    private void modifyEmployee() {
        System.out.println("---------------------修改员工---------------------");
        System.out.print("请选择待修改员工编号(-1退出)：");
        //(1)
        int id = ems.readInt();
        if (id == -1) {
            return;// 只会推出修改功能
        }
        //(2)
        Employee employee = es.getEmployee(id - 1);// 编号 = 下标+1.下标 = 编号-1
        if (employee == null) {
            System.out.println(id + "编号的员工对象不存在");
            return;
        }
        //(3)
        System.out.print("姓名(" + employee.getName() + ")： ");
        // 快捷键： 查看调用方法的形参列表 Ctrl+P， 光标定位在所调用方法的（）中按快捷键
        String name = ems.readString(20, employee.getName());// employee.getName()表示如果没有输入新得姓名，就用原来的姓名返回
        employee.setName(name);

        System.out.print("性别(" + employee.getGender() + ")： ");
        char gender = ems.readChar(employee.getGender());
        employee.setGender(gender);

        System.out.print("年龄(" + employee.getAge() + ")： ");
        int age = ems.readInt(employee.getAge());
        employee.setAge(age);

        System.out.print("工资(" + employee.getSalary() + ")： ");
        double salary = ems.readDouble(employee.getSalary());
        employee.setSalary(salary);

        System.out.print("电话(" + employee.getTel() + ")： ");
        String tel = ems.readString(13, employee.getTel());//13表示电话或手机号码不超过13个字符
        employee.setTel(tel);

        System.out.print("邮箱(" + employee.getEmail() + ")： ");
        String email = ems.readString(32, employee.getEmail());
        employee.setEmail(email);

        System.out.println("---------------------修改完成---------------------");

    }

    // 负责删除某个员工对象
    /*
    （1）先输入要删除的员工的编号
    （2）调用EmployeeService类的removeEmployee（编号-1）方法
    * */
    private void deleteEmployee() {
        System.out.println("---------------------删除员工---------------------");
        System.out.print("请选择待删除员工编号(-1退出)：");
        //(1)
        int id = ems.readInt();
        if (id == -1) {
            return;// 只会退出删除功能
        }
        // 确认是否删除（Y/N）:y
        System.out.print("确认是否删除（Y/N）： ");
        char confirm = ems.readConfirmSelection();
        if (confirm == 'N') {
            return; // 如果输入N表示不删除，退出删除功能，回到主菜单
        }
        // （2）
        boolean result = es.removeEmployee(id - 1);
        System.out.println(result ? "删除成功" : "删除失败");
        System.out.println("---------------------删除完成---------------------");

    }

    private void listAllEmployees() {
        //从EmployeeService类中获取到所有已添加的员工对象，然后遍历
//        EmployeeService es = new EmployeeService();

        Employee[] allEmployees = es.getAllEmployees();
        System.out.println("----------------------------员工列表------------------------------\n");
        System.out.println("编号\t姓名\t性别\t年龄\t工资\t电话\t\t邮箱\n");
        for (int i = 0; i < allEmployees.length; i++) {
            System.out.println((i + 1) + "\t" + allEmployees[i].getInfo());
        }
        System.out.println("--------------------------员工列表完成----------------------------\n");
    }
}
