package basecode._02Map常用方法;

import java.util.HashMap;
import java.util.Map;

/**
 目标：掌握Map集合常用的方法

     讲解：
         1. 演示Map集合常用方法
             public V put(K key, V value) :
                 添加键值对数据
                 如果键存在，则使用新值替换旧值，返回旧值
                 如果键不存在，则直接添加

             public V remove(Object key) :
                 根据键删除键值对
                 如果键存在，则返回键对应的值
                 如果键不存在，则返回null

             public V get(Object key)：
                 根据键获得值，如果键不存在则返回null

             public boolean containKey(Object key) :
                判断是否包含有指定的键，有返回true，否则false

             public int size()：
                 获得集合中键值对个数

             public void clear()：
                 清空集合
     小结：
         1. 添加和修改元素的方法？
            V put(K key, V value)
         2. 删除元素的方法
            V remove(Object key)
         3. 获取元素的方法
            V get(Object key)
 */
public class Demo01 {

    public static void main(String[] args) {

        // 创建Map集合
        Map<String ,String > map = new HashMap<>();

        // 添加键值对数据
        map.put("aa","abc");
        map.put("bb","bac");
        map.put("cc","cba");

        // 根据键获得值
        System.out.println(map.get("aa"));
        System.out.println(map);

        // 根据键删除键值对数据
        System.out.println(map.remove("cc"));
        System.out.println(map);

        // 判断是否包含指定的键
        System.out.println(map.containsKey("bb"));

        // 获得键值对对数
        System.out.println(map.size());

        // 清空集合元素
        map.clear();
        System.out.println(map);

    }

}
