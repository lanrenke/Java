package basecode._03LinkedList特点;

import java.util.LinkedList;

/**
 目标：能够说出LinkedList集合底层结构和特点

     讲解：
         1. LinkedList集合底层结构和特点
            底层是双链表结构：查询慢，增删快（双链表的意思就是双向，可以从头到尾，也可以从尾到头）

         2. LinkedList源码分析
             * 无参数构造方法源码分析：什么也没有干
             * add方法源码分析：将元素添加到链表中，让上一个元素记住下一个元素的地址值（相当于在一个节点有3部分 1 前一元素地址值(没有则为null) 2节点内容包含的值 3下一个元素的地址值）
             * get方法源码分析：根据索引值判断是从链表头还是链表尾部查询数据。(一分为二法 如果长度为10 查询2 肯定从头开始 如果是8 肯定是从尾部开始)
     小结：
        LinkedList集合的底层结构是：
            底层是双链表结构：查询慢，增删快（双链表的意思就是双向，可以从头到尾，也可以从尾到头）
 */
public class Demo04 {

    public static void main(String[] args) {

        // 创建LinkedList集合：无参数构造方法什么也没做
        LinkedList<Integer> list = new LinkedList<>();
        list.add(12);
        list.add(23);
        list.add(34);
        System.out.println(list.get(2));
        System.out.println(list);

    }

}
