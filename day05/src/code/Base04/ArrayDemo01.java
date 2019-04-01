package code.Base04;
/**
 目标：动态初始化数组的元素默认值;

 引入：动态初始化数组定义的时候只确定了数据类型和长度。
      那么动态初始化数组默认的元素值到底是什么呢？

 结论：动态初始化数组其实元素是存在默认值的。
 规则：
     - 所有的数值类型的默认是0或者0.0，整形是0 ，浮点型是0.0
     - 布尔类型的默认值是false
     - char类型的默认值的编号是0
     - 引用类型的默认值是null

 */
public class ArrayDemo01 {

    public static void main(String[] args) {

        int[] ages = new int[80];
        System.out.println(ages[0]);
        System.out.println(ages[79]);
        System.out.println("-------------------");

        double[] dbs = new double[5];
        System.out.println(dbs[0]);
        System.out.println(dbs[4]);

        System.out.println("-------------------");
        boolean[] flags = new boolean[10];
        System.out.println(flags[0]);
        System.out.println(flags[9]);

        System.out.println("-------------------");
        char[] chs = new char[10];
        System.out.println((int)chs[0]);
        System.out.println(chs[9]);

        System.out.println("-------------------");
        String[] names = new String[80];
        System.out.println(names[0]);
        System.out.println(names[79]);

    }

}
