package ck.basecode.day04.demo01;
/**
 * 需求：**随便给你两个整数，请帮我返回这两个整数的较大值。

 - **明确返回值类型**：功能需求说希望返回两个整数的较大值，那么必须需要返回结果，同时结果也必然是个整数，返回值类型定义为int类型。
 - **明确参数列表**：计算哪两个整数的最大值，并不清楚哪两个整数，但可以确定是整数，参数列表可以定义两个int类型的变量，由调用者调用方法时传递
 * */
public class Test06 {

    public static void main(String[] args) {

        int i1 = getMax(10,20);
        System.out.println("10与20之间的较大值为:"+i1);

    }

    public static int getMax(int a,int b){

        if (a>b){
            return a;
        }else {
            return b;
        }

    }

}
