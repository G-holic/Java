package cn.itcast.classics_经典接口;

public class Student implements Comparable {
    private String name;
    private int score;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String name, int score, int age) {
        this.name = name;
        this.score = score;
        this.age = age;
    }

    public Student() {
    }

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        // 按自己实际需求
        // 哪两个对象比较大小
        // 当前对象this(调用这个方法的对象) 和 o对应的实参对象
        Student student = (Student) o;
        // 这里为什么要向下转型？因为要有o对象中的成绩等信息
        int result = this.score - student.score;

        if (result != 0) {//成绩不相同
            return result;
        }
        // name是String，是对象，对象比较大小，默认就是用compareTo方法
        return this.name.compareTo(student.name);
        // 这里因为String类型 也实现了Comparable接口
        // 所以，String类型的变量也可以调用compareTo方法
        // String类中是按照字符的 Unicode 编码值比较大小
    }
}
