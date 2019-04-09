package code._09ArrayList集合的泛型;

import java.util.ArrayList;

/**
 目标：泛型。

 引入:
     集合默认是可以存储任意类型的元素，但是开发的时候Java还是建议
     要明确集合存储数据的具体的类型。
     泛型：可以约束集合只能操作某个数据类型。

     泛型就是一个标签。


 泛型只能约束编译时，写代码阶段。

 小结：
    JDK 1.7之后泛型后面的类型申明可以省略不写！
 */
public class ArrayListDemo {

    public static void main(String[] args) {

        //  JDK 1.7之后泛型后面的类型申明可以省略不写！
        // 这只能存放String类型的数据
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("PHP");
        list.add("Python");
        list.add("Html");

        System.out.println(list);

        //定义了只能是Student类下对象类型才可以使用
        ArrayList<Student> lists1 = new ArrayList<Student>();
        lists1.add(new Student());
        lists1.add(new Student());

    }

}


class Student{

}