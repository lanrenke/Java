package homework.Test1;

import java.util.ArrayList;
import java.util.Collections;

/**
     Collections工具类
     ArrayList集合中有如下内容: {33,11,77,55}

     1. 使用Collections.sort()对ArrayList集合中的数据进行排序,并打印出排序后的结果。
     2. 使用Collections.shuffle ()对ArrayList集合中的数据进行随机打乱顺序,并打印出排序后的结果。
     3. 使用Collections.reverse()对ArrayList集合中的数据进行反转,使用增强for遍历ArrayList集合
 */
public class Test08 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,33,11,77,55);

        Collections.sort(list);
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);

        Collections.reverse(list);
        for (Integer integer : list) {
            System.out.println(integer);
        }

    }

}
