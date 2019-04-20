package basecode._07Map集合练习;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
     需求说明：
     从键盘中录入一个字符串：计算一个字符串中每个字符出现次数。
     aaabbbccccxy
     a = 3
     b = 3
     c = 4
     x = 1
     y = 1

     Map<Character,Integer> map
     map.put('a',2);
     map.put('b',1);

     步骤分析：
         1. 创建键盘录入对象：Scanner
         2. 接收用户输入的字符串：String
         3. 创建Map集合存储每个字符和其出现次数
         4. 遍历字符串获得每一个字符：Map集合的键
         5. 判断键是否存在，如果不存在则代表字符第一个出现
         添加一个键值对到Map中：字符：1

         6. 如果不是第一次出现，则先根据字符获得值：1
         将值加一再存储到Map中

         7. 遍历map集合输出每一个键值对数据
 */
public class Demo07 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串：");

        String str = sc.nextLine();

        Map<Character,Integer> map = new HashMap<>();

        //字符方法
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            Integer num = map.get(ch);
            if (num == null){
                num = 1;
            }else {
                num = num + 1;
            }
            map.put(ch,num);
        }
        Set<Character> mapSet = map.keySet();
        for (Character ch : mapSet) {
            Integer value = map.get(ch);
            System.out.println(ch+"="+value);
        }


        //数组方法
        //char[] ch = str.toCharArray();
    }

}
