package basecode._05Set集合概述;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 目标：能够说出Set集合特点和常用子类

     讲解：
         1. Set集合的特点
             无序(存取顺序不一致)，无索引，元素不可重复

         2. 演示Set集合的特点

     小结：
         1. Set集合的特点
            无序(存取顺序不一致)，无索引，元素不可重复

         2. Set集合常用子类
             HashSet
             LinkedHashSet

 */
public class Demo07 {

    public static void main(String[] args) {

        // 创建Set集合
        Set<String> set = new HashSet<>();
        set.add("fas");
        set.add("gasg");
        set.add("3424");
        set.add("gadfga");
        set.add("gadfga");

        // 使用迭代器遍历
        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("-----------------");
        // 使用增强for遍历
        for (String s : set) {
            System.out.println(s);
        }

    }

}
