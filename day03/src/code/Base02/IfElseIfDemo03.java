package code.Base02;
/**
 目标：研究if语句格式3

 if语句做分支选择执行的。

     if语句格式3：
     if(条件表达式1){
        执行代码1;
     }else if(条件表达式2){
        执行代码2;
     }else if(条件表达式3){
        执行代码3;
     }else if(条件表达式4){
        执行代码4;
     }
     ...
     else if(条件表达式n-1){
         执行代码n-1;
     }else{
        执行代码n;
     }
     格式注意：if必须出现一个，else if可以出现0-N个，else可以出现0-1次

 if语句格式2的流程：
     先执行条件表达式1，如果返回true，就进入执行“执行代码1”，分支结束.
     如果为false ,继续执行条件表达式2，如果返回true，就进入执行“执行代码2”，分支结束.
     如果为false ,继续执行条件表达式3，如果返回true，就进入执行“执行代码3”，分支结束.
     ...
     如果条件表达式都是false最终只能执行else中的执行代码n.

 小结：
    至于用哪个格式，根据业务需求决定！！
 */
public class IfElseIfDemo03 {

    public static void main(String[] args) {

        System.out.println("程序开始了-----");
        int age = 211;
        if (0 < age && age <6) {
            System.out.println("您是婴儿");
        }else if(6 <= age && age < 10){
            System.out.println("您是儿童");
        }else if(10 <= age && age < 18){
            System.out.println("您是青少年");
        }else if(18 <= age && age < 30){
            System.out.println("您是青年人");
        }else if(30 <= age && age < 40){
            System.out.println("您是青壮年");
        }else if(40 <= age && age < 60){
            System.out.println("中年人");
        }else if(60 <= age && age < 80){
            System.out.println("中老年人");
        }else if(80 <= age && age < 100){
            System.out.println("老年人");
        }else if(100 <= age && age <200){
            System.out.println("长寿老人");
        }else {
            System.out.println("应该不是人");
        }

        System.out.println("程序结束了-----");

    }

}
