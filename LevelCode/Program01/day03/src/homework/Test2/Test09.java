package homework.Test2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/**
     HashSet
     有2个ArrayList,元素如下: array1 = "a","b","a","c","d",array2= "e","f","a","d","g",将两个集合重复项去除后合并成一个集合
     1. 创建ArrayList array1
     2. 使用add方法为array1存放对应的元素
     3. 创建ArrayList array2
     4. 使用add方法为array2存放对应的元素
     5. 创建HashSet用于存放去除重复的元素
     6. 遍历array1,获取到每个元素,将每个元素添加到HashSet中
     7. 遍历array2,获取到每个元素,将每个元素添加到HashSet中
     8. 输出HashSet中去除重复后的元素
 */
public class Test09 {

    public static void main(String[] args) {

        ArrayList<String> array1 = new ArrayList<>();
        ArrayList<String> array2 = new ArrayList<>();
        Collections.addAll(array1,"a","b","a","c","d");
        Collections.addAll(array2,"e","f","a","d","g");

        HashSet<String> strSet = new HashSet<>();
        for (String s : array1) {
            strSet.add(s);//自动去重
        }
        for (String s : array2) {
            strSet.add(s);//自动去重
        }

        System.out.println(strSet);

    }



}
