package ck.basecode.demo;

public class Test01 {

    public static void main(String[] args) {

        // 定义数组
        // 数组会为每个元素编号,从0开始编号.这个编号成为索引(下标,角标),通过索引可以访问对应的元素
        // 访问数组元素的格式: 数组名[索引]
        //int[] arr = new int[]{11,22,33}; 静态写法1
        int[] arr = {11,22,33}; //静态写法2

        System.out.println(arr); //这输出数组在内存中的地址

        System.out.println(arr[0]);  //注意索引是从0开始的
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        System.out.println("----------");

        // 通过索引修改数组元素
        arr[1] = 222;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        System.out.println("----------");

        // 定义一个空数组,动态初始化创建的数组,Java会有默认值
        // int[]的默认值是0, double[]默认值是0.0, boolean[]的默认值是false
        int[] arr2 = new int[4]; //动态定义数组，长度定好之后无放修改。

        arr2[0] = 111;
        arr2[1] = 222;
        arr2[2] = 333;
        arr2[3] = 444;

        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);
        System.out.println(arr2[3]);

    }

}
