package code.Base03;
/**
 目标：switch分支语句的使用。

 分支结构有2种：if (学完了)  ， switch(很经典，很重要)。

 switch的功能：也是有选择的去执行代码。

     switch的格式:
         switch(表达式的值){
             case 值1:
                 执行代码1;
                 break;
             case 值2:
                 执行代码2;
                 break;
             case 值3:
                 执行代码3;
                 break;
             ...
             case 值n-1:
                 执行代码n-1;
                 break;
             default:
                 执行代码n;
                 // break;
             }
 格式的注意：case块可以出现 0 - N次，default可以出现0-1次。
 switch的执行流程:
     先执行表达式的值，拿着这个值去与case块的值进行比对。
     匹配谁就执行谁，遇到break就跳出switch分支。
     如果case后的值都不匹配就执行default代码。

 使用场景：虽然switch远远没有if强大。但是switch做单值匹配分支的时候更合适，代码优雅，性能好！！

 注意事项：
     switch表达式是一个具体的结果值，switch语句中，表达式的数据类型可以是byte，short，int，char，enum（枚举），
     JDK7之后支持字符串类型。
     表达式的类型不支持浮点型：float double. 也不支持long

 */
public class SwitchDemo01 {

    public static void main(String[] args) {

        int weekday = 7;
        switch (weekday){

            case 0:
                System.out.println("周日");
                break;
            case 1:
                System.out.println("周一");
                break;
            case 2:
                System.out.println("周二");
                break;
            case 3:
                System.out.println("周三");
                break;
            case 4:
                System.out.println("周四");
                break;
            case 5:
                System.out.println("周五");
                break;
            case 6:
                System.out.println("周六");
                break;
            default:
                System.out.println("错误日期数");

        }

    }

}
