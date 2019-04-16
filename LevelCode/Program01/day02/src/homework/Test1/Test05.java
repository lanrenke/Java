package homework.Test1;

import java.util.ArrayList;

/**
    增强for循环

    往ArrayList添加以下元素” itcast”, ”itcast2”, ” itcast3”, ” itcast4”使⽤增强for遍历ArrayList中的元素

     1. 创建ArrayList
     2. 往ArrayList中添加元素
     3. 使⽤增强for循环获取元素

 */
public class Test05 {

    public static void main(String[] args) {

        //1. 创建ArrayList
        ArrayList<String> list = new ArrayList<>();

        //2. 往ArrayList中添加元素
        list.add("itcast");
        list.add("itcast2");
        list.add("itcast3");
        list.add("itcast4");

        //3. 使⽤增强for循环获取元素
        for (String l : list
             ) {
            System.out.println(l);
        }

    }

}
