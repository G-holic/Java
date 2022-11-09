package cn.itcast.enumtype;

public class Season {
    //提前创建好固定的几个常量对象，常量对象名习惯是大写，把单词转为大写的快捷键：Ctrl + Shift + U
    public static final Season SPRING = new Season("春天");
    public static final Season SUMMER = new Season();
    public static final Season AUTUMN = new Season();
    public static final Season WINTER = new Season();

    private Season() { } //构造器私有化，外面就不能new对象了

    private String description;

    private Season(String description){
        this.description = description;
    }

    @Override
    public String toString() {
        return "Season{" +
                "description='" + description + '\'' +
                '}';
    }
}
