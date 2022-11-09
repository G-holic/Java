package cn.itcast.exer2;

/*
（3）声明一个子类SalaryEmployee正式工，继承父类Employee

- 增加属性，double类型的薪资，MyDate类型的出生日期，私有化，提供get/set方法
- 提供有参构造public SalaryEmployee(String name, double salary,  MyDate birthday)
- 提供有参构造public SalaryEmployee(String name,double salary,  int year, int month ,int day)
- 重写方法，public double earning()返回实发工资， 实发工资 = 薪资
- 重写方法，public String getInfo()：显示姓名和实发工资、生日
 */
public class SalaryEmployee extends Employee {
    private double salary;
    private MyDate birthday;
    /*
    如果此时SalaryEmployee不去编写构造器，那么代码会出现编译错误。
    因为Employee类父类，此时没有无参构造，
    而编译器如果要给我们自动生成SalaryEmployee类的无参构造时，自动是调用父类的无参构造的，
    那么父类没有无参构造给我们调用，所以必须编写构造器。
     */
    public SalaryEmployee(String name, double salary, MyDate birthday) {
        super(name);
        this.salary = salary;
        this.birthday = birthday;
    }

    public SalaryEmployee(String name, double salary, int year, int month, int day) {
        /*        super(name);
        this.salary = salary;
        this.birthday = new MyDate(year, month ,day);*/
        this(name, salary, new MyDate(year, month, day));
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public double earning() {
        return salary;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "生日： " + birthday;
    }
}
