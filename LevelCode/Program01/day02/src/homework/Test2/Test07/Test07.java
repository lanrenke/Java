package homework.Test2.Test07;

import java.util.ArrayList;

/**
     1. 增强for

     有⼀个数组 String arr[]={"abc","bad","abc","aab","bad","cef","jhi"};创建⼀个ArrayList，将arr数组⾥
     ⾯的元素添加进ArrayList中去，但ArrayList中元素不能重复 (arr数组不变)

     1. 创建数组String arr[] ={"abc","bad","abc","aab","bad","cef","jhi"};
     2. 创建ArrayList集合
     3. 使⽤增强for遍历数组.拿到数组中的每个元素
     4. 使⽤ArrayList的contains(Object 0)⽅法判断ArrayList中是否包含某个元素
     5. 如果ArrayList中没有这个元素才添加往数组中添加
 */
public class Test07 {

    public static void main(String[] args) {

        String[] arr1 ={"abc","bad","abc","aab","bad","cef","jhi","aab","ccc"};

        ArrayList<String> list = new ArrayList<>();
        for (String str : arr1
             ) {
            if (!list.contains(str)){

                list.add(str);

            }
        }
        System.out.println(list);

    }

}
