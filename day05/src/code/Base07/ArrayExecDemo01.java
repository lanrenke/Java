package code.Base07;
/**
 目标： 求分数的平均值。

     解题思路：
     分数个数确定，类型确定了，说明要用数组存储操作。
     80 , 90.5 , 99, 100 , 97
 小结：批量数据，个数类型又确定，建议用数组做。

     （1）定义一个数组，存储分数。
     （2）遍历数组的每个元素。把元素累加求和
     （3）对数组的长度做除法。
 */
public class ArrayExecDemo01 {

    public static void main(String[] args) {

        double[] arr = {80 , 90.5 , 99, 100 , 97};
        double count = 0;
        for (double num : arr
             ) {
            count += num;
        }
        System.out.println("平均分为；"+(count/arr.length));

    }

}
