package homework;
/**
 选择题答案评分
 5道单项选择题，标准答案为 ：【ADBCD】
 四名同学答案分别为：
 小传：【DCBAD】
 小智：【ADBCD】
 小播：【ADBCA】
 小客：【ABCDD】
 给这4名同学评分,答对一道题给2分
 */
public class Test08 {

    public static void main(String[] args) {

        char[] check = {'A','D','B','C','D'};

        char[] arr1 = {'D','C','B','A','D'};
        char[] arr2 = {'A','D','B','C','D'};
        char[] arr3 = {'A','D','B','C','A'};
        char[] arr4 = {'A','B','C','D','D'};

        int point1 = 0;
        int point2 = 0;
        int point3 = 0;
        int point4 = 0;

        for (int i = 0; i < check.length; i++) {

            if (check[i] == arr1[i]){
                point1 += 2;
            }
            if (check[i] == arr2[i]){
                point2 += 2;
            }
            if (check[i] == arr3[i]){
                point3 += 2;
            }
            if (check[i] == arr4[i]){
                point4 += 2;
            }

        }

        System.out.println("满分10分,小传:得"+point1+"分");
        System.out.println("满分10分,小智:得"+point2+"分");
        System.out.println("满分10分,小播:得"+point3+"分");
        System.out.println("满分10分,小客:得"+point4+"分");

    }

}
