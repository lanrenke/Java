package homework.Test1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
    Map接口中的方法
     往一个Map集合中添加若干元素.获取Map中的所有key, 并使用增强for和迭代器遍历输出每个key'

     1. 创建HashMap
     2. 使用put添加元素
     3. 使用Map的keySet方法获取到所有的key
     4. 使用增强for获取每个key
     5. 获取keySet的迭代器
     6. 循环判断迭代器中是否有下一个元素
     7. 使用迭代器获取每个key

 */
public class Test02 {

    public static void main(String[] args) {

        HashMap<String,String> map = new HashMap<>();

        map.put("aaa","111");
        map.put("bbb","222");
        map.put("ccc","333");
        map.put("ddd","444");

        Set<String> set = map.keySet();

        for (String str : set) {
            System.out.println(str+"="+map.get(str));
        }

        System.out.println("-----------迭代器----------");
        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }

}
