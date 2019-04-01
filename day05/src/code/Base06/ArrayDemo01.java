package code.Base06;
/**
 目标：数组的遍历。

 什么是遍历？
    遍历就是一个一个的把元素访问一遍。
 遍历有啥用？
     开发中，假如要从一堆数据中找到某个数据，必须遍历。
     开发中，要统计一批数据的平均值。必须遍历求和/长度。
     遍历在开发中用的很多，以后还会讲到。

 数组的遍历方式:
     （1）for循环遍历数组
     （2）foreach遍历数组。

 */
public class ArrayDemo01 {

    public static void main(String[] args) {

        String[] names = {"赵敏","周芷若","殷素素"};
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

    }

}
