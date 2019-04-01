package homework;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 定义数组int[] nums = {5,10,15},创建一个新数组,新数组元素的值是nums数组元素的2倍
 */
public class Tesr03 {

    public static void main(String[] args) {

        int[] nums = {5,10,15};
        int[] arr_num = new int[3];

        for (int i = 0; i < nums.length; i++) {

            arr_num[i] = nums[i]*2;

        }

        System.out.println("nums数组：");
        System.out.println(Arrays.toString(nums));

        System.out.println("newArr新数组：");
        System.out.println(Arrays.toString(arr_num));

    }

}
