package cn.itcast09.encapsulability_封装;

public class Student {
    private String name;
    private int score;
    private int age;
    private boolean marry;

    public boolean isMarry() {
        return marry;
    }

    public void setMarry(boolean marry) {
        this.marry = marry;
    }
//    public void setName(String n){
//        name = n;
//    }
//
//    public String getName(){
//        return name;
//    }
    //快捷键，自动生成get/set
    //在要写get/set方法的位置，鼠标的光标不要定位错位置了
    //按快捷键 Alt + Insert，部分同学需要同时按Fn

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        //加条件判断，加逻辑的控制
        if (age <= 20 || age >= 35) {
            return;
//            throw new IllegalArgumentException(age +"非法");
        }
        this.age = age;
    }
}
