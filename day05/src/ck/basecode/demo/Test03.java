package ck.basecode.demo;
//两个变量都指向了同一个数组，无论通过哪个变量操作数组，对方都会受到影响。
public class Test03 {

    public static void main(String[] args) {

        int[] arr1 = new int[3];
        arr1[0] = 100;
        arr1[1] = 200;
        arr1[2] = 300;

        // 定义数组变量arr2，将arr的地址赋值给arr2
        // arr和arr2指向堆中同一个数组
        int[] arr2 = arr1;

        arr2[0] = 101;

        for (int i = 0; i < arr1.length; i++) {

            System.out.println(arr1[i]);

        }

        System.out.println("------------------");

        for (int i = 0; i < arr2.length; i++) {

            System.out.println(arr2[i]);

        }

    }

}
