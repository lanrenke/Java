package homework.Test2;

import java.util.Collections;
import java.util.HashSet;

/**
     HashSet使用
     向HashSet集合添加姓名{张三,李四,王五,二丫,钱六,孙七},将二丫删除,添加王小丫
     1. 创建HashSet集合
     2. 使用add方法往HashSet中添加元素
     3. 使用remove方法删除HashSet中的二丫
     4. 使用add方法往HashSet中添加王小丫
 */
public class Test02 {

    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();
        Collections.addAll(set,"张三","李四","王五","二丫","钱六","孙七");
        System.out.println(set);

        set.remove("二丫");
        System.out.println(set);

        set.add("王小丫");
        System.out.println(set);

    }

}
