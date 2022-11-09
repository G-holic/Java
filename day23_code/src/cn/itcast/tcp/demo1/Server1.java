package cn.itcast.tcp.demo1;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
/*
需求：
(1)开启一个TCP协议的服务，在8888端口号监听客户端的连接。
(2)接收一个客户端的连接
(3)给这个客户端发一句话：欢迎登录
(4)断开
 */
public class Server1 {
    public static void main(String[] args) throws IOException {
        // （1）开启一个TCP协议的服务，在8888端口号监听客户端的连接。
        ServerSocket server = new ServerSocket(8888);
        // (2)接收一个客户端的连接
        Socket socket = server.accept();
        System.out.println(socket.getInetAddress().getHostAddress()+"连接成功");
        /*
        这是一个阻塞式方法，
        如果此时没有客户端来请求，则这句代码一直等待。
        这句代码执行一次，就表示有一个客户端请求连接了，并且连接成功，连接成功后，会给它分配一个Socket对象，
        这个Socket对象用来和这个客户端进行数据的传输通信。
         */

        //(3)给这个客户端发一句话：欢迎登录
        OutputStream out = socket.getOutputStream();// 获取输出流，用于发送消息，输出数据
        String info = "欢迎登录";
        out.write(info.getBytes());// getBytes()方法把字符串转为字节数据

        // (4)断开
        //如果后面不和这个客户端通信了，就要关闭socket
        socket.close();

        //如果后面也不接收其他客户端连接了，那么服务要关闭
        server.close();
    }
}
