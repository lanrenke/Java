package basecode._09泛型上下限;

import java.util.ArrayList;

/**
     目标：理解泛型通配符?的含义

     讲解：
         1. 多态语法回顾

         2. 通配符?的含义

         3. 泛型通配符使用场景演示
             * 需求：定义一个方法接收ArrayList集合，方法功能：遍历打印集合元素。

     小结：
         1. 泛型通配符?的含义
             可以匹配任意类型的数据
             一般统配符？不会单独使用，一般会结合泛型上下限使用
 */
public class Demo10 {

    public static void main(String[] args) {

        // 1. 多态语法回顾: 父类类型 变量名 = new 子类类型();
        Animal a = new Dog();

        // 在泛型中没有多态的概念
        ArrayList<Animal> list01 = new ArrayList<Animal>();//版本1.7以后可以不写后面尖括号中的内容 这里为了方便展示写上
        // 泛型变量要指定左边，要么两边都要一致
        ArrayList<Dog> list02 = new ArrayList<Dog>();

        // ? 在泛型中是一个通配符：可以匹配任意类型的数据 所以下面所有类型都可以传入方法中。
        ArrayList<?> list03 = new ArrayList<Animal>();
        ArrayList<?> list04 = new ArrayList<Cat>();
        ArrayList<?> list05 = new ArrayList<Dog>();
        ArrayList<?> list06 = new ArrayList<String>();

        printArrayList(list01);
        printArrayList(list02);
        printArrayList(list03);
        printArrayList(list04);

    }

    /*
     * 定义一个方法：接收一个集合对象，方法的功能是将集合元素遍历输出
     *  ArrayList<Object> list = new ArrayList<Animal>();
     *  ArrayList<Object> list =  new ArrayList<Cat>();
     */
    public static void printArrayList(ArrayList<?> list){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

}
