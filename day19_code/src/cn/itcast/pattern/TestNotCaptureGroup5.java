package cn.itcast.pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestNotCaptureGroup5 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("(\\d+)(?:\\.?)(?:\\d*)([￥$])");
        String[] arr = {"8895￥","8899.56￥","6688$","8965"};
        for (String str : arr) {
            Matcher m = p.matcher(str);
            if(m.matches()){
                System.out.println("货币金额: " + m.group(0));
                System.out.println("货币金额: " + m.group(1));
                System.out.println("货币种类: " + m.group(2));
                //非捕获组（?:），它可以理解为只匹配而不捕获。所以无论是否匹配(?:\\.?)(?:\\d*)，都不捕获，即无论是否有小数，这里都只有group(1)和group(2)
                //捕获组，可以理解为匹配且捕获。捕获整数部分金额值，和金额单位值。
            }
        }
    }
}
