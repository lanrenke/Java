package homework.Test1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
     Map遍历

     Map集合中包含5对元素: "邓超"->"孙俪", "李晨"->"范冰冰", "刘德华"->"柳岩", “黄晓明”->” Baby”,“谢霆锋”->”张柏
     芝”.使用keySet方式迭代出Map集合中的元素

     1. 创建HashMap
     2. 使用put方法添加元素
     3. 使用keySet方法获取所有的键
     4. 获取到keySet的迭代器
     5. 循环判断迭代器是否有下一个元素
     6. 使用迭代器next方法获取到一个键
     7. 通过一个键找到一个值
     8. 输出键和值
 */
public class Test04 {

    public static void main(String[] args) {

        HashMap<String ,String> map = new HashMap<>();

        map.put("邓超", "孙俪");
        map.put("李晨", "范冰冰");
        map.put("刘德华", "柳岩");
        map.put("黄晓明", "Baby");
        map.put("谢霆锋", "张柏芝");

        Set<String> set = map.keySet();

        Iterator<String> it = set.iterator();
        while (it.hasNext()){

            String key = it.next();
            String value = map.get(key);
            System.out.println(key +"="+ value);

        }

    }

}
