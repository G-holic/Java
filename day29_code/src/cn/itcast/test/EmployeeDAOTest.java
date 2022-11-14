package cn.itcast.test;

import cn.itcast.bean.Employee;
import cn.itcast.dao.EmployeeDAOImpl;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class EmployeeDAOTest {
    @Test
    public void test01() {
        EmployeeDAOImpl dao = new EmployeeDAOImpl();
        List<Employee> all = dao.getAll();
        for (Employee employee : all) {
            System.out.println(employee);
        }
        /*
        问题1：
        java.lang.RuntimeException: java.lang.NoSuchFieldException: commission_pct
Caused by: java.lang.NoSuchFieldException: commission_pct
	at java.lang.Class.getDeclaredField(Class.java:2070)
	at com.atguigu.dao.BaseDAOImpl.getList(BaseDAOImpl.java:65)
	at com.atguigu.dao.EmployeeDAOImpl.getAll(EmployeeDAOImpl.java:58)
	... 23 more

	解决方案：sql中给commission_pct取别名 commissionPct
	    在BaseDAOImpl类的通用的查询方法中，获取字段名的方法要处理
	        String columnName = metaData.getColumnName(i);//获取第i列的列名称
	        换成
	        String columnName = metaData.getColumnLabel(i);//获取第i列的列名称或别名，如果指定了别名就按照别名来处理
         */
        /*
        java.lang.RuntimeException: java.lang.IllegalArgumentException:
        Can not set double field com.atguigu.bean.Employee.commissionPct to java.math.BigDecimal
Caused by: java.lang.IllegalArgumentException: Can not set double field com.atguigu.bean.Employee.commissionPct to java.math.BigDecimal
	at sun.reflect.UnsafeFieldAccessorImpl.throwSetIllegalArgumentException(UnsafeFieldAccessorImpl.java:167)
	at sun.reflect.UnsafeFieldAccessorImpl.throwSetIllegalArgumentException(UnsafeFieldAccessorImpl.java:171)
	at sun.reflect.UnsafeDoubleFieldAccessorImpl.set(UnsafeDoubleFieldAccessorImpl.java:110)
	at java.lang.reflect.Field.set(Field.java:764)
	at com.atguigu.dao.BaseDAOImpl.getList(BaseDAOImpl.java:68)
	at com.atguigu.dao.EmployeeDAOImpl.getAll(EmployeeDAOImpl.java:61)
	... 23 more

解决方案：JavaBean中的基本数据类型，都换成引用数据类型
mysql中 decimal对应Java中BigDecimal
         */
        /*
        问题3：
        java.lang.RuntimeException: java.lang.IllegalArgumentException: Can not set char field com.atguigu.bean.Employee.gender to java.lang.String
       mysql中char类型对应JavaString

         */
        /*
        问题4：
        java.lang.RuntimeException: java.lang.IllegalArgumentException: Can not set int field com.atguigu.bean.Employee.jobId to null value
        int是基本数据类型,mysql中的int是可以有null值，Java中的int类型是不能有null，
        mysql中int，Java中Integer
         */
    }

    @Test
    public void test02() {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入你要查询的员工编号：");
        int eid = input.nextInt();

        EmployeeDAOImpl dao = new EmployeeDAOImpl();
        Employee employee = dao.getByEid(eid);
        System.out.println(employee);


        input.close();
    }

    @Test
    public void test03() {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入你要删除的员工编号：");
        int eid = input.nextInt();

        EmployeeDAOImpl dao = new EmployeeDAOImpl();
        boolean b = dao.removeEmployee(eid);
        System.out.println(b ? "删除成功" : "删除失败");


        input.close();
    }

    @Test
    public void test04() throws ParseException {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入姓名：");
        String ename = input.next();//李四

        System.out.print("请输入薪资：");
        double salary = input.nextDouble();//15000

        System.out.print("请输入出生日期：");
        String birthday = input.next();//1990-1-1

        System.out.print("请输入性别：");
//        char gender = input.next().charAt(0);//男
        String gender = input.next();//男

        System.out.print("请输入手机号码：");
        String tel = input.next();//13578595685

        System.out.print("请输入邮箱：");
        String email = input.next();//zhangsan@atguigu.com

        input.close();

        Employee employee = new Employee();
        employee.setEname(ename);
        employee.setSalary(salary);
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        employee.setBirthday(sf.parse(birthday));
        employee.setGender(gender);
        employee.setTel(tel);
        employee.setEmail(email);
        employee.setHiredate(new Date());

        EmployeeDAOImpl dao = new EmployeeDAOImpl();
        boolean b = dao.addEmployee(employee);
        System.out.println(b ? "添加成功" : "添加失败");
    }

    @Test
    public void test06() {
        EmployeeDAOImpl dao = new EmployeeDAOImpl();
        long count = dao.getEmployeeCount();
        System.out.println("员工数量：" + count);
    }

    @Test
    public void test07() {
        EmployeeDAOImpl dao = new EmployeeDAOImpl();
        double avgSalary = dao.getAvgSalary();
        System.out.println("avgSalary = " + avgSalary);
    }
}
