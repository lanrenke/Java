package basecode._11集合小结;


/**
    1. 集合体系小结
        Collection：所有单列集合的父类
            List： 子接口：有序，有索引，元素可重复
                ArrayList：底层结构：数组：查询快，增删慢，线程不安全，效率高
                LinkedList：底层结构：链表：查询慢，增删快，线程不安全，效率高
                Vector：底层结构：数组：有序，有索引，元素可重复，线程安全，效率低(已经过时了，被ArrayList取代了)

            Set：子接口：无序，无索引，元素不可重复
                HashSet：底层结构：哈希表(数组+链表+(JDK1.8之后红黑树)) 增删查询都比较快，线程不安全，效率高
                LinkedHast：继承HashSet，能够保证存储顺序一致，底层结构：哈希表+链表，线程不安全，效率高

    2. 如何选择集合
        1. 如果要求元素可以重复，则在List体系下选择
            1.1 如果需要执行大量的增删操作，则选择LinkedList
            1.2 如果只是执行查询操作，则选择ArrayList

        2. 如果要求元素不可重复，则在Set体系下选择
            1.1 如果要求存取顺序一致，则只能选择LinkedHashSet，否则推荐选择HashSet
 */
public class Demo13 {
    public static void main(String[] args){

    }
}
