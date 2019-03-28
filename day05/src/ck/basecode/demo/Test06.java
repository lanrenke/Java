package ck.basecode.demo;
/** 求分数的平均值

    业务需求：假设传智播客有几个学生的分数是 80,90,99,100.2，请算出他们的平均分数。
*/
public class Test06 {

    public static void main(String[] args) {

        double[] arr1 = {80,90,99,100.2};
        double count = 0;
        for (double num : arr1
             ) {

            count += num;

        }

        double sum = count/arr1.length;

        System.out.println("平均分为:"+sum);
    }

}
