package homework;

import java.util.Arrays;

/**
 定义equals方法，比较2个数组内容是否完全一致。
 开发提示：
 长度一致，内容一致，就认为是完全一致的数组。
 */
public class Test07 {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,3,2,1};
        int[] arr2 = {1,2,3,4,3,2,1};
        equals(arr1,arr2);

    }

    public static void equals(int[] a, int[] b){

        boolean check1 = true;
        boolean check2 = true;

        if (a.length != b.length){
            check1 = false;
        }

        for (int i = 0; i < a.length; i++) {

            if (a[i] != b[i]) {//这里会存在如果长度不一致而导致的数组越界问题，解决方法是使用reture来返回布尔值来终止程序运行。
                check2 = false;
            }

        }

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println("是否一致"+(check1 == check2));

    }

}
