package basecode._01List集合概述;

import java.util.ArrayList;

/**
 目标：掌握List集合常用方法

     讲解：
         1. List集合常用方法
         public void add(int index, E element)
         将元素添加到指定的位置

         public E get(int index)
         根据索引获得元素

         public E remove(int index)
         删除指定位置的元素，返回被删除的元素

         public E set(int index,E element)
         将指定位置的元素修改为：element，返回修改前的元素

     小结：
         1. 在List集合的指定位置添加元素的方法？add(int index,E element)
         2. 获得List集合指定位置元素的方法？ get(int index);
         3. 删除List集合指定位置元素的方法？ remove(int index)
         4. 修改List集合指定位置元素的方法  set(int index, E element)
 */
public class Demo02 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        System.out.println(list);

        System.out.println("-----------------");
        // 将元素添加到索引1位置
        list.add(1,"ddd");
        System.out.println(list);

        // 获取指定位置的元素
        System.out.println(list.get(1)); // ddd 会返回所删除的值

        // 删除指定位置的元素
        System.out.println(list.remove(1));//ddd

        System.out.println(list);

        // 修改指定位置的元素
        list.set(2,"fff");
        //list.set(3,"aaa");注意索引越界问题，因为ArrayList本质是个数组，如果去访问没有对应索引的数据 会报索引异常
        System.out.println(list);

    }

}
