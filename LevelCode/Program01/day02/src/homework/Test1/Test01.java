package homework.Test1;

import java.util.ArrayList;
import java.util.Collection;

/**
    Collection基本⽅法
    答:
    public static void add()
    public static boolean remove()
    public static void clear()
    public static boolean contains()
    public static boolean isEmpty()
    public static toArray()
    public static int size()

     练习Collection的add,remove,clear,size⽅法
     1.创建Colection对象.Collection是接⼝.所以创建⼦类ArrayList对象
     2.往集合中添加对象元素
     3.删除元素
     4.获取集合⼤⼩
     5.清空集合
     6.输出集合内容

*/
public class Test01 {

    public static void main(String[] args) {

        Collection<String> list = new ArrayList<>();
        //2.往集合中添加对象元素
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        //3.删除元素
        list.remove("aaa");

        //4.获取集合⼤⼩
        int a = list.size();
        System.out.println(a);

        //5.清空集合
        list.clear();

        //6.输出集合内容
        System.out.println(list);


    }

}
