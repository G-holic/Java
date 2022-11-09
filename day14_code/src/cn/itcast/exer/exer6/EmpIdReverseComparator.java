package cn.itcast.exer.exer6;

import java.util.Comparator;

public class EmpIdReverseComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Employee e1 = (Employee)o1;
        Employee e2 = (Employee)o2;
        return e2.getId() - e1.getId();
    }
}
