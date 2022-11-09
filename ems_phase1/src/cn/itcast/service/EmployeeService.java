package cn.itcast.service;

import cn.itcast.bean.Employee;

public class EmployeeService {
    // 声明一个数组，用来存储添加的“员工”对象
    private Employee[] employees = new Employee[5];// 可以存5个员工对象
    // 声明一个int类型变量，记录当前员工对象的“个数”
    private int total; // 默认值是0


     /*
    public boolean addEmployee(Employee emp)
    public boolean removeEmployee(int index)
    public Employee[] getAllEmployees()
    public Employee getEmployee(int index)
     */

    public boolean addEmployee(Employee emp) {
        if (total >= employees.length) { // 数组满了，就不能存了
            System.out.println("数组已满，无法添加");
            return false;
        }
//        employees[下标] = emp;
        employees[total++] = emp;
        return true;// 没问题就return true
    }

    // 返回所有已添加的员工对象
    public Employee[] getAllEmployees() {
//        return  employees;// 直接返回employees数组 有问题
        /*
        创建一个新数组，长度为total
        然后把employees数组中的total员工对象复制到新数组中
        * */
        Employee[] all = new Employee[total];
        /*
        i<total
        i<all.length
        i<employees.length（不对）
         */
        for (int i = 0; i < total; i++) {
            all[i] = employees[i];
        }
        return all;
    }

    // 负责根据[下标index]返回员工对象
    /*
    （1）先负责index是否在合理范围内，合理范围[0,total-1],
        如果index不在这个范围，返回null。
    （2）如果在合理范围内，返回员工对象
        return employees[index];
    * */
    public Employee getEmployee(int index) {
        if (index < 0 || index >= total) {
            return null;
        } else {
            return employees[index];
        }
    }

    // 负责从数组中移除[下标index]位置的员工对象
    /*
    （1）先把index后面的元素前移(即复制)
    （2）把employees[total-1]位置置为null
    （3）total减少
    注意：最好在删除之前判断一下index是否合法
    * */
    public boolean removeEmployee(int index) {
        if (total < 0 || index >= total) {
            return false;
        }
        // (1)
        for (int i = index; i < total - 1; i++) {
            employees[i] = employees[i + 1];
        }
        //（2）(3)
        employees[--total] = null;
        return true;

    }


}
