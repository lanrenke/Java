package code.Base05;
/**
 目标：研究方法的定义和使用。

 方法的格式：
     public static 返回值类型 方法名称 ( 形参列表 ){
        方法体代码，就是一些可执行功能代码;
     }
     修饰符已经确定：public static
     方法名称：随便写。

 需求：求任意两个整数的和，并能够返回结果继续使用。

     步骤：
     （1）定义一个方法来封装这个功能。
     （2）定义方法前的两个明确：
         a.方法是否需要参数。
             需要，传入任意两个整数。 (int a , int b)
         b.方法是否需要返回值：
             需要，因为要返回结果继续使用。int

 小结：
    有返回值的方法，必须在方法中使用return语句返回对应类型的数据值，否则代码报错！

 最终总结：
    开发中是否定义方法，方法是否需要参数类型，是否需要返回值类型申明是由业务需求和程序员你自己决定的
    只要能解决需求，认为合适，你喜欢就好!! 我们当然也需要尽量选择最合适的方法来定义。
 */
public class MethodDemo03 {

    public static void main(String[] args) {

        System.out.println(getSum(10,20));

        int c = getSum(67,98);
        System.out.println(c);

    }

    public static int getSum(int a,int b){

        return a + b;

    }

}
