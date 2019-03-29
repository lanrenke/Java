package code.Base06;
/**
 目标：计算 1-5求和。

 解题思路：
 （1）先定义循环，循环5次，依次输出1-5.
 （2）必须在循环外边定义一个求和的变量，来累加数据和。
 （3）累加i到sum中去。
 （4）开始在循环外输出sum就是和。
 */
public class ForExecDemo03 {

    public static void main(String[] args) {

        int sum = 0;
        for (int i = 1; i <= 5; i++) {

            sum += i;

        }

        System.out.println("1-5累加的和为；"+sum);

    }

}
