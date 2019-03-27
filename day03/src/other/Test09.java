package other;

public class Test09 {

    public static void main(String[] args) {

        for (int i = 1; i < 7; i++) {

            for (int j = 6; j > 0; j--) {

                if(i==j){
                    System.out.print("*");
                }else {
                    System.out.print("-");
                }

            }

            System.out.println();

        }

    }

}
