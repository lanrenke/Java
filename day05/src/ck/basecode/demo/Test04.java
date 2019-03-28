package ck.basecode.demo;
//空指针异常**：假如一个引用类型的变量的值是null,然后我们又去调用这个变量的方法等操作就会出现空指针异常。
public class Test04 {

    public static void main(String[] args) {

        int[] arr = {1,2,3};
        arr = null;//把arr的地址清零 导致找不到对应内存中的数组。
        System.out.println(arr[0]);//需要输出数值对应索引值时肯定会报错。

    }

}
