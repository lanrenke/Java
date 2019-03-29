package homework;
/**
 * 累计1-100内奇数的和
 * */
public class Test01 {

    public static void main(String[] args) {

        int count = 0;
        for (int i = 0; i < 100; i++) {

            if (i%2 == 1){

                count += i;

            }

        }

        System.out.println("1-100的奇数累加和为: "+count);

    }

}
