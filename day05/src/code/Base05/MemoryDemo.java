package code.Base05;
/**
 目标：JVM虚拟机内存划分和运行机制。

 操作系统的基本原理：程序是只能在内存中运行。
 Java程序最终运行在内存中的JVM虚拟机内存中。

 JVM虚拟机为了提高Java程序运行和管理的效率
 JVM把内存划分成5块区域分别来做不同用途：
 寄存器 给CPU使用，和我们开发无关。
     本地方法栈 JVM在使用操作系统功能的时候使用，和我们开发无关。
     ------------------------------------------------------
     方法区 存储可以运行的class文件。编译以后的class文件放在这里的。
     堆内存 存储对象或者数组，new出来创建的对象，都存储在堆内存。
     方法栈 方法运行时使用的内存，比如main方法运行，进入方法栈中执行。
 */
public class MemoryDemo {
}
