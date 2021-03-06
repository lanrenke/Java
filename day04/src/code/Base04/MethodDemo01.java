package code.Base04;
/**
 目标：研究方法的概述(方法至关重要)。

 什么是方法?
     方法是一个独立的可执行单元。
     方法是将功能代码进行封装，然后就可以被反复的调用方法去执行这些功能代码。
     main方法就是一个方法。

 方法的目的：
    提高代码的复用。相同代码只需要写一次就可以被多次调用来使用。

 现实世界的例子:
     我们要洗衣服，放衣服，拿盆子，加水，加洗衣粉，搓洗，漂洗，脱水。
     我们可以把洗衣机理解成一个方法，它已经封装好了洗衣服的功能。
     别人就可以直接调用，无需自己实现。

 方法的定义格式：如何去做一个方法。
     修饰符 返回值类型 方法名称 ( 形参列表 ){
         方法体代码，就是一些可执行功能代码;
     }

 格式详解：
     修饰符：public|缺省|private|protected,static , abstract|final
        现在修饰符都用public static,其他无需理解。
     返回值类型：
         方法返回的结果类型，是Java的数据类型。
         方法的返回值类型分为三种：
             基本数据类型。
             引用数据类型。
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

 方法的注意事项：
     （1）定义位置，在类中方法外面。方法不能嵌套，方法与方法是兄弟关系，并列的。
     （2）调用方法的时候不要写错方法名称。
     （3）调用方法时写错了参数列表。什么类型传入什么参数，有多少个必须传多少个。
     （4）有返回值类型，那么必须要和`return`语句返回的类型相同，否则编译失败 。
          如果返回值类型是void,就不能申明return语句。
     （5）不能在`return` 后面写代码，`return` 意味着方法结束，
          所有后面的代码永远不会执行，属于无效代码。

 */
public class MethodDemo01 {

    public static void main(String[] args) {

    }

}
