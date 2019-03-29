package code.Base08;
/**
 输出正三角形(直角三角形)
 */
public class ForForDemo04 {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {

            for (int j = i; j < 5; j++) { //这个循环负责输出空格 制作一个三角形的形状 让下一个循环补充内容

                System.out.print(" ");

            }

            for (int k = 0; k < 2*i+1; k++) { //这个循环负责在上一个循环结束后补充对应的内容

                System.out.print("*");

            }
            System.out.println();

        }

    }

}
