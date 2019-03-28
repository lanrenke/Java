package ck.basecode.demo;
/** 数组获取最大值元素
    最大值获取：**从数组的所有元素中找出最大值。
 */
public class Test07 {

    public static void main(String[] args) {

        int[] arr1 = {4,98,34,23,70,11};
        int num_max = arr1[0];
        for (int i = 0; i < arr1.length; i++) {

            if(arr1[i] > num_max) {

                num_max = arr1[i];

            }

        }
        System.out.println(num_max);

    }
}
