package com.itcast.homework;

// 2.打印扑克牌
// 遍历输出一副扑克牌。
public class HomeWork_2 {
    public static void main(String[] args) {
        String[] hua = {"黑桃", "红桃", "梅花", "方片"};
        String[] dian = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

        String[] pu = new String[(hua.length * dian.length)+2];
        for (int i =0,k=0;i<hua.length;i++){ // k++在这的话，他只进行4次，其他的全是null
            for (int j =0;j<dian.length;j++,k++){ // k++在这他会跟着i循环一次他循环一轮
                pu[k] = hua[i]+dian[j];

            }
        }
        pu[pu.length-2] = "大王";
        pu[pu.length-1] = "小王";

        for (int i = 1; i <= pu.length; i++) {
            System.out.print(pu[i-1]+" ");
            if (i%13==0){
                System.out.println();
            }
        }
    }
}
