package cn.itcast.constructor_构造器;

public class User {
    private String username;// 用户名
    private String password;// 密码
    private long registrationTime;// 注册时间
    //long 类型，记录系统时间的毫秒值，比较大的一个整数

    // （非静态）代码块
    {
        System.out.println("新用户注册");
        registrationTime = System.currentTimeMillis();
    }

    public User() {
        System.out.println("无参构造");
//        System.out.println("新用户注册");
//        registrationTime = System.currentTimeMillis();
        username = registrationTime + "";//任何数据类型的值与字符串进行“拼接+”结果就是String
        password = "123455";
    }

    public User(String username, String password) {
        System.out.println("有参构造");
//        System.out.println("新用户注册");
        this.username = username;
        this.password = password;
//        registrationTime = System.currentTimeMillis();
    }

    public String getInfo() {
        return "用户名：" + username + "，password：" + password + "，registrationTime=" + registrationTime;
    }
}
