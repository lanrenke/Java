package ck.basecode.demo;
/**动态初始化数组只是给定了数组的长度，并没有给定具体的元素值。但是动态初始化的数组依然是存在默认值的

        按照规范满足：

        - 所有的数值类型的默认是0或者0.0，整形是0 ，浮点型是0.0
        - 布尔类型的默认值是false
        - char类型的默认值的编号是0
        - 引用类型的默认值是null*/
public class Test02 {

    public static void main(String[] args) {

        int[] arr1 = new int[5];
        double[] arr2 = new double[5];
        boolean[] arr3 = new boolean[2];
        char[] arr4 = new char[5];

        System.out.println(arr1.length);
        System.out.println(arr1[0]);

        System.out.println(arr2.length);
        System.out.println(arr2[0]);

        System.out.println(arr3.length);
        System.out.println(arr3[0]);

        System.out.println(arr4.length);
        System.out.println(arr4[0]);

    }

}
