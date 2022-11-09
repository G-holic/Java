package cn.itcast.exer.exer2;
/*
3、声明植物Plant类，实现LiveAble接口。
* void eat();实现为“吸收营养”
* void breathe();实现为"吸入二氧化碳呼出氧气"
 */
public class Plant implements LiveAble{
    @Override
    public void eat() {
        System.out.println("吸收营养");
    }

    @Override
    public void breathe() {
        System.out.println("吸入二氧化碳呼出氧气");
    }
}
