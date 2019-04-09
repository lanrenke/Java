package BaseCode._04成员方法的定义详解;
/**
    目标：成员方法的定义详解。

    成员方法属于类的成分之一
    成员方法是描述类或者对象的行为的。

    成员方法的定义格式:
         修饰符 返回值类型 方法名称 ( 形参列表 ){
            方法是体代码，就一些可执行功能代码;
         }

    格式详解：
         修饰符：public|缺省|private|protected, static , abstract|final
                现在修饰符都用public static,其他无需理解。
         返回值类型：
                 方法返回的结果类型，是Java的数据类型。
                 方法的返回值类型分为三种：
                     基本数据类型。传数据
                    引用数据类型 。传地址
                     无返回值类型：void（这是方法独有的类型，其他任何地方都不能使用）。
         方法名称: 首字母应该小写，满足“驼峰模式”，一般是动词，必须合法的标识符不能是关键字。

         形参列表: 方法接收的数据类型，格式是：
            (数据类型 形参变量1 ,  数据类型 形参变量2 , 数据类型 形参变量2 , ....)
             形参是用“,”隔开，可以有无数个，也可以没有！

         方法体代码：
             是一些功能代码，可以执行的代码。
             注意：如果方法有申明返回值类型，方法体代码中必须要用return语句返回
             对应数据类型的数据，否则报错！
             如果方法没有返回值类型申明的是void，方法中就一定不能用return语句返回数据。

 */
public class Animal {
    //  需求：定义跑步，吃饭的行为
    public void run(){

    }

    public static void eat(){

    }
}
