package cn.itcast.exer.exer6;

import java.util.Comparator;

public class EmpSalaryComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
       Employee e1 = (Employee)o1;
       Employee e2 = (Employee)o2;
        //       return (int)(e1.getSalary() - e2.getSalary()); //小数没有参与
       return Double.compare(e1.getSalary(),e2.getSalary());//小数部分参与比较
    }
}
