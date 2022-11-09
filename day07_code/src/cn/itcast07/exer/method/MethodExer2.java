package cn.itcast07.exer.method;

public class MethodExer2 {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.name = "张三";
//        e1.birthday = new MyDate();
        e1.setBirthday(2000,11,6);
        String info = e1.getEmpInfo();
        System.out.println(info);

        Employee e2 = new Employee();
        e2.name = "李四";
//        e2.birthday = new MyDate();
        e2.setBirthday(2002,10,16);
        String info2 = e2.getEmpInfo();
        System.out.println(info2);
    }
}
