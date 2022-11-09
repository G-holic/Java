package cn.itcast.exer;

import java.io.File;

//递归删除非空目录
public class Exercise2 {
    public static void main(String[] args) {
        //友情提示：找一个没有用的文件夹测试，不然删除后，不在回收站
        File dir = new File("d:\\工具 - 副本");
        forceDelete(dir);

    }
    public static void forceDelete(File dir){
        /*
        思路：先把dir的下一级干掉，再删除dir自己
         */
        //先把dir的下一级干掉
        if (dir.isDirectory()){
            File[] files = dir.listFiles();
            for (File sub : files) { //sub是dir的下一级，可能是文件，可能是文件夹，而且文件夹可能是非空的
                forceDelete(sub);
            }
        }
        // 删除自己
        dir.delete();
    }
}
