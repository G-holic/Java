package cn.itcast.bean;

import java.math.BigDecimal;
import java.util.Date;

public class Employee {
    private Integer eid;
    private String ename;
    private double salary;
    private BigDecimal commissionPct;//commission_pct
    private Date birthday;
    private String gender;
    private String tel;
    private String email;
    private String address;
    private String workPlace = "北京";
    private Date hiredate;
    private Integer jobId;
    private Integer mid;
    private Integer did;

    public Employee() {
    }

    public Employee(Integer eid, String ename, double salary, BigDecimal commissionPct, Date birthday, String gender, String tel, String email, String address, String workPlace, Date hiredate, Integer jobId, Integer mid, Integer did) {
        this.eid = eid;
        this.ename = ename;
        this.salary = salary;
        this.commissionPct = commissionPct;
        this.birthday = birthday;
        this.gender = gender;
        this.tel = tel;
        this.email = email;
        this.address = address;
        this.workPlace = workPlace;
        this.hiredate = hiredate;
        this.jobId = jobId;
        this.mid = mid;
        this.did = did;
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public BigDecimal getCommissionPct() {
        return commissionPct;
    }

    public void setCommissionPct(BigDecimal commissionPct) {
        this.commissionPct = commissionPct;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getWorkPlace() {
        return workPlace;
    }

    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", ename='" + ename + '\'' +
                ", salary=" + salary +
                ", commissionPct=" + commissionPct +
                ", birthday=" + birthday +
                ", gender='" + gender + '\'' +
                ", tel='" + tel + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", workPlace='" + workPlace + '\'' +
                ", hiredate=" + hiredate +
                ", jobId=" + jobId +
                ", mid=" + mid +
                ", did=" + did +
                '}';
    }
}
