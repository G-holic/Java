package cn.itcast.annotation_注解;


/*
"李四"就是 MyAnnotation注解中 String value(); 抽象方法的返回值
    等价于

    @Override
    public String value(){
        return "李四";
    }
 */
@MyAnnotation(value = "李四", info = "我是李四")// 我是李四覆盖了默认值
@YourAnnotation
public class MyClass {

}
