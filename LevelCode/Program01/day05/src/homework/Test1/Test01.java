package homework.Test1;
/**
     1. 请说出异常的继承体系
            父类:Throwable 子类:Error Expection
     2. 请说出你对错误(Error)的理解
            错误出现是无放捕获的，只能修改代码
     3. 请说出你对编译异常(Expection的理解)
            编译异常：编译时出现的异常，可以捕获，必须处理
     4. 请说出你对运行时异常(RuntimeException)的理解
            运行时异常：运行时出现的异常 可以处理也可以不处理，不出来可能会报错
 */
public class Test01 {
    /*1.	异常继承体系为:
        a)	最顶层父类是Throwable
        b)	Error与Exception继承Throwable
        c)	RuntimeException继承Exception
    2.	Error是系统级别的严重的错误,错误无法处理,只能修改代码.
    3.	Exception是编译时异常,编译时必须对编译异常进行处理,否则编译失败,如:日期格式化异常
    4.	RuntimeException是运行时异常,编译时无需处理,但程序运行的时候可能会报错,如:算术异常*/

}
