package code._11ArrayList存储基本数据类型;


import java.util.ArrayList;

/**
    目标：ArrayList存储基本数据类型;

    语法：
        集合和泛型都不能直接操作基本数据类型。
        集合和泛型都只支持引用数据类型。

    基本数据类型不是引用数据类型，所以集合不支持。

    Java认为一切皆对象。
    基本数据类型不是对象是类型，为了统一一切皆对象的思想
    Java为每个基本数据类型建立了一个对应的类，这个类叫包装类。

    基本数据类型      包装类
    byte            Byte
    short           Short
    int             Integer (特殊)
    long            Long
    char            Character(特殊)
    float           Float
    double          Double

   小结：
        集合要存储基本数据类型，只能用包装类做泛型。
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> lists = new ArrayList<Integer>();
        lists.add(12);// 叫12这个整数对象，是一个引用数类型类型是：Integer
        lists.add(13);// 叫12这个整数对象，是一个引用数类型类型是：Integer


        ArrayList<Double> lists1 = new ArrayList<Double>();
        lists1.add(99.8);
//        lists1.add("ddd");// 报错!
    }
}
