package basecode._13Collections工具类;

import java.util.ArrayList;
import java.util.Collections;

/**
 目标：掌握Collections工具类常用方法

     讲解：
         Collections工具类常用方法
             public static <T> boolean addAll(Collection<T> c, T... elements)
                将数组元素添加到指定的集合中

             public static void shuffle(List<?> list)
                对集合元素乱序

             public static <T> void sort(List<T> list)
                对集合元素进行排序，默认是升序

     小结：
         1. addAll方法的作用：将数组元素添加到指定集合中
         2. shuffle方法的作用：对集合元素进行乱序
         3. sort方法的作用：对集合元素进行排序，默认是升序
 */
public class Demo15 {

    public static void main(String[] args) {

        // 创建集合对象
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list);

        /*
          public static <T> boolean addAll(Collection<T> c, T... elements)
                将数组元素添加到指定的集合中
        */
        Collections.addAll(list,2,4,56,7,8,9,0,11);
        System.out.println(list);

        /*
         public static void shuffle(List<?> list)
                对集合元素乱序
         */
        Collections.shuffle(list);
        System.out.println("----------乱序后-----------");
        System.out.println(list);

        /*
          public static <T> void sort(List<T> list)
                对集合元素进行排序，默认是升序
         */
        Collections.sort(list);
        System.out.println(list);

    }

}
