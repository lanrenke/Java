package homework.Test2.Test04;

import java.util.Arrays;

/**
    1. 泛型⽅法

    编写⼀个泛形⽅法名称为swap，实现指定位置数组元素的交换.数组和要交换的索引作为⽅法参数

     1. 编写⼀个泛形⽅法，数组是任意类型,并传⼊2个要交换位置的索引
     2. 使⽤第三⽅变量的⽅式交换数组中的元素
     3. 定义⼀个String数组,调⽤swap⽅法,交换指定索引的元素
     4. 打印交换后的元素
     5. 定义⼀个Integer数组,调⽤swap⽅法,交换指定索引的元素
     6. 打印交换后的元素
 */
public class Test04 {

    public static void main(String[] args) {

        String[] arr1 = {"a","b","c","d","e","f"};
        Integer[] arr2 = {1,2,3,4,5,6,7,8,9,10};//泛型要使用包装类才能使用基本数据类型的数据

        swap(arr1);

        swap(arr2);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

    }

    private static <T> void swap(T[] t){

        for (int i = 0,j=t.length - 1; i < j; i++,j--) {

            T temp = t[j];
            t[j] = t[i];
            t[i] = temp;

        }

    }

}
