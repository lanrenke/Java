package homework.Test2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/**
     HashSet
     ArrayList有以下元素: "a","f","b","c","a","d"利用HashSet对ArrayList集合去重(最终结果: ArrayList中没有重复元素)
     1. 创建ArrayList
     2. 使用add方法往ArrayList添加元素
     3. 创建HashSet.用于将ArrayList中重复的元素去除
     4. 调用HashSet的addAll方法,将ArrayList中的元素添加到HashSet中
     5. 清空list的所有元素
     6. 将set集合中的元素再添加回ArrayList集合
 */
public class Test01 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"a","f","b","c","a","d");
        System.out.println("---------去重前---------");
        System.out.println(list);

        HashSet<String> set = new HashSet<>();
        set.addAll(list);
        System.out.println(set);

        list.clear();

        list.addAll(set);
        System.out.println("---------去重后---------");
        System.out.println(list);

    }

}
