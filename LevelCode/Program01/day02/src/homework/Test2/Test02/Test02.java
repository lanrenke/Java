package homework.Test2.Test02;

import java.util.ArrayList;
import java.util.Iterator;

/**
     1. ⾃定义对
     2. 迭代器

     ⾃定义⼈类:包含姓名,年龄,身⾼属性.私有成员变量,⽣成⽆参,有参构造⽅法,⽣成get/set⽅法.创建5个
     ⼈放到ArrayList中.使⽤迭代器获取每个⼈的信息.找出最⾼的⼈,最矮的⼈并输出最⾼⼈和最矮⼈的信
     息.打印格式如下:最⾼的⼈是张三,身⾼1.80. 最矮的⼈是李四,身⾼1.60

     1. 定义学⼈类⽣成类⽆参,有参构造⽅法,⽣成get/set⽅法
     2. 定义ArrayList
     3. 添加5个学⽣
     4. 获取迭代器
     5. 定义最⾼⼈
     6. 定义最矮⼈
     7. 使⽤迭代器循环判断是否有下⼀个⼈
     8. 使⽤next⽅法获取学⽣对象
     9. 判断这个⼈的的身⾼是否⼤于最⼤⾼度
     10. 这个⼈的的身⾼⼤于最⼤⾼度.最⼤身⾼的⼈等于这个⼈
     11. 判断这个⼈的的身⾼是否⼩于于最矮⾼度
     12. 这个⼈的的身⾼⼩于于最矮⾼度.最矮身⾼的⼈等于这个⼈
     13. 按照格式打印信息

 */
public class Test02 {

    public static void main(String[] args) {

        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("张三",18,1.80));
        list.add(new Person("李四",17,1.60));
        list.add(new Person("王五",19,1.75));
        list.add(new Person("关六",16,1.65));
        list.add(new Person("杨七",20,1.70));

        Iterator<Person> it = list.iterator();
        Person maxMan = list.get(0);
        Person minMan = list.get(0);

        while (it.hasNext()){
            Person p = it.next();
            if (p.getHeight() > maxMan.getHeight()){
               maxMan = p;
            }else if (p.getHeight() < minMan.getHeight()){
               minMan = p;
            }
        }

        System.out.println("最⾼的⼈是"+maxMan.getName()+",身⾼"+maxMan.getHeight()+", 最矮的⼈是"+minMan.getName()+",身⾼"+minMan.getHeight());
    }

}
