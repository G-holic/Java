package cn.itcast.constructor_构造器;

public class Employee {
    private int id;
    private String name;
    private String tel;
    private double salary;
    private String address;
    private int age;
    private char gender;
    /*
    用IDEA工具自动生成构造器的代码，快捷键是Alt + Insert，选择Constructor
    （1）无参构造：Select None
    （2）有参构造：选中几个成员变量，就为几个成员变量赋值
     */

    public Employee() {// 无参构造
    }

    public Employee(int id, String name) {
        //假设这里要调用上面无参构造的话
//        this();
        //假设这里要调用下面的public Employee(int id, String name, String tel, double salary)
        this.id = id;
        this.name = name;
    }

    public Employee(int id, String name, String tel, double salary) {
//        this.id = id;
//        this.name = name;
        this(id, name);//调用当前类，本类的public Employee(int id, String name)
        this.tel = tel;
        this.salary = salary;
    }

    public Employee(int id, String name, String tel, double salary, String address, int age, char gender) {
//        this.id = id;
//        this.name = name;
//        this.tel = tel;
//        this.salary = salary;
        this(id, name, tel, salary);
        this.address = address;
        this.age = age;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getInfo(){
        return "编号：" + id + "，姓名：" + name +"，电话：" + tel +"，薪资：" +salary +"，地址：" + address+"，年龄：" + age + "，性别：" + gender;
    }
}
