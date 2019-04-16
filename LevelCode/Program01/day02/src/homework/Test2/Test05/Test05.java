package homework.Test2.Test05;

import java.util.ArrayList;
import java.util.Iterator;

/**
     1. 迭代器使⽤
     2. 定义类

     ⾃定义⼈类:包含姓名,年龄,身⾼属性.私有成员变量,⽣成⽆参,有参构造⽅法,⽣成get/set⽅法.创建5个
     ⼈对象放到ArrayList中.使⽤迭代器获取每个⼈对象.将每个⼈的年龄加2岁.再使⽤增强for打印每个⼈
     的信息

     1. 定义学⼈类⽣成类⽆参,有参构造⽅法,⽣成get/set⽅法
     2. 定义ArrayList
     3. 添加5个学⽣
     4. 获取迭代器
     5. 循环判断是否有下⼀个⼈
     6. 使⽤next⽅法获取学⽣对象
     7. 将学⽣的年龄加2岁,在使⽤setAge⽅法设置回去
     8. 使⽤增强for获取每个学⽣,打印每个学⽣的信息

 */
public class Test05 {

    public static void main(String[] args) {

        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("张三",18,1.80));
        list.add(new Person("李四",17,1.60));
        list.add(new Person("王五",19,1.75));
        list.add(new Person("关六",16,1.65));
        list.add(new Person("杨七",20,1.70));

        Iterator<Person> it = list.iterator();
        while (it.hasNext()){
            Person student = it.next();
            student.setAge(student.getAge()+2);
        }
        for (Person man :list
             ) {
            System.out.println(man.getName()+" "+man.getAge()+" "+man.getHeight());
        }

    }

}
