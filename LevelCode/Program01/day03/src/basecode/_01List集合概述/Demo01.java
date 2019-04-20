package basecode._01List集合概述;

import java.util.ArrayList;

/**
 目标：能够说出List集合的特点

 讲解：
     1. 演示List集合的特点
        有序(存取顺序一致)，有索引，元素可重复

 小结：
     1. List集合的特点
        有序(存取顺序一致)，有索引，元素可重复
 */
public class Demo01 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(22);
        list.add(33);
        list.add(44);
        System.out.println(list);
        for (Integer num : list
             ) {
            System.out.println(num);//输入与输出的顺序一致
        }

    }

}
