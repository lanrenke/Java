package basecode._14教学目标小结;

/**
 - 能够辨别程序中异常和错误的区别
    如何区分异常和错误：根据类判断，以Exception结尾时异常，否则是错误：Error
    Error：无法针对错误进行处理，只能修改错误行代码
    Exception：有具体的处理方式，处理之后代码可以继续运行，如果不处理，程序会终止运行。

 - 说出异常的分类
    编译时异常
    运行时异常

 - 说出虚拟机处理异常的方式
    将异常信息输出到控制台并结束程序运行。

 - 列举出常见的三个运行期异常
    NullPointerException 空指针异常
    ArrayIndexOutOfBoundsException：数组越界异常
    StringIndexOutOfBoundsException：字符串越界异常
    ArithmeticException

 - 能够使用try...catch关键字处理异常
    try{
        // 可能出现异常的代码
    } catch(异常类名 变量名){
        // 处理异常的代码
    } finally{
        // 一般用释放资源
    }

 - 能够使用throws关键字处理异常
    throws：声明异常，将异常标识在方法声明上，告诉调用者要注意处理异常。
    throw：抛出异常，将异常对象抛给方法调用者并结束当前方法运行。

 - 能够自定义异常类
    1. 创建一个类继承Exception或RuntimeException
    2. 提供无参数和有参数构造方法，在有参数构造方法执行该代码：super(message);

 - 能够处理自定义异常类
    1. try...catch...
    2. throws和throw

 - 说出进程的概念
    正在运行中的程序

 - 说出线程的概念
    进程中独立的执行路径

 - 能够理解并发与并行的区别
    并发：同一个时间段发生
    并行：同一时间点发生

 - 能够开启新线程
    1. 创建类继承Thread类
    class XxxThread extends Thread{
        2. 重写run方法：将线程任务代码编写在该方法中
        public void run(){

        }
    }
    3. 创建子类对象并调用start方法
        new XxxThread().start();

 -------- 今天内容简述 ------
 1. 异常
    1.1 异常的相关概念
    1.2 异常的处理方式

 2. 线程(入门)
    1.1 线程的相关概念
    1.2 如何创建线程

 -------- 划重点 -----------
 1. 能够使用try...catch...捕获异常
 2. 能够使用throw和throws关键字声明和抛出异常
 3. 线程的概念
 4. 能够创建线程执行代码
 */
public class Demo14 {

}
