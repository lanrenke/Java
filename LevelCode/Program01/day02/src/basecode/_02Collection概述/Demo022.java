package basecode._02Collection概述;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
     目标：能够使用Collection集合的常用功能(方法)

     讲解：
         1. Collection集合常用方法
             public boolean add(E e) ： 把给定的对象添加到当前集合中 。
             public void clear() :清空集合中所有的元素。
             boolean remove(E e) : 将给定的对象从集合中删除。
             boolean contains(E e) : 判断当前集合中是否包含给定的对象。
             public boolean isEmpty() : 判断当前集合是否为空。
             public int size() : 返回集合中元素的个数。
             public Object[] toArray() : 把集合中的元素，存储到数组中。

     小结
         1. Collection集合常用功能有哪些？
             add
             clear
             remove
             isEmpty
             contains
             size
             toArray
 */

public class Demo022 {

    public static void main(String[] args) {

        // 创建集合对象
        Collection<String> list = new ArrayList();//多态

        // 添加元素
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        System.out.println(list);

        // 删除指定的元素
        list.remove("aaa");
        System.out.println(list);

        // 判断集合是否包含指定的元素
        list.contains("bbb");//true

        System.out.println("-----------------");
        // 集合转数组
        Object[] obj = list.toArray();
        System.out.println(Arrays.toString(obj));
        System.out.println("-----------------");

        // 清空集合所有元素
        list.clear();
        System.out.println(list);//[]

        // 判断集合是否为空(集合元素个数是否为零)
        System.out.println(list.isEmpty());//true 可以作为判断条件

    }

}
