package code.Base02;
/**
 目标：死循环

     就是循环进入了无限执行的状态，会一直反复的执行循环体语句。不会结束！
     也就是循环中的条件永远为true，死循环是永不结束的循环。除非干预！！

     死循环以后是会经常用到。我们现阶段掌握写法即可！


     做一个死循环：
     格式1：
         while(true){
            // 循环体语句;
         }
     用的较多!可读性好！！

     格式2：
         for( ;  ; ){

         }
 */
public class DeadForDemo01 {

    public static void main(String[] args) {

        while (true){

            System.out.println("Hello World!");

        }
        //在死循环代码下面写代码体的没用的 永远不会执行到下面的代码。在IDEA中会报错。
        /*for ( ; ;){
            System.out.println("Hello World!");
        }*/

    }

}
