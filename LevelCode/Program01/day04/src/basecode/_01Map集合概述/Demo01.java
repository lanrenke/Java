package basecode._01Map集合概述;
/**
 目标：能够说出Map集合的特点

     讲解：
         1. 为什么需要Map集合
             ArrayList list   list.get(10)
             单列集合存在的问题：查找元素不方便
             双列集合为了解决单列集合查找元素不方便问题
             key  value
             001  张三
             003  张三
             002  李四

         2. Map集合特点概述
             Map集合是一个双列集合：每次存储元素都需要存储两个
             一个元素称为键，另一个元素称为值，这个两个元素简称为键值对

             特点：键必须唯一，值可以重复

             public interface Map<K,V>  Key Value
             只要实现里该接口的类都是双列集合
             Map：映射，一个对应一个

         3. Map接口常用子类
             HashMap
             LinkedHashMap

     小结：
         1. Map集合的特点：用来存储键值对数据：键唯一，值可以重复
 */
public class Demo01 {

    public static void main(String[] args) {



    }

}
