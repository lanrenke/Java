package homework;
/**
 打印一副扑克牌
 开发提示：
 使用两个字符串数组，分别保存花色和点数
 */
public class Test09 {

    public static void main(String[] args) {

        String[] arr1 = {"黑桃","红桃","梅花","方片"};
        String[] arr2 = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        printDemo(arr1,arr2);

    }

    public static void printDemo(String[] a,String b[]){

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < b.length; j++) {

                System.out.print(a[i]+b[j]+' ');

            }
            System.out.println();

        }

    }

}
