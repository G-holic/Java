package cn.itcast.block_非静态代码块;

import cn.itcast.constructor_构造器.User;

/*
6.4.2 类的第四个成员（结构）——（非静态）代码块（了解）
1、作用：是用来给“实例变量”初始化的
2、意义：把多个构造器中的代码抽取出来，写到代码块中，减少代码冗余。
3、执行特点：
代码块中的代码会自动执行，
当new对象时，自动执行，不new对象不会执行。
每new一个对象，执行一次。

无论它写在哪里，都是比构造器先执行。

4、格式：
【修饰符】 class 类{

    {
        非静态代码块
    }
}


案例：
（1）声明User类，
- 包含属性：username（String类型），
password（String类型），
registrationTime（long类型），私有化
- 包含get/set方法，其中registrationTime没有set方法
- 包含无参构造，
  - 输出“新用户注册”，
  - registrationTime赋值为当前系统时间，
  - username就默认为当前系统时间值，
  - password默认为“123456”
- 包含有参构造(String username, String password)，
  - 输出“新用户注册”，
  - registrationTime赋值为当前系统时间，
  - username和password由参数赋值

- 包含public String getInfo()方法，返回：“用户名：xx，密码：xx，注册时间：xx”

 提示：System类有一个方法可以获取当前系统时间
 long System.currentTimeMillis()：具体1970-1-1 0.0.0 0时间差值，毫秒值
 */
public class TestBlock {
    public static void main(String[] args) {
        User u1 = new User();//调用无参构造创建对象
        User u2 = new User("chai", "lin");//调用有参构造创建对象

        System.out.println(u1.getInfo());
        System.out.println(u2.getInfo());
    }
}
