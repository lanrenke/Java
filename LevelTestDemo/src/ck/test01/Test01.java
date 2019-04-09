package ck.test01;

import java.util.Arrays;

/**
    定义一个整型数组，找到最大值，然后把最大值和数组排序第一位数值交换位置
 */
public class Test01 {

    public static void main(String[] args) {

        int[] arr = {4,6,2,8,3};
        System.out.println("交换前:"+Arrays.toString(arr));

        int max = arr[0];
        int max_index = 0;
        for (int i = 1; i < arr.length; i++) {

            if (max < arr[i]){
                max = arr[i];
                max_index = i;
            }

        }
        int temp = arr[max_index];
        arr[max_index] = arr[0];
        arr[0] = temp;

        System.out.println("交换后:"+Arrays.toString(arr));

    }

}
