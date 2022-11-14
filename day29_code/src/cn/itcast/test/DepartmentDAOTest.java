package cn.itcast.test;

import cn.itcast.bean.Department;
import cn.itcast.dao.DepartmentDAOImpl;
import cn.itcast.utils.JDBCToolsFinal;
import org.junit.Test;

import java.sql.Connection;
import java.util.List;
import java.util.Scanner;
public class DepartmentDAOTest {

    @Test
    public void test01(){
        Scanner input = new Scanner(System.in);

        System.out.print("请输入部门名称：");
        String dname = input.nextLine();

        System.out.print("请输入部门简介：");
        String desc = input.nextLine();

        Department department = new Department(dname,desc);

        DepartmentDAOImpl dao = new DepartmentDAOImpl();
        boolean result = dao.addDepartment(department);
        System.out.println(result?"添加成功":"添加失败");
        input.close();
    }

    @Test
    public void test02(){
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
        System.out.print("请输入你要删除的部门编号：");
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
    public void test05()throws Exception{
        Connection connection = JDBCToolsFinal.getConnection();
        connection.setAutoCommit(false);//手动提交模式

        try {
            //同时修改两个部门
            DepartmentDAOImpl dao = new DepartmentDAOImpl();
            Department d1 = dao.getByDid(1);//编号为1的部门
            System.out.println(d1);
            d1.setDescription("yy");

            Department d2 = dao.getByDid(2);//编号为2的部门
            System.out.println(d2);
            d2.setDescription("xx");


            dao.updateDepartment(d1);
            d2.setDname(null);//为了制造失败，把编号为2的部门，部门名称设置为NULL
            dao.updateDepartment(d2);

            System.out.println("修改成功");
            connection.commit();//提交事务
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("修改失败");
            connection.rollback();//回滚
        }

        JDBCToolsFinal.freeConnection();
    }

    @Test
    public void test9(){
        DepartmentDAOImpl dao = new DepartmentDAOImpl();
        Department[] arr = new Department[1000];

        for(int i=0; i<arr.length; i++){
            arr[i] = new Department();
            arr[i].setDname("测试"+i);
            arr[i].setDescription("测试简介"+i);
        }
        dao.batch(arr);
    }
}
