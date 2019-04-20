package homework.Test2;

import java.util.Iterator;
import java.util.LinkedList;

/**
     1. LinkedList使用
     2. Collection的contains(Object o)方法
     3. 增强for和迭代器

     已知数组存放一批QQ号码.QQ号码最长为11位,最短为5位
     String[] strs = {"12345","67891",1"2347809933","98765432102","67891","12347809933"}
     将该数组里面的所有qq号都存放在LinkedList中,将list中重复元素删除,将list中所有元素用两种方式打印出来

     1. 定义QQ号码数组String[] strs
     2. 创建LinkedList
     3. 遍历strs获取每个qq号码
     4. 判断LinkedList是否已经存在这个qq号码
     5. 不存在这个qq号码则添加到LinkedList中
     6. 增强for遍历LinkedList
     7. 迭代器遍历LinkedList
 */
public class Test03 {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        String[] strs = {"12345","67891","2347809933","98765432102","67891","12347809933","12345","67891"};
        for (int i = 0; i < strs.length; i++) {

            String id = strs[i];
            if(!list.contains(id)){
                list.add(id);
            }

        }
        System.out.println("---------增强for----------");
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("---------迭代器----------");
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }

}
