package basecode._04Map遍历2_键值对方式;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 目标：能够使用"键值对"的方式遍历Map集合

 小结：
     通过Entry对象遍历Map集合的步骤
     1. 调用Map集合的entrySet方法获得Entry对象集合
     2. 使用增强for或迭代器遍历Entry对象集合：获得每一个Entry对象
     3. 调用Entry对象的getKey和getValue方法获得键和值
 */
public class Demo042 {

    public static void main(String[] args) {

        // 创建Map集合对象
        HashMap<String, String> map = new HashMap<>();
        // 存储键值对数据
        map.put("name", "孙悟空");
        map.put("gender", "男");
        map.put("age", "500");

        // 获得Entry对象集合
        Set<Map.Entry<String, String>> entrySet = map.entrySet();

        // 使用增强for遍历集合
        for (Map.Entry<String, String> entryMap : entrySet) {

            String key = entryMap.getKey();
            String value = entryMap.getValue();
            System.out.println(key+"="+value);

        }

        System.out.println("----------------");
        // 获得迭代器对象
        Iterator<Map.Entry<String, String>> mapIt = entrySet.iterator();
        while (mapIt.hasNext()){

            Map.Entry<String ,String > entry = mapIt.next();

            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"="+value);

        }


    }

}
