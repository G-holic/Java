package cn.itcast.exception_异常;

/*
第一种处理方式，也是最彻底的方式，最根本的方式：try...catch
1、语法格式
try{
    可能发生异常的代码
}catch(异常的类型 异常对象名称){//异常对象名称都是用e表示
    处理这个异常的代码。
    处理方式：（1）输出打印异常的信息（2）进行相应的逻辑处理
}catch(异常的类型 异常对象名称){

}

2、注意
（1）多个catch，异常的类型如果是有父子类关系的话，一定是子类在上，父类在下
（2）catch()中一定是异常的类型，不能是其他的类型
只有是Throwable及其子类类型才能作为catch()的参数类型
（3）多个catch如果处理方式都一样，那么在JDK1.7之后，允许这么写
    catch(ArrayIndexOutOfBoundsException | NullPointerException e){
            e.printStackTrace();
        }

3、执行的特点
（1）如果try的{}中没有发生异常，那么一个catch都不会去匹配，相当于catch没有用上，直接执行try..catch结构下面的代码即可。
（2）如果try的{}中发生了异常，try{}中剩下的代码就不执行了，在发生异常的位置会产生一个异常对象，并抛出
    A：catch分支会从上往下依次去检查，依次去尝试捕获这个异常对象，如果可以捕获到，那么就继续执行try..catch结构下面的代码
    B：所有catch分支都无法匹配，如果不是main方法，就会把异常接着往上抛，如果是main，程序就挂了。

 */
public class TestTryCatch {
    public static void main(String[] args) {
        try {
            int a = 1;
            int b = 0;
            int result = a / b;//发生异常，try.中剩下的代码就不执行了   ArithmeticException
            System.out.println("result = " + result);
            System.out.println("a = " + a);
            System.out.println("b = " + b);

        }
        /*catch (ArrayIndexOutOfBoundsException e) { // 子类在上

        } catch (NullPointerException e) {
            e.printStackTrace();
        }*/ catch (RuntimeException e) { // 父类在下
            e.printStackTrace(); // java.lang.ArithmeticException: / by zero
        }

        System.out.println("下面的代码");
    }
}
