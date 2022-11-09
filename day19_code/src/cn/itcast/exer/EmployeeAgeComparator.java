package cn.itcast.exer;
//（4）声明EmployeeAgeComparator比较器，实现java.util.Comparator<T>接口，重写int compare(T t1, T t2)方法，
// 指定T为Employee类型，按照员工年龄比较大小，年龄相同的按照姓名字典顺序（使用java.text.Collator compare方法）比较大小

import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;

public class EmployeeAgeComparator implements Comparator<Employee> {


    @Override
    public int compare(Employee o1, Employee o2) {
        //        int ageCompareResult = o1.getAge() - o2.getAge();
        int ageCompareResult = Integer.compare(o1.getAge(), o2.getAge());
        int nameCompareResult = Collator.getInstance(Locale.CHINA).compare(o1.getName(), o2.getName());
        return ageCompareResult == 0 ? nameCompareResult : ageCompareResult;
    }
}
