package basecode._06HashSet基本使用;

import java.util.HashSet;
import java.util.Iterator;

/**
 目标：掌握HashSet的基本使用

     讲解：
     1. HashSet集合的特点和底层结构
         特点：无序，无索引，元素不可重复
         底层结构：哈希表(数组+链表+红黑树(JDK1.8才有))

     2. HashSet集合遍历方式
         增强for
         迭代器

     3. 问题：为什么有时元素是有顺序的？

     小结：
         1. 如何从HashSet集合中获取元素
 */
public class Demo08 {

    public static void main(String[] args) {

        // 创建集合
        HashSet<String> set = new HashSet<>();
        set.add("11");
        set.add("22");
        set.add("aa");
        set.add("dd");

        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("------------------------");
        for (String s : set) {
            System.out.println(s);
        }

    }

}
