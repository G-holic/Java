package cn.itcast.class02;
/*
String类型与基本数据类型的转换问题？
任何数据类型与String进行+（拼接），结果都是String
其他数据类型进行“+”，是求和

*/
public class StringTypeChange {
    public static void main(String[] args) {
        char c1 = 'a'; // 97
        char c2 = 'b'; // 98
        System.out.println(c1 + c2);//195
        //"c1 + c2 = "这个是String的常量
        //"c1 + c2 = "后面的 +就变成了拼接
        System.out.println("c1 + c2 = " + c1 + c2);
        System.out.println(c1 + c2 +"");//先求和后拼接
        System.out.println(c1 + "" +  c2 );//拼接
    }
}
