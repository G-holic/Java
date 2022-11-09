package cn.itcast.exer.exer5;

import java.text.Collator;
import java.util.Locale;

public class People implements Comparable<People> {
    private String name;
    private int age;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(People o) {
        // 按照年龄比较大小，年龄相同的，按照姓名的自然顺序比较大小
        int ageCompareResult = age - o.age;
//        int ageCompareResult = Integer.compare(age, o.age);
        return ageCompareResult == 0 ? name.compareTo(o.name) : ageCompareResult;
    }
}
