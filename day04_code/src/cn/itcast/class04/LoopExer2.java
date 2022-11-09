package cn.itcast.class04;

/*水仙花数
 * 2、所谓水仙花数是指一个3位数，其各个位上数字立方和等于其本身。
 * 例如： 153 = 1*1*1 + 5*5*5 + 3*3*3，找出所有的水仙花数，并统计他们有几个。
 *
 * 原则：
每一次循环都要做的事情，或者需要反复多次执行的代码，就要放到循环体中。
 * */
public class LoopExer2 {
    public static void main(String[] args) {
        System.out.print("水仙花数一共有");
        int count = 0;//统计个数
        //水仙花数是指一个3位数，3位数的范围：[100,999]
        for (int i = 100; i < 1000; i++) {
            int a = i % 10;
            int b = i / 10 % 10;
            int c = i / 100;
            if (a * a * a + b * b * b + c * c * c == i) {
                System.out.print(i + " ");
                count ++;
            }
        }
        System.out.println("一共有"+count+"个");
    }
}
