package homework;
/**
 有一组双色球号码{1, 8, 10, 12, 18, 28, 12},定义printBall方法，打印双色球号码信息
 编写步骤：
 1. 在main方法中定义int[] arr保存一组双色球号码{1, 8, 10, 12, 18, 28, 12}
 2. 定义printBall方法,参数为int[] array,返回值为void
 3. 在printBall方法中输出:"您的双色球号码为:"
 4. 在printBall方法中遍历array数组,不换行打印每个元素
 5. 在main方法中调用printBall方法,参数为arr
 */
public class Test04 {

    public static void main(String[] args) {

        int[] arr = {1,8,10,12,18,28,12};
        printBall(arr);

    }

    public static void printBall(int[] arr){

        System.out.println("您的双色球号码为:");
        for (int num :arr
             ) {
            System.out.print(num+" ");
        }

    }

}
