package basecode._04Vector概述;

import java.util.Enumeration;
import java.util.Vector;

/**
 目标：了解Vector集合的特点和Enumeration的使用

     讲解：
         1. Vector集合使用演示
         2. Vector集合的特点
             * 实现List接口的一个集合
             * 有序，有索引，元素可重复，线程安全，效率低(已经过时了，被ArrayList取代了)

     小结：
         1. Vector的特点
         有序，有索引，元素可重复，线程安全，效率低(已经过时了，被ArrayList取代了)
         2. Enumeration的作用和常用方法
             boolean hasMoreElements(); 判断是否有下一个元素，有返回true，否则false
             E nextElement(); 将指针下移指向下一个元素并返回当前位置的元素
 */
public class Demo06 {
    public static void main(String[] args){
        Vector<String> vector = new Vector<>();
        vector.add("aaa");
        vector.add("bbb");
        vector.add("ccc");
        System.out.println(vector);

        // Enumeration：迭代器的前身，使用方式和迭代器一致(方法名不一样)
        Enumeration<String> it = vector.elements();
        // 等价迭代器的hasNext方法
        while(it.hasMoreElements()){
            // 等价迭代器的next方法
            System.out.println(it.nextElement());
        }

    }
}
