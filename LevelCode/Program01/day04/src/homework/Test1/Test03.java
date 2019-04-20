package homework.Test1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
     Map接口中的方法

     往一个Map集合中添加若干元素.获取Map中的所有value, 并使用增强for和迭代器遍历输出每个value

     1. 创建HashMap
     2. 使用put添加元素
     3. 使用Map的values方法获取到所有的value
     4. 使用增强for获取每个value
     5. 使用迭代器获取每个value
 */
public class Test03 {

    public static void main(String[] args) {

        HashMap<String,String> map = new HashMap<>();

        map.put("aaa","111");
        map.put("bbb","222");
        map.put("ccc","333");
        map.put("ddd","444");

        Set<Map.Entry<String, String>> setEntry = map.entrySet();

        for (Map.Entry<String, String> entry : setEntry) {
            System.out.println(entry.getValue());
        }

        System.out.println("-----------迭代器----------");
        Iterator<Map.Entry<String, String>> it = setEntry.iterator();
        while (it.hasNext()){
            System.out.println(it.next().getValue());
        }

    }

}
