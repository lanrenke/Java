package code.Base05;
/**
 目标：研究方法的定义和使用。

 方法的格式：
     public static 返回值类型 方法名称 ( 形参列表 ){
        方法体代码，就是一些可执行功能代码;
     }
    修饰符已经确定：public static
    方法名称：随便写。

 需求：求任意两个整数的和并输出。

 步骤：
     （1）定义一个方法来封装这个功能。因为方法很合适。
     （2）定义方法前的两个明确:
         a.方法是否需要传入参数
            需要的，求任意两个整数，需要传入到方法中去。
            （int a , int b）
         b.方法是否需要返回值。
            不需要，求和后直接输出结果。 void
 小结：
    有参数的方法，调用的时候必须传入对应类型的参数。否则报错！

 */
public class MethodDemo02 {

    public static void getSum(int a,int b){

        System.out.println(a + b);

    }

    public static void main(String[] args) {

        getSum(10,20);
        getSum(78,98);

    }

}
