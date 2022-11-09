package cn.itcast.pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestNotCaptureGroup3 {
    public static void main(String[] args) {
        String str = "aaaaaaaa";
        Pattern p = Pattern.compile("[0-9a-z]{2}(?=aa)");
        //找出两个字符，它后面紧跟两个"aa"的字符
        Matcher m = p.matcher(str);
        while(m.find()){
            System.out.println(m.group(0));
        }
    }
}
