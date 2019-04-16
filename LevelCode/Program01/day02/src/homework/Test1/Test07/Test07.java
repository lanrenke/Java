package homework.Test1.Test07;
/**
    泛型接⼝
     ⾃定义⼀个泛型接⼝Inter ,包含show(E e)抽象⽅法. 使⽤以下两种⽅式创建实现类
     1. 定义实现类时确定泛型的类型
     2. 定义实现类时不确定泛型的类型
     然后创建实现类对象并调⽤show⽅法

     1. 定义泛型接⼝Inter
     2. 在Inter接⼝中定义抽象的show(E e)⽅法
     3. 定义Imple01类.实现Inter接⼝,使⽤定义实现类时确定泛型的类型⽅式
     4. 重写Imple01中的show(String e)⽅法.打印传⼊的内容
     5. 定义Imple02类.实现Inter接⼝,定义实现类时不确定泛型的类型
     6. 重写Imple02类中的show(E e)⽅法.打印传⼊的内容
     7. 在测试类中创建Imple01对象
     8. 调⽤Imple01类的show⽅法传⼊String参数
     9. 在测试类中创建Imple02对象,并确定泛型为Integer类型
     10.调⽤Imple02类的show⽅法传⼊Integer参数
 */
public class Test07 {

    public static void main(String[] args) {

        Imple01 imple01 = new Imple01();
        imple01.show("abc");

        Imple02<Integer> imple02 = new Imple02<>();
        imple02.show(245);

    }

}
