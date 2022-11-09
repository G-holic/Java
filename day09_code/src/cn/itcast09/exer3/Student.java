package cn.itcast09.exer3;

/*
（2）声明子类：Student类，继承Person类
- 新增属性：score成绩，属性私有化，
- 包含get/set方法
- 重写getInfo()方法：例如：姓名：张三，年龄：23，性别：男，成绩：89
 */
public class Student extends Person {
    private int score;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "，成绩： " + score;
    }
}
