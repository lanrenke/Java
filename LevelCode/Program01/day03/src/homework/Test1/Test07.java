package homework.Test1;

import java.util.LinkedHashSet;

/**
     LinkedHashSet基本使用
     使用LinkedHashSet存储以下元素:"王昭君","王昭君","西施","杨玉环","貂蝉".使用迭代器和增强for循环遍历LinkedHashSet
     1. 创建LinkedHashSet
     2. 使用add方法添加元素到LinkedHashSet
     3. 使用迭代器获取LinkedHashSet中的元素
     4. 使用增强for获取LinkedHashSet中的元素
 */
public class Test07 {

    public static void main(String[] args) {

        LinkedHashSet<String> list = new LinkedHashSet<>();
        //HashSet<String> set = new LinkedHashSet<>();也可以使用多态。
        list.add("王昭君");
        list.add("王昭君");
        list.add("西施");
        list.add("杨玉环");
        list.add("貂蝉");

        for (String s : list) {
            System.out.println(s);
        }

    }

}
