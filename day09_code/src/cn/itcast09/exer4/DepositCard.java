package cn.itcast09.exer4;

/*
（1）声明一个银行储蓄卡类，
- 包含属性：账户，余额，属性私有化
- 包含get/set方法
- public void withdraw(double money)：取款，
  - 取款金额不能为负数，否则提示取款金额不能为负数
  - 取款金额不能超过账户余额，否则提示余额不足
- public void save(double money)：存款，
  - 存款金额不能为负数，否则提示存款金额不能为负数
- public String getInfo() 可以返回账户和余额
 */
public class DepositCard {
    private String id;
    private double balance;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    //    public void setBalance(double balance) {// 不能随意改余额
//        this.balance = balance;
//    }
    public void withdraw(double money) {
        if (money < 0) {
            System.out.println("取款金额不可以为负数");
            return;
        }
        if (money > balance) {
            System.out.println("余额不足");
            return;
        }
        //余额减少
        balance -= money;
    }

    public void save(double money) {
        if (money < 0) {
            System.out.println("存款金额不能为负数");
            return;
        }
        //余额增加
        balance += money;
    }

    public String getInfo() {
        return "帐户： " + id + "，余额： " + balance;
    }
}
