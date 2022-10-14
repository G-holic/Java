package cn.itcast.class01;

/*
特殊的变量，特殊的常量：
	通常称为最终变量或常量

如果某个变量的值，不允许修改，那么可以把变量声明为final。
*/
public class FinalVariable {
    public static void main(String[] args) {
        /*
		考试满分是100分
		小王考了满分
		小李考了比满分低1分
		小郑考了一半分

		满分错了，要纠正为150，如果下面这么写，需要修改4个地方
		*/
		/*
		int max = 100;
		int wang = 100;
		int li = 100-1;
		int zheng = 100/2;

		System.out.println("满分：" + max);
		System.out.println("小王：" + wang);
		System.out.println("小李：" + li);
		System.out.println("小郑：" + zheng);*/

        final int MAX = 150;
//		MAX = 100; // 报错
        int wang = MAX;
        int li = MAX - 1;
        int zheng = MAX / 2;

        System.out.println("满分：" + MAX);
        System.out.println("小王：" + wang);
        System.out.println("小李：" + li);
        System.out.println("小郑：" + zheng);
    }
}
