package homework.Test1;

import java.util.HashMap;

/**
  Map接口中的常用方法
    put
    remove
    get
    clear
    size
    containkey

     练习Map集合的常用方法: put, get, remove

     1. 创建HashMap
     2. 使用put添加元素
     3. 使用put修改元素
     4. 使用get获取元素
     5. 使用remove删除元素
     6. 打印集合中的元素
 */
public class Test01 {

    public static void main(String[] args) {

        HashMap<Integer,Integer> map = new HashMap<>();

        map.put(123,234);
        map.put(567,8910);
        map.put(2343,1111);
        map.put(2222,777);

        map.put(2222,888);
        System.out.println(map.get(2222));

        map.remove(567);
        System.out.println(map);

    }

}
