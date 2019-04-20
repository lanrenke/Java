package basecode._07LinkedHashSet基本使用;

import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 目标：能够说出LinkedHashSet的特点

     讲解：
         1. LinkedHashSet的特点和结构
             继承HashSet：能够保证存取顺序一致，无索引，元素不可重复
             底层结构：哈希表+链表
             特点：能够保证存取顺序一致

         2. LinkedHashSet的特点演示

     小结：
         1. LinkedHashSet的特点
         无索引，元素不可重复，能够保证存取顺序一致
 */
public class Demo09 {

    public static void main(String[] args) {

        // 创建Set集合
        HashSet<String> set = new LinkedHashSet<>();
        set.add("fas");
        set.add("gasg");
        set.add("3424");
        set.add("gadfga");
        set.add("gadfga");//重复值不会被加入到集合中

        System.out.println(set);

    }

}
