package basecode._03LinkedList特点;

import java.util.LinkedList;

/**
 目标：了解LinkedList特有方法

     讲解：
     1. LinkedList集合特有方法(注意 既然说特有，就是其他集合是没有这些方法的，不要搞混淆)
         public void addFirst(E e) :
         public void addLast(E e) :
         public E getFirst() :
         public E getLast() :
         public E removeFirst() :
         public E removeLast() :

     小结：
         1. 将元素添加到链表头的方法是：addFirst
         2. 将元素添加到链表尾的方法是：addLast
         3. 获取链表头元素的方法是：getFirst
         4. 获取链表尾元素的方法是：getLast
         5. 删除链表头元素的方法是：removeFirst
         6. 删除链表尾元素的方法是：removeLast
 */

public class Demo05 {

    public static void main(String[] args) {

        // 创建集合对象
        LinkedList<String> list = new LinkedList();
        // 添加元素
        list.add("aaa");
        list.add("bbb");
        System.out.println(list); // [aaa, bbb]
        // 在链表头添加元素
        list.addFirst("ccc");
        // 在链表尾添加元素
        list.addLast("ddd");
        System.out.println(list);

        System.out.println("----------------");
        // 获得链表头元素
        System.out.println(list.getFirst());
        // 获得链表尾元素
        System.out.println(list.getLast());
        System.out.println("---------------");
        // 删除链表头元素
        System.out.println(list.removeFirst());
        // 删除链表尾元素
        System.out.println(list.removeLast());

        System.out.println(list);

    }

}
