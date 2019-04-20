package basecode._06LinkedHashMap基本使用;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 目标：掌握LinkedHashMap集合的特点

     讲解：
         LinkedHashMap类概述
         继承HashMap，能够保证存取顺序一致
         底层结构：哈希表+链表

         如何选择HashMap和LinkedHashMap
         如果要求存取顺序一致，则选择LinkedHashMap，否则选择HashMap
     小结：
         1. LinkedHashMap集合的特点
         哈希表+链表：能够保证存取顺序一致
 */
public class Demo06 {

    public static void main(String[] args) {

        // 创建Map
        HashMap<String, String> map= new LinkedHashMap<>();
        map.put("fdsaf", "fdsaf");
        map.put("5435346", "f3124");
        map.put("7875232", "f3124");
        map.put("dsafa", "f3124");
        System.out.println(map);

    }

}
