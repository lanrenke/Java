package basecode._14自定义Comparator比较器;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
     目标：自定义Comparator比较器对集合元素[自定义对象]排序

     讲解:
        1. 自定义Comparator比较器对集合排序：集合存储自定义对象
 */
public class Demo17 {

    public static void main(String[] args) {

        // 创建集合
        ArrayList<Student> list = new ArrayList<>();
        // 添加学生
        list.add(new Student("jack",20,100));
        list.add(new Student("rose",18,59));
        list.add(new Student("lily",30,89));
        list.add(new Student("lucy",19,60));

        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getAge() - o1.getAge();//对象排序需要指定对象中的内容元素来进行排序，而不能对整个对象进行排序
                //CPU不知道你是根据什么作为依据来进行排序
            }
        });

        for (Student student : list) {
            System.out.println(student);
        }

    }

}
