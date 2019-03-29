package homework;
/**
 * 使用for循环获取100-999中的水仙花数
 * */
public class Test04 {

    public static void main(String[] args) {

        for (int i = 100; i < 999; i++) {

            int a = i%10;
            int b = (i/10)%10;
            int c = i/100;

            int sum = a*a*a + b*b*b + c*c*c;
            if (sum == i){
                System.out.println(i);
            }

        }

    }

}
