package basecode._14自定义Comparator比较器;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 目标：自定义Comparator比较器对集合元素[整型]排序

     讲解:
     1. Collections工具类中与自定义比较器相关的方法
        * public static <T> void sort(List<T> list,Comparator<T> c)


     2. 自定义Comparator比较器对集合排序：集合存储整型数据

     小结：
         1. 自定义Comparator比较器的步骤
             1. 创建类实现Comparator接口
                class MyComparator implements Comparator<Integer>
             2. 重写接口中的方法：compare，在方法中实现排序规则
                return o1 - o2; 升序
                return o2 - o1; 降序
 */
public class Demo16 {

    public static void main(String[] args) {

        // 创建集合对象
        ArrayList<Integer> list = new ArrayList<>();

        // 将数组中的元素添加到指定的集合中
        Collections.addAll(list,1,4,2,7,3);
        System.out.println("排序前：" + list);

        // 自定义比较器排序集合元素：降序排序
        /*// 创建自定义比较器对象
        MyComparator c = new MyComparator();
        // 使用自定义比较器对集合元素排序
        Collections.sort(list,c);*/

        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;//升序
                //return o2 - o1 //降序
            }
        });

        System.out.println("排序后：" + list);

    }

}

// 自定义比较器
class MyComparator implements Comparator<Integer> {
    /**
     * 不要手动调用该方法，sort方法内部对集合元素排序时会自动调用
     * 内部会将集合中的元素两两传递给该方法
     * 程序猿在方法中根据参数定义好排序规则即可
     * o1 - o2 升序
     * o2 - o1 降序
     * 快速排序 + 归并排序
     */
    @Override
    public int compare(Integer o1, Integer o2) {
        // o1 = "abc"
        // o2 = "abd"
        return o2.compareTo(o1);  // o2-o1

        // return o1- o2;
    }
}
