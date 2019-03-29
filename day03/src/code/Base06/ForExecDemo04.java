package code.Base06;
/**
 目标：计算 1-100奇数求和。基本做法

     解题思路：
     （1）先定义循环，循环100次，依次输出1-100.
     （2）必须在循环外边定义一个求和的变量，来累加奇数数据和。
     （3）过滤出1-100之间的奇书累加给求和变量。
     （4）开始在循环外输出sum就是和。


 */
public class ForExecDemo04 {

    public static void main(String[] args) {

        int count = 0;
        for (int i = 1; i <= 100; i++) {

            if (i%2==1){

                System.out.println(i);
                count += i;

            }

        }

        System.out.println("1-100奇数的累计值为: "+count);

    }

}
