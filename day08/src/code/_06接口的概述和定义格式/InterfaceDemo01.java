package code._06接口的概述和定义格式;
/**
 目标：接口的概述和定义格式。

 什么是接口？
     接口是更加彻底的抽象
        接口中全部是抽象方法和常量。JDK 1.8之前的接口。无其他成分！
     接口有什么用?
        接口可以约束子类一定要完成这些抽象方法对应的功能。
     接口体现的是规范。
        定义接口格式:
             修饰符 interface 接口名称{

             }
 注意：接口关键字用interface.
 接口中成分的特点：
     JDK 1.8之前。
     全部是抽象方法：抽象方法public abstract可以省略不写,建议大家省略不写。
     全部是常量：public static final修饰的就是常量， 常量只有一份，必须给初始化值，值不可改变。

     常量的名字建议全部大写，多个单词用_连接。

 */
public class InterfaceDemo01 {
}

interface SportMan{

    // 常量”默认会加上public static final修饰
    //public static final String SCHOOL_NAME = "黑马";
    String SCHOOL_NAME = "黑马";

    void run();

    void eat();

}