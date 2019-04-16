package basecode._05Objects类;

import java.util.Objects;

/**
 目标：掌握Objects类三个常用方法

 讲解：
     static boolean	equals(Object a, Object b)
     判断对象a和对象b是否相同，相同返回true，否则false
     推荐使用，该方法是空指针安全

     static boolean	isNull(Object obj)
     判断对象obj是否为null，是返回true，否则false

     static boolean	nonNull(Object obj)
     判断对象obj是否不为null，是返回true，否则false

 小结：
     1.Objects类三个常用方法
         equals
         isNull
         nonNull
 */
public class Demo05 {

    public static void main(String[] args) {

        // 创建两个学生对象
        Student s1 = new Student("rose",20);
        Student s2 = new Student("rose",20);

        // 判断对象s1和s2是否相同
        /*
         Objects类equals方法源码分析：
             public static boolean equals(Object a, Object b) {
                    return (a == b) || (a != null && a.equals(b));
             }
         */
        System.out.println(Objects.equals(s1,s2));//从源码中可以看出，判断条件为 1 判断地址值是否相等
                                                  //2判断参数不为空且调用的方法还是Object equals方法，但在本案例中已经重写了方法。
        System.out.println(s1.equals(s2));//代码功能和上面一致
        //两个代码功能相似，使用哪个？ 可以从源码中可以看出，有判断为空的条件：
        if (s1 != null){ //如果不判断，当调用方法的对象为空的时候就会运行报错了，需要手动写代码判断。而Objects方法不需要，自带这个功能。
            System.out.println(s1.equals(s2));  // true
        }


        System.out.println("--------------------");

        s1 = null;
        s2 = null;

        // 判断对象obj是否为null
        System.out.println(Objects.isNull(s1)); // true
        System.out.println(Objects.isNull(s2)); // true

        // 判断对象obj是否不为null
        System.out.println(Objects.nonNull(s1)); // false
        System.out.println(Objects.nonNull(s2)); // false

    }

}
