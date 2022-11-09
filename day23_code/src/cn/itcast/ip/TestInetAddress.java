package cn.itcast.ip;

import org.junit.Test;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
回忆：接触哪个包
java.lang
java.math
java.util
java.io
java.text
java.time及其子包（新版日期时间API）

java.net包
 */
public class TestInetAddress {
    @Test
    public void test01() throws UnknownHostException {
        InetAddress localHost = InetAddress.getLocalHost();// 获取本机主机名和IP地址
        System.out.println(localHost);// DESKTOP-MAO/10.107.24.11
    }
    @Test
    public void test02()throws UnknownHostException{
        InetAddress atguigu = InetAddress.getByName("www.atguigu.com");
        System.out.println(atguigu);// www.atguigu.com/124.225.167.206
    }

    @Test
    public void test03()throws UnknownHostException{

//        byte[] addr = {10,107,24,11};
        byte[] addr = {(byte)10,(byte)107,24,11};
        InetAddress address = InetAddress.getByAddress(addr);
        System.out.println(address);// /10.107.24.11
    }
}
