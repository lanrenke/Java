package basecode._01异常概述;

/**
    目标：能够判断程序出现的问题是异常还是错误

    讲解：
        1. 异常和错误的区别
            异常：JVM产生反馈Java程序，可以针对异常进行处理，处理之后后续的代码可以继续运行，如果没有处理，程序也停止运行。
            错误：操作系统反馈JVM，无法针对错误进行具体的处理，只能修改错误行的代码，否则程序无法继续运行。
    小结：
        1. 如何判断程序出现的问题是错误还是异常？
            根据类名判断：如果是Exception结尾则是异常，否则都是错误。


    java.lang.OutOfMemoryError: 堆内存溢出
    java.lang.ArithmeticException: 数学运算异常：除数不能为零
 */
public class Demo012 {
    public static void main(String[] args){
        // 错误
        int[] arr = new int[1024 * 1024]; // 4G
        System.out.println(arr.length);

        // 异常
        System.out.println(100/0);

        System.out.println("come here");
    }
}
