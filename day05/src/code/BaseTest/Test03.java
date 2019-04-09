package code.BaseTest;
/**
 求 1-500 之内能同时被 3 和 5 整除的所有数及个数并 5 个一行打印
 */
public class Test03 {

    public static void main(String[] args) {

        int count = 0;
        for (int i = 1; i <= 500; i++) {

            if(i%3 == 0 && i%5 == 0){

                System.out.print(i+" ");
                count++;

            }
            if(i%3 == 0 && i%5 == 0 && count%5 == 0){
                System.out.println();
            }

        }
        System.out.println("符合要求个数为:"+count+"个");

    }

}
