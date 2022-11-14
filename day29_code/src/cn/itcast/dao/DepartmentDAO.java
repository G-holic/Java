package cn.itcast.dao;


import cn.itcast.bean.Department;

import java.util.List;

public interface DepartmentDAO {
    //添加一个部分
    boolean addDepartment(Department department);

    //修改部门，部门编号不变，其他可以修改
    boolean updateDepartment(Department department);

    //根据部门编号删除一个部门
    boolean removeByDid(int did);

    //查询所有部门
    List<Department> getAllDepartment();

    //根据部门编号查询一个部门
    Department getByDid(int did);

    //批处理添加多个部门
    void batch(Department[] departments);
}
