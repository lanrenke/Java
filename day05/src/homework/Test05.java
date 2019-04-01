package homework;
/**
 定义数组保存学生的考试成绩:[95, 92, 75, 56, 98, 71, 80, 58, 91, 91]。统计高于平均分的分数有多少个
 */
public class Test05 {

    public static void main(String[] args) {

        int[] arr = {95, 92, 75, 56, 98, 71, 80, 58, 91, 91};
        int count = 0;
        for (int num : arr
             ) {
            count += num;
        }
        int num1 = count/arr.length;
        int num2 = 0;
        for (int num: arr
             ) {
            if (num > num1){
                num2++;
            }
        }
        System.out.println("高于平均分"+num1+"的有"+num2+"个");

    }

}
