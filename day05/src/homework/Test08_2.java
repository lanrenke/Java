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
 版本二 定义方法 减少参数定义 减少重复代码
 */
public class Test08_2 {

    public static void main(String[] args) {

        char[] arr1 = {'D','C','B','A','D'};
        char[] arr2 = {'A','D','B','C','D'};
        char[] arr3 = {'A','D','B','C','A'};
        char[] arr4 = {'A','B','C','D','D'};

        check("小传",arr1);
        check("小智",arr2);
        check("小播",arr3);
        check("小客",arr4);

    }

    public static void check(String a, char[] b){

        char[] check = {'A','D','B','C','D'};
        int count = 0;

        for (int i = 0; i < b.length; i++) {

            if (b[i] == check[i]){
                count +=2;
            }

        }
        System.out.println("满分10分,"+a+":得"+count+"分");

    }

}
