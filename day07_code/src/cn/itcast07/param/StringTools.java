package cn.itcast07.param;

//写一个方法实现n个字符串进行拼接，每一个字符串之间使用某字符进行分割，如果没有传入字符串，那么返回空字符串""
public class StringTools {
    //String... strings是可变参数，可以传入0~n个的元素
    //但是char separator不是可变参数，调用时必须传入对应类型的实参
    public String concat(char separator, String... strings) {
        if (strings == null || strings.length == 0) {
            return "";
        }
        String result = "";
        for (int i = 0; i < strings.length; i++) {
            if (i < strings.length - 1) {
                result += strings[i] + separator;
            } else {
                result += strings[i];
            }

        }
        return result;
    }
}
