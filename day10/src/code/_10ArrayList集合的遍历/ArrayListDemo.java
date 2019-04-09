package code._10ArrayList集合的遍历;

import java.util.ArrayList;

/**
 目的: ArrayList集合的遍历。

 for循环
 foreach

 */
public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<String> lists = new ArrayList<>();
        lists.add("赵敏");  // 0
        lists.add("周芷若");  // 1
        lists.add("殷素素"); // 2
        lists.add("小昭");   // 3
        System.out.println(lists);
        System.out.println("-------------------");

        for (int i = 0; i < lists.size(); i++) {
            System.out.println(lists.get(i));
        }

        System.out.println("-------------------");

        for (String name:lists
             ) {
            System.out.println(name);
        }

    }

}
