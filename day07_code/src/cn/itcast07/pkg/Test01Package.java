
/*
1、包的作用
（1）避免类的重名
（2）组织管理不同层（不同模块）的类
bean、service、dao、test等
（3）可以限定部分类或成员的可见性范围

2、如何声明包
package 包名;

要求：
（1）一个.java文件只能有一句package语句，而且必须在代码首行
（2）如果某个.java文件声明了package语句，那么这个.java文件必须在对应的目录结构中。
包==>文件夹/目录

3、包名的命名规则和规范
（1）命名规则和其他的标识符一样
（2）命名规范
所有单词都小写，每一个单词之间使用.分割，每一个.代表一级目录。
例如：cn.itcast07.pkg   ==>  cn/itcast07/pkg
（3）命名习惯
公司域名倒置 + 具体的功能模块名
例如：cn.itcast07.xxx

4、类如何跨包使用

只要两个.java文件的 package语句不完全相同，就认为是不同的包。
package cn.itcast07.pkg;
package cn.itcast07.other;
它们是不同的包

（1）方式一：使用类的全名称：包.类名
（2）方式二：使用import语句导包
import 包.类名;
import 包.*;  //这里*代表的是省略的类名，不能省略子包名

 */

package cn.itcast07.pkg;

//import cn.itcast06.class06.*;
import cn.itcast07.other.Father;
import cn.itcast07.other.Son;
import cn.itcast07.other.Teacher;

public class Test01Package {

    Teacher t = new Teacher();
    Father f = new Father();
    Son s = new Son();

    cn.itcast07.bean.Teacher t2 = new cn.itcast07.bean.Teacher();
}
