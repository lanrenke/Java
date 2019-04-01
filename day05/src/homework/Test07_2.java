package homework;

import java.util.Arrays;

/**
 定义equals方法，比较2个数组内容是否完全一致。
 开发提示：
 长度一致，内容一致，就认为是完全一致的数组。
 教学答案版本
 */
public class Test07_2 {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,3,2,1};
        int[] arr2 = {1,2,3,4,3,2,1};
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println("是否一致："+equals(arr1,arr2));

    }

    // 3.定义equals方法,参数列表为:(int[] arr1, int[] arr2), 返回值类型为:boolean,equals方法的功能是比较arr1数组和arr2数组内容是否一致.
    public static boolean equals(int[] a,int[] b){

        // 4.在equals方法中判断arr1和arr2的长度是否相等,如果不相等返回false
        if(a.length != b.length){
            return false;//一旦这里返回函数就结束了
        }

        // 4.在equals方法中遍历arr1数组,判断arr1和arr2的每个元素是否相等.如果不相等返回false
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]){ //这里不会存在数组边界问题，因为如果长度不相等已经在上面返回false然后退出程序了。
                return false;
            }
        }

        return true;
    }

}
