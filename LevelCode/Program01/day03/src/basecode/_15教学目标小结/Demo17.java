package basecode._15教学目标小结;

/**
 - 能够说出List集合特点
        有序，有索引，元素可重复

 - 能够说出常见的数据结构
    栈：先进后出
    队列：先进先出
    数组：查询快，增删慢
    链表：查询慢，增删快
    红黑树：查询快

 - 能够说出数组结构特点
    查询快，增删慢

 - 能够说出栈结构特点
    先进后出

 - 能够说出队列结构特点
    先进先出

 - 能够说出单向链表结构特点
    查询慢，增删快
    只能从链表头开始遍历

 - 能够说出Set集合的特点
    无序，无索引，元素不可重复

 - 能够说出哈希表的特点
    特点：数组+链表+红黑🌲(JDK1.8之后)

 - 使用HashSet集合存储自定义元素
    HashSet<Student> set = new HashSet<>();
    自定义类要重写hashCode和equals方法才能实现去重功能

 - 能够使用集合工具类
    addAll：将数组中所有元素添加到集合中
    shuffle：集合元素乱序
    sort：对象集合元素进行升序排序

 - 能够使用Comparator比较器进行排序
     1. 创建类实现Comparator接口
        class MyComparator implements Comparator<Integer>
     2. 重写接口中的方法：compare，在方法中实现排序规则
         return o1 - o2; 升序
         return o2 - o1; 降序

 - 能够使用可变参数
    格式：数据类型...变量名
    本质：数组

 -----------------------划重点 -----------------------
 1. ArrayList
 2. LinkedList
 3. HashSet
 4. LinkedHashSet
    对集合元素进行增删改查操作和遍历

 5. Collections常用方法
    难点：自定义比较器

 6. 可变参数(实际开发自己使用不多，但是官方或第三方方法中经常遇到)
 */
public class Demo17 {
}
