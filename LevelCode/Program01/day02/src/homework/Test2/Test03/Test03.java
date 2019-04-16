package homework.Test2.Test03;

import java.util.ArrayList;

/**
     1. ⽅法定义
     2. 增强for

     ArrayList中有如下数据:”a”,”b”, ”c”, ”c”, ”a”, ”b”, ”b”, ”b”, ”a”.定义名为:frequency(ArrayList arr, String
     key)的⽅法.arr是ArrayList集合,key是要查找的某个元素.使⽤增强for⽅式查找key在ArrayList中出现
     的次数.并将次数作为⽅法的返回值.在mian⽅法中调⽤frequency⽅法

     1. 创建ArrayList
     2. 添加元素
     3. 定义frequency⽅法统计集合中指定元素出现的次数，
     4. 在frequency⽅法中计数变量
     5. 在frequency⽅法中使⽤增强for遍历传⼊的ArrayList集合.拿到每个元素
     6. 如果遍历出来的元素是要查找的元素.计数器加1
     7. 返回计数值
     8. 在main中调⽤这个⽅法测试
 */
public class Test03 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("a");
        list.add("b");
        list.add("c");
        list.add("c");
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("b");
        list.add("a");

        System.out.println(frequency(list,"a"));
    }

    private static int frequency(ArrayList<String> list, String key){

        int count = 0;
        for (String str : list
             ) {
            if (str == key){
                count++;
            }
        }
       return count;

    }

}
