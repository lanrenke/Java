package code._08ArrayList集合的常用API;

import java.util.ArrayList;

/**
 目标：ArrayList集合的常用API(功能)

 查看这个类：
     包：java.util.
         实例方法:
         -  public boolean add(E e)`：将指定的元素添加到此集合的尾部。
         - `public E remove(int index)` ：移除此集合中指定位置上的元素。返回被删除的元素。
         -  public E get(int index)` ：返回此集合中指定位置上的元素。返回获取的元素。
         - `public int size()` ：返回此集合中的元素数。遍历集合时，可以控制索引范围，防止越界。
         构造器：public ArrayList(){}
 小结：请记住！！
 */
public class ArrayListDemo {

    public static void main(String[] args) {

        // 创建一个集合对象：就是一个容器
        // lists是一个容器对象
        ArrayList list = new ArrayList();
        list.add("Java");
        list.add("Python");
        list.add(12.23);
        list.add(false);
        System.out.println(list);

        // 根据索引删除删除元素:删除成功后返回该元素值！
        System.out.println(list.remove(2));

        // 根据索引取元素值
        System.out.println(list.get(1));

        // 集合大小
        System.out.println(list.size());

    }

}
