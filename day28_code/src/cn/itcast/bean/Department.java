package cn.itcast.bean;

public class Department {
    private int did;
    private String dname;
    private String description;

    public Department() {
    }

    public Department(String dname, String description) {
        this.dname = dname;
        this.description = description;
    }

    public Department(int did, String dname, String description) {
        this.did = did;
        this.dname = dname;
        this.description = description;
    }

    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Department{" +
                "did=" + did +
                ", dname='" + dname + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
