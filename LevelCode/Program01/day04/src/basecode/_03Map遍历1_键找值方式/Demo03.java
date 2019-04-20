package basecode._03Map遍历1_键找值方式;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 目标：掌握使用"键找值"的方式遍历Map集合

     讲解：
         1. Map集合的遍历方式介绍
            * 双列集合不能直接使用增强for或迭代器遍历

         2. 通过键找值遍历相关的方法
            *  Set<K> keySet() 获得键集合

     小结：
         1. 键找值方式遍历Map集合的步骤
         1. 调用Map集合的keySet方法获得键集合
         2. 使用增强for或迭代器遍历键集合：获得每一个键
         3. 调用Map集合的get方法根据键获得对应的值
 */
public class Demo03 {

    public static void main(String[] args) {

        // 创建Map集合
        Map<String,String> map = new HashMap<>();
        map.put("no", "1");
        map.put("name", "李四");
        map.put("gender", "男");

        // 获得键集合
        Set<String> keySet = map.keySet();

        // 使用增强for遍历键集合
        for (String key : keySet) {

            String value = map.get(key);
            System.out.println(key+"="+value);

        }

        System.out.println("--------------");
        // 获得迭代器对象
        Iterator<String> it = keySet.iterator();
        while (it.hasNext()){

            String key = it.next();
            String value = map.get(key);
            System.out.println(key+"="+value);

        }

    }

}
