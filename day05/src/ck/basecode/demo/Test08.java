package ck.basecode.demo;

import java.util.Arrays;

/**
 * 冒泡排序 把数组值从大到小排序
 * */
public class Test08 {

    public static void main(String[] args) {

        int[] arr1 = {4,98,34,23,70,11};

        for (int i = 0; i < arr1.length; i++) {

            for (int j = i; j < arr1.length ; j++) {

                if ( arr1[j] > arr1[i] ){

                    int tmp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = tmp;

                }

            }

        }

        System.out.println(Arrays.toString(arr1));

    }

}
