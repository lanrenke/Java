package basecode._10System类;

import java.util.Arrays;

/**
 目标：能够掌握System类中常用方法

 讲解：
     * static void exit(int status)
         * 退出JVM终止程序运行，在实际开发中一般不用。
         * 0：正常退出
         * -1：异常退出

     * static long currentTimeMillis()
        * 获得当前时间的毫秒值

     * static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
         * 数组复制(复制数组中的元素)
         * src：源数组(要复制的数组)
         * srcPos：源数组的起始索引(位置)
         * dest：目标数组
         * destPos：目标数组的起始索引(位置)
         * length：要复制元素的个数

 小结：a
     1. static long currentTimeMillis() 方法的作用
         获得当前时间毫秒值 (data类也可以获取毫秒，但是需要建立对象，如果只是需要毫秒值时，可以使用System类是方法更加便捷)

     2. static void arraycopy(Object src, int srcPos,
         Object dest, int destPos, int length)方法的作用
         数组复制
 */
public class Demo11 {

    public static void main(String[] args) {

        //test01();
        
        //test02();

        test03();

    }


    /*
    static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
            * 数组复制(复制数组中的元素)
            * src：源数组(要复制的数组)
            * srcPos：源数组的起始索引(位置)
            * dest：目标数组
            * destPos：目标数组的起始索引(位置)
            * length：要复制元素的个数
     */
    private static void test03() {

        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = new int[6];
        System.out.println("---------复制前---------");
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        System.out.println("---------复制后---------");
        System.arraycopy(arr1,1,arr2,1,5);//注意越界问题 数组的长度是固定的，如果复制的内容超过目标数组，就会报错了。
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

    }

    /*
        static long currentTimeMillis()
            * 获得当前时间的毫秒值
            * 常用于性能测试
     */
    private static void test02() {

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            System.out.println("i= "+i);
        }
        long endTime = System.currentTimeMillis();
        long distance = endTime - startTime; //得出的时间就为这个for循环执行所需时间。
        System.out.println(distance);

    }


    /*
    static void exit(int status)
            * 退出JVM终止程序运行，在实际开发中一般不用。
            * 0：正常退出
            * -1：异常退出
     */
    private static void test01() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if (i == 5){
                // 退出JVM终止程序运行，在实际开发中一般不用。
                System.exit(0);
            }
        }
    }

}
