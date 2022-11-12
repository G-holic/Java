package cn.itcast.dao;

import cn.itcast.bean.Department;

import java.sql.SQLException;
import java.util.List;

public class DepartmentDAOImpl extends BaseDAOImpl implements DepartmentDAO {

    @Override
    public boolean addDepartment(Department department) {
        String sql = "INSERT INTO t_department VALUES(null,?,?)";
        try {
            return update(sql, department.getDname(), department.getDescription()) > 0;
        } catch (SQLException e) {
            //SQLException编译时异常，
            //new RuntimeException(e)把编译时异常转换为运行时异常，抛给上层
            throw new RuntimeException(e);
        }

    }

    @Override
    public boolean updateDepartment(Department department) {
        String sql = "UPDATE t_department SET dname = ?,description = ? WHERE did = ?";
        try {
            return update(sql, department.getDname(), department.getDescription(), department.getDid()) > 0;
        } catch (SQLException e) {
            //SQLException编译时异常，
            //new RuntimeException(e)把编译时异常转换为运行时异常，抛给上层
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean removeByDid(int did) {
        String sql = "DELETE FROM t_department WHERE did = ?";
        try {
            return update(sql, did) > 0;
        } catch (SQLException e) {
            //SQLException编译时异常，
            //new RuntimeException(e)把编译时异常转换为运行时异常，抛给上层
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Department> getAllDepartment() {
        String sql = "SELECT * FROM t_department";
        try {
            return getList(Department.class, sql);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Department getByDid(int did) {
        String sql = "SELECT * FROM t_department where did = ?";
        try {
            return getBean(Department.class, sql, did);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


}
