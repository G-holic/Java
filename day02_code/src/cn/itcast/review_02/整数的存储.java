package cn.itcast.review_02;
/*
1、如何存储整数？
以字节为基本单位。
byte：1个字节
short：2个字节
int：4个字节
long：8个字节

先把十进制的整数转换为二进制的整数。
然后二进制的最高位（最左边）用来表示符号位。
byte：x0000000
short：x0000000 00000000
int：x0000000 00000000 00000000 00000000
long：x0000000 00000000 00000000 00000000 00000000 00000000 00000000 00000000

底层都是用补码来存储和计算的。
正数：原码、反码、补码一致
负数：原码，把整数的绝对值转换为二进制，然后最高位用1表示
      反码：在原码的基础上，符号位不变，其余位取反（0变1,1变0）
	  补码：在反码的基础上+1

以byte为例，一个字节的整数可以表示的范围：-128~127


*/
public class 整数的存储 {
    public static void main(String[] args) {

    }
}
