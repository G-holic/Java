package cn.itcast.class01;
/*
代码的风格，格式：
（1）缩进问题
类{
	方法{
		语句1;
		语句2;
		语句3{
			语句4;
		}
	}
}
（2）两种风格
类{
	方法{
		语句1;
		语句2;
		语句3{
			语句4;
		}
	}
}

类
{
	方法
	{
		语句1;
		语句2;
		语句3
		{
			语句4;
		}
	}
}

*/
public class Problem4 {
    public static void main(String[] args) {
        System.out.println("格式问题");
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
