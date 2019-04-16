package basecode._04equals方法;
/**
 目标：掌握Object类equals方法的作用

 讲解：
     1. boolean equals(Object obj) 的作用
         * 官方描述：指示其他某个对象是否与此对象“相等”。
         * 我方描述：比较两个对象是否相同，相同返回true，否则false
         * 默认是通过比较两个对象的地址判断是否相同

 小结：
     1. equals方法的作用
         * 比较两个对象是否相同，相同返回true，否则false
         * 默认是通过比较两个对象的地址判断是否相同

     2. 重写equals方法的目的
         * 比较两个对象是否相同时希望通过两个对象的成员变量值来判断，不想通过地址值比较。
 */
public class Demo04 {

    public static void main(String[] args) {

        Student s1 = new Student("jack",18);
        Student s2 = new Student("jack",18);

        System.out.println(s1.equals(s2));//如果没有重写写equals 方法的话 是会默认对比两个对象的地址，是肯定会输出false的

        /*
             Object类equals方法的源码分析：
             public boolean equals(Object obj) {
                // ==：比较引用数据类型时比较的时地址值
                // this：方法调用者：s1
                // obj：s2
                return this == obj; // return s1 == s2;
            }
        */

        // 定义字符串
        String s3 = "abc";

        System.out.println(s1.equals(s3));//传入的参数并不是类，会直接返回false

        s2 = null;
        System.out.println(s1.equals(s2));//传入空值也是直接返回false

    }

}
