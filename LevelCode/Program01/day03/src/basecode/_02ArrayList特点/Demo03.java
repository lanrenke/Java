package basecode._02ArrayList特点;

import java.util.ArrayList;

/**
 目标：能够说出ArrayList集合底层结构和特点

     讲解：
         1. ArrayList集合底层结构和特点
             底层结构是数组：查询快，增删慢

         2. ArrayList源码分析
             * 无参数构造方法源码分析:建立一个空数组
             * add方法源码分析: 在添加第一个元素时，内部会创建一个长度为10的数组，如果长度不够，
             则会扩容，扩容大小是当前数组长度的1.5倍

     小结：
         ArrayList集合底层结构和特点
            数组：增删慢，查询快
 */
public class Demo03 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        // 添加元素
        // 在添加第一个元素时，内部会创建一个长度为10的数组
        list.add("aa");
        list.add("bb");
        list.add("cc");
        list.add("ee");

    }
}
