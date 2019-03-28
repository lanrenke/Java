package ck.basecode.day04.demo01;
/***实现不定次数打印HelloWorld**

 - **明确返回值**：方法中打印出`HelloWorld`即可，没有计算结果，返回值类型`void`。
 - **明确参数**：打印几次不清楚，参数定义一个整型参数*/
public class Test08 {

    public static void main(String[] args) {

        printHelloWorld(9);

    }

    public static void printHelloWorld(int a){

        for (int i = 0; i < a; i++) {

            System.out.println("HelloWorld "+(i+1));

        }

    }

}
