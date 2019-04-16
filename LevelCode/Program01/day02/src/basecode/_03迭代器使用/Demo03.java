package basecode._03迭代器使用;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/**
     目标：能够使用迭代器对集合进行遍历

     讲解：
         1. 什么是迭代器
             * 一个实现了Iterator接口实现类的对象
             * 用来遍历集合

         2. 为什么要使用迭代器
             不同体系的集合特点不一样
                 * List接口有索引，我们可以通过for循环+get方法来获取数据，
                 * Set接口没有索引的，不能通过for循环+get方法获取数据。
                 * 迭代器是一种通用的集合遍历方式

         3. 迭代器的好处
             * 屏蔽了众多集合的内部实现，对外提供统一的遍历方式
             * 任何单列集合都可以使用迭代器遍历

         4. 如何获取迭代器
             * 通过集合对象的方法获得，该方法如下：
             * Iterator<E> iterator() 获得迭代器对象
             * 该方法是定义在Collection接口中

         5. 迭代器的常用方法
             * boolean hasNext() hasNext的作用是判断当前指针所指对象内容的下一个是否有内容 有则返回true 无就返回false
             * E next()  运动当前指针的位置到下一位，然后把指针所指内容作为 返回值 返回。

     小结：
         1. 迭代器使用步骤
             * 通过集合调用iterator方法获得迭代器对象
             * 通过调用迭代器对象的方法进行遍历
 */
public class Demo03 {

    public static void main(String[] args) {

        // 1. 创建集合对象
        ArrayList<String> list = new ArrayList<>();
        // 2. 添加元素
        list.add("孙悟空");
        list.add("唐僧");
        list.add("白骨精");

        // 3.获得迭代器对象
        Iterator<String> it = list.iterator();//只能通过方法来创建
        // 使用循环遍历
        while(it.hasNext()){//
            System.out.println(it.next());
        }

        test02();
    }

    // 没有使用循环遍历
    public static void test01(){
        // 1. 创建集合对象
        ArrayList<String> list = new ArrayList<>();
        // 2. 添加元素
        list.add("孙悟空");
        list.add("唐僧");
        list.add("白骨精");

        // 3.获得迭代器对象
        Iterator<String> it = list.iterator();
        System.out.println(it.hasNext()); // true
        System.out.println(it.next());  // 孙悟空

        System.out.println(it.hasNext()); // true
        System.out.println(it.next());  // 唐僧

        System.out.println(it.hasNext()); // true
        System.out.println(it.next());  // 白骨精

        System.out.println(it.hasNext()); // false
        System.out.println(it.next());  // null

    }

    //Test 无序集合虽然不能使用for-i循环遍历输出 但是可以使用foreach遍历 正常开发情况下很少用到 理解即可
    public static void test02(){

        HashSet<String> list = new HashSet<>();

        list.add("孙悟空");
        list.add("唐僧");
        list.add("白骨精");

        for (String name :list
             ) {
            System.out.println(name);
        }

    }


}
