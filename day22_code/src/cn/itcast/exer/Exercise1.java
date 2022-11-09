package cn.itcast.exer;

import java.io.File;

//求某个目录（某个文件夹）总大小
public class Exercise1 {
    public static void main(String[] args) {
        File dir = new File("d:\\工具");
//        System.out.println(dir.length());// //无法直接通过length方法获取文件夹的总大小
        System.out.println(getDirectoryLength(dir));// 1446519355字节
    }

    public static long getDirectoryLength(File dir) {
         /*
        用一个变量，累加这个文件夹里面（包含下一级的下一级）的文件的大小。
         */
        long sum = 0;
        if (dir.isFile()) {// 如果是文件，那么直接用length方法表示大小
            sum = dir.length();
        } else if (dir.isDirectory()) {
            // 列出文件夹的下一级
            File[] files = dir.listFiles();
            for (File sub : files) {// sub是dir的下一级，它可能是一个文件，也可能是一个文件夹
//              sum += sub的大小;
                sum += getDirectoryLength(sub);
            }
        }

        return sum;
    }


}
