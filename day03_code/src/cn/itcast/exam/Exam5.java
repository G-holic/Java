package cn.itcast.exam;

//5、补充代码实现将一个小写字母转换为大写字母输出
public class Exam5 {
    public static void main(String[] args) {
        char letter = 'g';
        System.out.println(letter);

        /*
		小写字母与大写字母之间有什么规律？
		'a'：97
		'A'：65
		相差32

		'b'：98
		'B'：66
		相差32
		*/
        System.out.println("对应的大写字母是：" + (char) (letter - 32));
    }
}
