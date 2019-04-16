package basecode._04迭代器原理;

import java.util.ArrayList;
import java.util.Iterator;

/**
    目标：理解迭代器使用注意事项

    讲解：
         1. 了解并发修改异常(注意即可，一般工作中不会有这种需求)
             在使用迭代器遍历集合时不能对集合元素进行增删操作，如果执行了增删操作则会出现并发修改异常
             java.util.ConcurrentModificationException

         2. hasNext和next方法必须成对：一次hasNext对应一次next方法

         3. 如果集合中没有元素可迭代了仍然调用next方法，则会出现：没有元素异常。
            java.util.NoSuchElementException

    小结：
        1. 什么时候会出现并发修改异常？
            迭代过程中对集合元素进行增删操作

        2. 当集合遍历完毕之后还调用next方法会出现什么异常
            没有元素异常。
 */
public class Demo05 {

    public static void main(String[] args){
        // 1. 创建集合对象
        ArrayList<String> list = new ArrayList<>();
        // 2. 添加元素
        list.add("孙悟空");
        list.add("唐僧");
        list.add("白骨精");

        // 3.获得迭代器对象
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String str = it.next(); // 孙悟空 白骨精
            /*if (str.equals("唐僧")){
                // 4. 往集合中添加一个元素：沙僧
                list.add("沙僧");  这里就会报并发修改异常了
            }*/
            //System.out.println(it.next());如果重复调用 指针就会跳转两次 很有可能会报没有元素异常
            System.out.println(str); // 唐僧
        }
    }

}
