import org.junit.Test;
import redis.clients.jedis.Jedis;

import java.util.Scanner;
import java.util.Set;

@SuppressWarnings("all") // 屏蔽所有警告
public class login {
    private static Jedis jedis = new Jedis("10.107.24.12", 6379);
    private static String username;
    private static String password;
    private static Scanner scanner = new Scanner(System.in);
    private static login l1 = new login();

    public static void main(String[] args) {
        // 打印所有的键值对
        l1.redisPrint();
        // 接受控制台的输入
        Scanner scanner = new Scanner(System.in);
        // 判断控制台的输入
        while (true) {
            System.out.println("注册输入1\t登录输入2\t退出输入3:");
            int a = scanner.nextInt();
            switch (a) {
                case 1:
                    // 根据控制台的输入，调用注册方法
                    l1.register();
                    break;
                case 2:
                    // 根据控制台的输入，调用登录方法
                    l1.login();
                    break;
                case 3:
                    // 根据控制台的输入，调用退出方法
                    System.out.print("是否真的退出（Y/N）");
                    char confirm = l1.readConfirmSelection();
                    if (confirm == 'Y') {
                        return; // 退出
                    }
                default:
                    System.out.println("输入有误，请正确输入1~3！");
                    break;
            }
            l1.readContinue();
        }
    }

    //注册方法
    public void register() {
        // 设置新键就是用户名，值就是密码
        username = "app";
        System.out.println("你的用户名（键）是:" + username);
        password = jedis.get("app");
        System.out.println("请输入你的密码（值）:" + password);
        System.out.println("你注册的帐号是: " + username + "，密码是: " + password);
    }

    // 登录方法
    public void login() {
        System.out.print("请输入你的用户名（键）:");
        username = scanner.next();
        System.out.print("请输入你的密码（值）:");
        password = scanner.next();
        Set<String> keys = jedis.keys("*");
        for (String key : keys) {
            if (key.equals(username) && jedis.get(key).equals(password)) {
                System.out.println("登录成功");
                break;
            } else {
                System.out.println("数据库中未检测到该用户，无法登录");
                break;
            }
        }
        System.out.println("你登录的帐号是: " + username + "，密码是: " + password);
    }

    // 退出方法
    public static char readConfirmSelection() {
        char c;
        for (; ; ) {
            String str = readKeyBoard(1, false).toUpperCase();
            c = str.charAt(0);
            if (c == 'Y' || c == 'N') {
                break;
            } else {
                System.out.print("选择错误，请重新输入： ");
            }
        }
        return c;
    }

    private static String readKeyBoard(int limit, boolean blankReturn) {
        String line = "";

        while (scanner.hasNextLine()) {
            line = scanner.nextLine();
            if (line.length() == 0) {
                if (blankReturn) {
                    return line;
                } else {
                    continue;
                }
            }

            if (line.length() < 1 || line.length() > limit) {
                System.out.print("输入长度（不大于" + limit + "）错误，请重新输入： ");
                continue;
            }
            break;
        }
        return line;
    }

    public void readContinue() {
        System.out.println("按回车键继续.....");
        scanner.nextLine();
    }

    // 打印方法
    public void redisPrint() {
        Set<String> keys = jedis.keys("*");
        for (String key : keys) {
            System.out.println("key = " + key + "\t" + "value = " + jedis.get(key));
        }
    }

    // 如果无键值对，先运行下面方法创建
    @Test
    public void getTest(){
        String res1 = jedis.set("username","12345");
        String res2 = jedis.set("book","1234567");
        String res3 = jedis.set("app","123456");
        System.out.println("res1 = " + res1);
        System.out.println("res2 = " + res2);
        System.out.println("res3 = " + res3);
    }
}







