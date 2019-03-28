package ck.basecode.day04.demo01;
/**
 * 有参数无返回值方法
 * */
public class Test04 {

    public static void main(String[] args) {

        //调用方法同时需要传值
        sum(10,30);

        sum(30,60);

    }

    public static void sum(int a,int b){

        int c = a + b;
        System.out.println(c);

    }

}
