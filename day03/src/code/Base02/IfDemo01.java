package code.Base02;
/**
 目标：流程控制语句-if语句格式1.

 什么是流程控制语句?
     软件是模拟现实世界的业务，然后通过软件来为人类服务的。
     人类的业务活动有哪些?
         顺序活动：每天依次做一些事情。
         选择活动：满足我的要求我才做某个事情。
         重复活动: 经常反复做一件事情。
     软件也提供了三种代码的执行结构来模拟人类的活动:
         顺序结构: 从上到下运行。
         分支结构：有选择的去执行某个代码，if语句，switch语句。
         循环结构：重复的去做一件事件，直到不满足条件才终止。 for循环，while循环，do-while循环。

 先研究if语句格式1:
     if语句的作用：判断某个条件满足，然后有选择的去执行代码。
     if语句的格式：
         if(条件表达式){
             执行代码;
         }
     if语句的流程：先执行条件表达式，如果返回true，就进入执行“执行代码”，否则直接跳过！
     小结：
        只有一个分支。记住格式！
 */
public class IfDemo01 {

    public static void main(String[] args) {

        System.out.println("程序开始了-----");
        int age = 20;
        if (age >= 18){

            System.out.println("您是成年人");

        }
        System.out.println("程序结束了-----");

    }

}
