package cn.itcast.dao;

import cn.itcast.bean.Employee;

import java.sql.SQLException;
import java.util.List;

public class EmployeeDAOImpl extends BaseDAOImpl implements EmployeeDAO {

    @Override
    public boolean addEmployee(Employee employee) {
        String sql = "insert into t_employee(`eid`,`ename`,`salary`,`commission_pct`,`birthday`," +
                "`gender`,`tel`,`email`,`address`,`work_place`,`hiredate`,`job_id`,`mid`,`did`)" +
                "values(null,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            return update(sql, employee.getEname(),
                    employee.getSalary(),
                    employee.getCommissionPct(),
                    employee.getBirthday(),
                    employee.getGender(),
                    employee.getTel(),
                    employee.getEmail(),
                    employee.getAddress(),
                    employee.getWorkPlace(),
                    employee.getHiredate(),
                    employee.getJobId(),
                    employee.getMid(),
                    employee.getDid()) > 0;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Employee getByEid(int eid) {
//        String sql = "select * from t_employee where eid = ?";
        String sql = "SELECT `eid`,`ename`,`salary`,`commission_pct` AS commissionPct,`birthday`,`gender`,`tel`,`email`,`address`,`work_place` AS workPlace,`hiredate`,`job_id` AS jobId,`mid`,`did` FROM t_employee where eid = ?";

        try {
            return getBean(Employee.class, sql, eid);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean removeEmployee(int eid) {
        String sql = "delete from t_employee where eid = ?";
        try {
            return update(sql, eid) > 0;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Employee> getAll() {
//        String sql = "select * from t_employee";
        String sql = "SELECT `eid`,`ename`,`salary`,`commission_pct` AS commissionPct,`birthday`,`gender`,`tel`,`email`,`address`,`work_place` AS workPlace,`hiredate`,`job_id` AS jobId,`mid`,`did` FROM t_employee";

        try {
            return getList(Employee.class, sql);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
