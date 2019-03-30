package code.Base05;
/**
 目标：研究方法的定义和使用。

 方法的格式：
     public static 返回值类型 方法名称 ( 形参列表 ){
        方法体代码，就是一些可执行功能代码;
     }
     修饰符已经确定：public static
     方法名称：随便写。

 需求:
    现在这个公司，有很多程序员都需要计算87和13的和输出这个功能。
 步骤：
     （1）把87和13求和的功能封装成一个方法，谁要用，谁就调用。
     （2）定义方法前的两个明确
         a.方法是否需要传入参数。
             不需要，就是求87和13的和，值已经确定了，我认为不需要传入参数
         b.方法是否需要返回值
             不需要，求和后直接输出结果。无需返回结果。
             返回值是void

 小结：
 方法必须调用才可以执行。
 方法如果没有参数也没有返回值称为：无参数无返回值的方法。

 */
public class MethodDemo01 {

    public static void main(String[] args) {

       sum();
       sum();
       sum();

    }

    public static void sum(){

        int a = 87;
        int b = 13;
        System.out.println(a+b);

    }

}
