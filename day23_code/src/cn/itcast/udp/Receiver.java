package cn.itcast.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/*
（1）先建立一个socket，用于监听是否有数据发过来
（2）准备一个数据报，用于接收数据
（3）接收数据
 */
public class Receiver {
    public static void main(String[] args) throws Exception{
        DatagramSocket ds = new DatagramSocket(8888);

        /*
        public DatagramPacket(byte[] buf,int length)
        构造 DatagramPacket，用来接收长度为 length 的数据包。 length 参数必须小于等于 buf.length。
         */
        byte[] data = new byte[1024];
        DatagramPacket dp = new DatagramPacket(data, data.length);

        ds.receive(dp);//数据接收到dp对象中，本质上是放到data数组中
        System.out.println(new String(data,0,dp.getLength()));// dp.getLength()实际接收了几个字节
        // 断开
        ds.close();
    }
}
