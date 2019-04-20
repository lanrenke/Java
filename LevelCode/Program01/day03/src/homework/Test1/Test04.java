package homework.Test1;

import java.util.HashSet;
import java.util.Iterator;

/**
 HashSet基本使用
 往HashSet中添加字符串"zhangsan", "lisi","wangwu", "zhangsan".使用迭代器获取HashSet中的元素.
 */
public class Test04 {

    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();
        set.add("zhangsan");
        set.add("lisi");
        set.add("wangwu");
        set.add("zhangsan");//重复数据不放入集合

        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }

}
