package homework.Test1;

import java.util.ArrayList;
import java.util.Iterator;

/**
     Iterator迭代器使⽤

    往ArrayList添加以下元素”abc1”, ”abc2”, ”abc3”, ”abc4”.使⽤迭代器获取ArrayList集合中的元素

     1. 创建集合对象
     2. 往集合中存放元素
     3. 获取容器的迭代器
     4. 使⽤迭代器判断是否有下⼀个元素
     5. 使⽤迭代器对象获取集合中的元素
 */
public class Test03 {

    public static void main(String[] args) {

        //1. 创建集合对象
        ArrayList<String> list = new ArrayList<>();

        //2. 往集合中存放元素
        list.add("adc1");
        list.add("adc2");
        list.add("adc3");
        list.add("adc4");

        //3. 获取容器的迭代器
        Iterator it = list.iterator();

        //4. 使⽤迭代器判断是否有下⼀个元素
        while (it.hasNext()){
            //5. 使⽤迭代器对象获取集合中的元素
            System.out.println(it.next());
        }

    }

}
