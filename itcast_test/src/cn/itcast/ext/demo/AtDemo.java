package cn.itcast.ext.demo;

public class AtDemo {
    private String info;
    private int num;

    public AtDemo(String info, int num) {
        this.info = info;
        this.num = num;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "AtDemo{" +
                "info='" + info + '\'' +
                ", num=" + num +
                '}';
    }
}
