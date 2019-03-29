package code.Base07;
/**
 目标：计算 1-100偶数求和

 */
public class WhileExecDemo02 {

    public static void main(String[] args) {

        int count = 0;
        int i = 1;
        while (i <= 100){

            if (i%2==0){

                count += i;

            }
            i++;

        }
        System.out.println("1-100偶数累加值为: "+count);

    }

}
