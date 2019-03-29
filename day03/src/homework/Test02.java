package homework;
/**
 * 1-100既是3的倍数又是5的倍数
 * 它们之和
 * */
public class Test02 {

    public static void main(String[] args) {

        int count = 0;
        for (int i = 1; i <= 100; i++) {

            if( i%3==0 && i%5 == 0) {

                System.out.println(i);
                count += i;

            }

        }
        System.out.println("1-100之间既是3的倍数又是5的倍数的数字之和为: "+count);

    }

}
