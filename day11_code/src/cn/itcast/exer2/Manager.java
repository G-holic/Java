package cn.itcast.exer2;

/*
（5）声明一个子类Manager经理，继承SalaryEmployee

- 增加属性：奖金比例，私有化，提供get/set方法
- 提供有参构造public Manager(String name, double salary, MyDate birthday, double bonusRate)
- 提供有参构造public Manager(String name,double salary,  int year, int month ,int day, double bonusRate)
- 重写方法，public double earning()返回实发工资， 实发工资 = 薪资 *(1+奖金比例)
- 重写方法，public String getInfo()：显示姓名和实发工资，生日，奖金比例
 */
public class Manager extends SalaryEmployee {
    private double bonusRate;

    public Manager(String name, double salary, MyDate birthday, double bonusRate) {
        super(name, salary, birthday);
        this.bonusRate = bonusRate;
    }

    public Manager(String name, double salary, int year, int month, int day, double bonusRate) {
        super(name, salary, year, month, day);
        this.bonusRate = bonusRate;
    }

    public double getBonusRate() {
        return bonusRate;
    }

    public void setBonusRate(double bonusRate) {
        this.bonusRate = bonusRate;
    }

    @Override
    public double earning() {
        return super.earning() * (1 + bonusRate);
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "，奖金比例： " + bonusRate;
    }
}
