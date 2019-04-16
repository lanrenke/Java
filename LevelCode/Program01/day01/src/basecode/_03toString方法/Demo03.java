package basecode._03toString方法;
/**
 目标：掌握Object类toString方法的作用

 讲解：
     1. String toString() 方法的作用
         官方文档说法:返回该对象的字符串表示。
         实际情况说法：
         com.itheima._03toString方法.Student@75828a0f
         默认格式：类全名字符串@对象在内存中的地址值
         类全名就是：包名...类名

 小结：
     1.toString方法的作用？
        * 返回该对象的字符串表示：类全名字符串@对象在内存中的地址值

     2.重写toString方法的目的？
         * 在打印对象时不希望看到对象在内存中的地址值，而是希望看到对象的内容：成员变量的值
         * 所以在子类中一般都会重写该方法，返回成员变量的值
 */
public class Demo03 {

    public static void main(String[] args) {

        Student stu = new Student("小苍",20);
        System.out.println(stu.toString());// 由于重写了toString 方法 所以输出的是对象的内容而不是默认的类全名加内存地址
        System.out.println(stu);//这里的输出内容是和上面代码一致的。可以知道，toString 方法在输出一个对象的时候是默认调用的。

    }

}
