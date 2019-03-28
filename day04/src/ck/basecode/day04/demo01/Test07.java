package ck.basecode.day04.demo01;
/**
 * 方法的3种调用方式
 */
public class Test07 {

    public static void main(String[] args) {

        //直接调用，意义不大，返回值被丢弃。
        sum(1,3);

        //赋值调用方法,可以接收返回值。
        int i1 = sum(4,6);
        System.out.println(i1);

        //输出语句调用
        System.out.println(sum(6,9));

    }

    public static int sum(int a,int b){

        System.out.println("方法被调用！");
        return  a + b;

    }

}
