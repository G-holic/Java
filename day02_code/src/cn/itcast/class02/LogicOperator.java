package cn.itcast.class02;
/*
3、逻辑运算符
逻辑与：&
	true & true 结果是true
	true & false 结果是false
	false & true 结果是false
	false & false 结果是false

	只有两个边都是true，结果才为true。

逻辑或：|
	true | true 结果是true
	true | false 结果是true
	false | true 结果是true
	false | false 结果是false

	只要有一边是true，结果就为true。

逻辑非：!
	!true  变为false
	!false 变为true

逻辑异或：^
	true | true 结果是false
	true | false 结果是true
	false | true 结果是true
	false | false 结果是false

	只有两边不一样，一个是true，一个是false，结果才为true。

短路与：&&
	true && true 结果是true
	true && false 结果是false
	false && ? 结果是false
	false && ? 结果是false

	只有两个边都是true，结果才为true。
	但是它如果左边已经是false，右边不看。这样的好处就是可以提高效率。


短路或：||
	true || ？ 结果是true
	true || ？ 结果是true
	false || true 结果是true
	false || false 结果是false

	只要有一边是true，结果就为true。
	但是它如果左边已经是true，右边就不看了。这样的好处就是可以提高效率。

特殊：
（1）逻辑运算符的操作数必须是boolean值
（2）逻辑运算符的结果也是boolean值

*/
public class LogicOperator {
    public static void main(String[] args){
		/*
		表示条件，成绩必须在[0,100]之间
		成绩是int类型变量score
		*/
        int score = 56;

        //System.out.println(0<=score<=100);
		/*
		LogicOperator.java:23: 错误: 二元运算符 '<=' 的操作数类型错误
                System.out.println(0<=score<=100);
                                           ^
		  第一个类型:  boolean    0<=score的结果 true
		  第二个类型: int

		  true <= 100？不对的
		1 个错误*/

        System.out.println(0<=score  & score<=100);

    }
}
