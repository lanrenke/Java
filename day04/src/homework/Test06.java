package homework;
//输出x符号 通过另外建立方法然后调用的方式
public class Test06 {

    public static void main(String[] args) {

        printX();

    }

    public static void printX(){

        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 10; j++) {

                if (i == j || i + j == 9){
                    System.out.print("0");
                }else {
                    System.out.print("*");
                }

            }
            System.out.println();

        }

    }

}
