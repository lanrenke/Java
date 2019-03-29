package homework;
/**
 * 打印1-60的所有偶数，并且5个一行
*/
public class Test05 {

    public static void main(String[] args) {

        int count = 0;
        for (int i = 1; i <= 60; i++) {

            if(i%2==0){

                System.out.print(i+" ");
                count++;

            }
            if (count%5 == 0){
                System.out.println();
            }

        }

    }

}
