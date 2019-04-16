package basecode._11教学目标小结;

/**
 - 能够说出集合与数组的区别
        数组：长度固定，可以存储任意类型的数据
        集合：长度可变，只能存储引用类型的数据

 - 能够说出Collection集合的常用功能
     public boolean add(E e) ： 把给定的对象添加到当前集合中 。
     public void clear() :清空集合中所有的元素。
     boolean remove(E e) : 将给定的对象从集合中删除。
     boolean contains(E e) : 判断当前集合中是否包含给定的对象。
     public boolean isEmpty() : 判断当前集合是否为空。
     public int size() : 返回集合中元素的个数。
     public Object[] toArray() : 把集合中的元素，存储到数组中。


 - 能够使用迭代器对集合进行取元素
    1. 获得迭代器对象：Iterator it =  集合对象.iterator();
    2. 使用while循环遍历
        while(it.hasNext()){
            System.out.println(it.next());
        }

 - 能够说出集合的使用细节
    集合在使用时必须指定存储的数据类型，如果不指定默认是任意类型都可以存储

 - 能够使用集合存储自定义类型
    ArrayList<Poker> list = new ArrayList<>()

 - 能够使用泛型创建集合对象
    ArrayList<Poker> list = new ArrayList<>()
    ArrayList<String> list = new ArrayList<>()

 - 能够阐述泛型通配符的作用
    ? 可以匹配任意类型的数据

 - 能够理解泛型上下限
    上限：? extends Animal 传递Animal及其子类对象
    下限：? super Animal  传递Animal及其父类对象
 */
public class Demo14 {
}
