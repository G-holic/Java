package cn.itcast.map;

import java.util.HashMap;

public class TestNull {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(null,"value");// 放到下标为0的地方
    }
}
