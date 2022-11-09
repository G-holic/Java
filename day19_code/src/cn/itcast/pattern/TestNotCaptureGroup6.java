package cn.itcast.pattern;

public class TestNotCaptureGroup6 {
    public static void main(String[] args) {
        String password = "Clyya1";

        //密码要求：必须有大写字母，小写字母，数字组成，6位
        System.out.println(password.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])[A-Za-z0-9]{6}$"));
        /*
        （1）密码的长度为6，且只能有[A-Za-z0-9]组成。
        （2）另外，三个非捕获组都能匹配到自己的值。
        (?=.*[A-Z])：匹配值  C
        (?=.*[a-z])：匹配值  Clyya
        (?=.*[0-9])：匹配值  Clyya1
        三个非捕获组都有值。
         */
    }
}
