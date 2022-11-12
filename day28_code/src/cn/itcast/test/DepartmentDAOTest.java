package cn.itcast.test;

import cn.itcast.bean.Department;
import cn.itcast.dao.DepartmentDAO;
import cn.itcast.dao.DepartmentDAOImpl;
import org.junit.Test;

import java.util.List;
import java.util.Scanner;

public class DepartmentDAOTest {
    @Test
    public void test01() {
        Scanner input = new Scanner(System.in);

        System.out.print("请输入部门名称： ");
        String dname = input.nextLine();

        System.out.print("请输入部门简介： ");
        String desc = input.nextLine();

        Department department = new Department(dname, desc);
        input.close();

        DepartmentDAOImpl dao = new DepartmentDAOImpl();
        boolean result = dao.addDepartment(department);
        System.out.println(result ? "添加成功" : "添加失败");
    }

    @Test
    public void test02() {

        DepartmentDAOImpl dao = new DepartmentDAOImpl();
        Scanner input = new Scanner(System.in);
        System.out.print("请输入你要修改的部门编号：");
        int did = input.nextInt();
        input.nextLine();

        Department department = dao.getByDid(did);

        System.out.print("请输入部门新名称("+department.getDname()+")：");
        String dname = input.nextLine();
        if(dname.trim().length()==0){
            dname = department.getDname();
        }

        System.out.print("请输入部门简介("+department.getDescription()+")：");
        String desc = input.nextLine();
        if(desc.trim().length()==0){
            desc = department.getDescription();
        }
        input.close();


        department = new Department(department.getDid(),dname,desc);//用新的数据重新new对象
        boolean result = dao.updateDepartment(department);
        System.out.println(result?"修改成功":"修改失败");
    }

    @Test
    public void test03(){
        Scanner input = new Scanner(System.in);
        System.out.print("请输入你需要删除的编号： ");
        int did = input.nextInt();

        input.close();
        DepartmentDAOImpl dao = new DepartmentDAOImpl();
        boolean result = dao.removeByDid(did);
        System.out.println(result?"删除成功":"删除失败");

    }
    @Test
    public void test04(){
        DepartmentDAOImpl dao = new DepartmentDAOImpl();
        List<Department> allDepartment = dao.getAllDepartment();
        allDepartment.forEach(System.out::println);
    }
    @Test
    public void test05(){
        DepartmentDAOImpl dao = new DepartmentDAOImpl();
        Department byDid = dao.getByDid(1);
    }
}
