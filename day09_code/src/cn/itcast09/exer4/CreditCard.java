package cn.itcast09.exer4;

/*
（2）声明一个银行信用卡类，继承储蓄卡类
- 增加属性：本月可透支总额度，本月已透支金额
- 重写public void withdraw(double money)，可透支，
  - 取款金额超过账户余额+本月还可透支额度，提示超过可透支额度
  - 取款金额在账户余额范围内，不用透支
  - 取款金额超过账户余额但在可透支范围内，需要透支
- 重写public void save(double money)，
  - 存款金额不能为负数，否则提示存款金额不能为负数
  - 本次存款金额只够偿还部分已透支金额
  - 本次存款金额除了偿还透支金额，还有剩余
 */
public class CreditCard extends DepositCard {
    private double totalOverdraft;//本月可透支总额度
    private double overdraft;//本月已透支金额

    public double getTotalOverdraft() {
        return totalOverdraft;
    }

    public void setTotalOverdraft(double totalOverdraft) {
        this.totalOverdraft = totalOverdraft;
    }

    public double getOverdraft() {
        return overdraft;
    }

//    public void setOverdraft(double overdraft) {//已透支金额不可以随便改
//        this.overdraft = overdraft;
//    }

    /*
    重写public void withdraw(double money)，可透支，
  - 取款金额超过账户余额+本月还可透支额度，提示超过可透支额度
  - 取款金额在账户余额范围内，不用透支
  - 取款金额超过账户余额但在可透支范围内，需要透支
    * */
    @Override
    public void withdraw(double money) {
        // 本月还可透支额度
        double amount = totalOverdraft - overdraft;//可透支的总额度 - 已透支的额度
        if (money > getBalance() + amount) {
            System.out.println("超过透支额度");
            return;
        }
        if (money < getBalance()) {
            super.withdraw(money);//直接用父类的取款方法，修改余额即可
            return;
        }
//        取款金额超过账户余额但在可透支范围内
        /*
        需要修改余额
        需要修改已透支的额度
        * */
        overdraft += money - getBalance(); // money - getBalance() 超过余额的部分
        super.withdraw(getBalance());// 全部取完
    }

    /*
    - 重写public void save(double money)，
    - 存款金额不能为负数，否则提示存款金额不能为负数
    - 本次存款金额只够偿还部分已透支金额
    - 本次存款金额除了偿还透支金额，还有剩余
    * */
    @Override
    public void save(double money) {
//       存款金额不能为负数，否则提示存款金额不能为负数
        if (money < 0) {
            System.out.println("存款金额不能为负数");
            return;
        }
//       本次存款金额只够偿还部分已透支金额
        if (money < overdraft) {
            overdraft -= money;//偿还部分已透支的额度
            return;
        }
//       本次存款金额除了偿还透支金额，还有剩余
        /*
        修改已透支额度
        修改余额
         */
        super.save(money - overdraft);//余额增加本次还完透支额度剩余的钱数
        overdraft = 0;
    }

    public String getInfo() {
        return super.getInfo() + "，本月总的透支额度： " + totalOverdraft + "，本月已透支： " + overdraft + "，本月还可透支： " + (totalOverdraft - overdraft);
    }
}
