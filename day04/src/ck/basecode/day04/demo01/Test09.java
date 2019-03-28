package ck.basecode.day04.demo01;
/**计算1+2+3...+100的和**,**并返回求和的结果**。

        - **明确返回值**：1~100的求和，计算后必然还是整数，返回值类型是int
        - **明确参数**：需求中已知到计算的数据，没有未知的数据，不定义参数*/
public class Test09 {

    public static void main(String[] args) {

        int sum = getSum();
        System.out.println("1到100的和为: "+sum);

    }

    public static int getSum(){

        int count = 0;
        for (int i = 1; i <= 100; i++) {

            count += i;

        }
        return count;

    }

}
