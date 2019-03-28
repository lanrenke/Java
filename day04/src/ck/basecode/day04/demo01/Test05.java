package ck.basecode.day04.demo01;
/**
 * 有参数和有返回值的方法
 * */
public class Test05 {

    public static void main(String[] args) {

        int i1 = sum(40,50);

        int i2 = sum(14,19);

        int i3 = sum(69,9);

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);

    }

    public static int sum(int a,int b){

        return a + b;

    }

}
