package homework.Test1;
/**
      hashCode和equals方法

      请简述HashSet去除重复元素的原理

        基本上通过三个步骤
        1.遍历集合中元素 和 传入元素进行判断 先通过hashCode方法判断哈希值是否相同 如果哈希值不同 则直接添加元素 如果哈希值相同 则进行下一步判断
        2.如果哈希值相同，然后通过 重写的equals方法 判断元素在内存中的地址是否相同，如果相同 代表该元素是重复元素 不新增进集合 如果不同记得 在进行一不判断
        3.地址不同 这个时候需要通过 重写的equals方法 判断元素内容是否相同，如果相同这不新增元素 不同则新增元素

 * */
public class Test05 {
}
