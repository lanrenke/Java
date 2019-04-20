package homework.Test1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
     Map遍历

     Map集合中包含5对元素: "邓超"->"孙俪", "李晨"->"范冰冰", "刘德华"->"柳岩", “黄晓明”->” Baby”,“谢霆锋”->”张柏
     芝”.使用Entry方式迭代出Map集合中的元素

     1. 创建HashMap
     2. 使用put方法添加元素
     3. 使用entrySet方法获取到所有的键值对关系4. 获取entrySet的迭代器
     5. 使用迭代器查看是否有下一个元素
     6. 使用迭代器拿到下一个元素(Entry类型)
     7. 通过一个Entry获取到key和value
 */
public class Test05 {

    public static void main(String[] args) {

        HashMap<String ,String> map = new HashMap<>();

        map.put("邓超", "孙俪");
        map.put("李晨", "范冰冰");
        map.put("刘德华", "柳岩");
        map.put("黄晓明", "Baby");
        map.put("谢霆锋", "张柏芝");

        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, String>> it = entrySet.iterator();
        while (it.hasNext()){

            Map.Entry<String, String> entry = it.next();
            System.out.println(entry.getKey() +"="+ entry.getValue());

        }

    }

}
