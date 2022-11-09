package cn.itcast.exer;

import org.junit.Test;

import java.io.*;

public class Exercise6 {
    @Test
    public void test02() throws IOException {
        //GBK编码的1.txt，复制UTF-8的2.txt文件
        FileInputStream fis = new FileInputStream("1.txt");
        InputStreamReader isr = new InputStreamReader(fis, "GBK");
        BufferedReader br = new BufferedReader(isr);

        FileOutputStream fos = new FileOutputStream("2.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
        BufferedWriter bw = new BufferedWriter(osw);

        String str;
        while ((str = br.readLine()) != null) {
            bw.write(str);
            bw.newLine();
        }
        bw.close();
        osw.close();
        fos.close();
        br.close();
        isr.close();
        fis.close();
    }
}
