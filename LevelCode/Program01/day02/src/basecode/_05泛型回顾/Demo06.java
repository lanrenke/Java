package basecode._05泛型回顾;

import java.util.ArrayList;
import java.util.Iterator;

/**
     目标：理解集合中使用泛型的好处

     讲解：
         1. 集合不使用泛型存在问题

         2. 集合使用泛型的好处

     小结：
         1. 集合不使用泛型存在问题
             集合中可以存储任意类型的数据
             当遍历获得集合元素时只能使用Object来接收，需要调用子类特有方法时需要强制类型转换。

         2. 集合使用泛型的好处
             将运行时错误转换为编译时错误，可以更早发现错误。
             省去了数据类型转换的麻烦
 */
public class Demo06 {

    public static void main(String[] args){
        // JDK1.5之前集合的使用
//        ArrayList list = new ArrayList();

        ArrayList<String> list = new ArrayList();
        // 添加元素
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        // list.add(123);  定义了String 类型 在新增数据不是对应数据类型时就会报错，虽然在实际项目中无法控制输入内容，但是可以在后端进行判断
                            //可以有报错机制输出错误提示和抓取。

        // 获得迭代器对象
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            // 获得当前遍历的元素
            // String str = (String) it.next();// 如果没有 定义泛型 就需要强制转换 如果内容不是String 类型 强制转换会直接报错 程序就死机了。

            String str = it.next();
            System.out.println(str.length());
        }
    }

}
