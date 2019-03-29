package homework;
/**
 * 嵌套循环的使用
 * */
public class Test07 {

    public static void main(String[] args) {

        for (int i = 0; i < 7; i++) {

            for (int j = 0; j < 7; j++) {

                if(i==j || i+j == 6){

                    System.out.print("O");

                } else {

                    System.out.print("*");

                }

            }
            System.out.println();

        }

    }

}
