package cn.itcast.exer.exer6;
/*
（3）在测试类创建Employee[]元素数组，长度为5，创建5个员工对象
- 按照编号从小到大排序输出
- 按照编号从大到小排序输出（声明一个类实现Comparator接口，实现按照编号逆序比较大小）
- 按照薪资从低到高排序输出（声明一个类实现Comparator接口，实现按照薪资比较大小）
- 按照年龄从大到小排序输出（声明一个类实现Comparator接口，实现按照年龄逆序比较大小）
 */
public class Exer6 {
    public static void main(String[] args) {
        Employee[] arr = new Employee[5];
        arr[0] = new Employee(1,"张三",15000,23);
        arr[1] = new Employee(2,"李四",12000,21);
        arr[2] = new Employee(4,"王五",16000,22);
        arr[3] = new Employee(5,"赵六",12000,23);
        arr[4] = new Employee(3,"钱七",13000,25);
        // 按照编号从小到大排序输出
        // 编号排序是Employee类的自然排序，默认排序
        System.out.println("按照编号从小到大排序输出");
        ArrayTools.sort(arr);
        ArrayTools.print(arr);

        // 编号从大到小排序输出
        System.out.println("按照编号从大到小排序输出");
        EmpIdReverseComparator er = new EmpIdReverseComparator();
        ArrayTools.sort(arr,er);
        ArrayTools.print(arr);

        // 按照薪资从低到高排序输出
        System.out.println("按照薪资从低到高排序输出");
        EmpSalaryComparator es = new EmpSalaryComparator();
        ArrayTools.sort(arr, es);
        ArrayTools.print(arr);

        // 按照年龄从大到小排序输出
        System.out.println("按照年龄从大到小排序输出");
        EmpAgeComparator ea = new EmpAgeComparator();
        ArrayTools.sort(arr, ea);
        ArrayTools.print(arr);


    }
}
