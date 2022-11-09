package cn.itcast.exer;

/*
（1）声明员工类型Employee，包含属性姓名（String），薪资（double），年龄（int），属性私有化，提供有参构造、get/set方法、重写toString方法。
（2）员工类Employee实现java.lang.Comparable<T>接口，指定T为Employee类型，重写抽象方法int compareTo(T t)，按照薪资比较大小，
    薪资相同的按照姓名的自然顺序（调用String类的compareTo方法）比较大小。

 */
public class Employee implements Comparable<Employee> {
    private String name;
    private double salary;
    private int age;

    public Employee(String name, double salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        /*
        重写抽象方法int compareTo(T t)，按照薪资比较大小，薪资相同的按照姓名的自然顺序（调用String类的compareTo方法）比较大小。
         */
        int salaryCompareResult = Double.compare(salary, o.salary);
        return salaryCompareResult == 0 ? name.compareTo(o.name) : salaryCompareResult;
    }
}
