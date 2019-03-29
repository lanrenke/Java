package code.Base02;
/**
 目标：研究if语句格式2

 if语句做分支选择执行的。

 if语句格式2：
     if(条件表达式){
        执行代码1;
     }else{
         执行代码2;
     }
 if语句格式2的流程：先执行条件表达式，如果返回true，就进入执行“执行代码1”，否则进入执行“执行代码2”.
 */
public class IfElseDemo02 {

    public static void main(String[] args) {

        System.out.println("程序开始了-----");
        int age = 19;
        if (age >= 18){
            System.out.println("您是成年人");
        }else {
            System.out.println("您是未成年人");
        }
        System.out.println("程序结束了-----");

    }

}
