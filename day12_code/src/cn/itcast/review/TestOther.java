package cn.itcast.review;


public class TestOther {
    public static void main(String[] args) {
        Other o = new Other();
        new TestOther().addOne(o);
        /*
         （1）new TestOther()：匿名对象，作用是为了调用addOne方法。
         （2）上面的实参o，把Other对象的地址值，传给了下面的addOne方法的形参o
         （3）下面的addOne方法的形参o，前面有一个final修饰，
         这个final在这里的意思是，形参o不能够指向新的对象，
         这就意味着，形参和实参此时一定是指向同一个对象。
         （4）如果形参和实参指向同一个对象，那么形参对象属性值的修改，其实就是实参对象属性值的修改
         */
        System.out.println(o.i);//1
    }

    public void addOne(final Other o){
//        o = new Other();//错误，o不能重新赋值
        o.i++;
    }
}
class Other{
    public int i; //如果i前面有final，才是表示i的值不能被修改
}
