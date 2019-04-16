package basecode._09泛型上下限;

import java.util.ArrayList;
import java.util.Objects;

/**
     目标：理解泛型上下限含义

     讲解：
         1. Animal类型的继承体系
             Object
                |
             Animal
             /  \
             /    \
           Dog    Cat

         2. 需求：
             * 定义方法接收ArrayList集合：存储动物对象。
             * 方法中遍历集合调用动物的eat方法。

         3. 泛型上限
            * <? extends Animal> 可以传递Animal及其子类类型的数据

         4. 泛型下限
            * <? super Animal>  可以传递Animal及其父类类型的数据

     小结：
         1. <? extends Animal> 的含义
            可以接收Animal及其子类类型的数据
         2. <? super Animal> 的含义?
            可以接收Animal及其父类类型的数据
 */
public class Demo11 {

    public static void main(String[] args) {

        // 创建集合对象
        ArrayList<Object> list01 = new ArrayList<Object>();
        ArrayList<Animal> list02 = new ArrayList<Animal>();

        ArrayList<Dog> list03 = new ArrayList<Dog>();
        ArrayList<Cat> list04 = new ArrayList<Cat>();

        //feedAnimal1(list01);//报错 因为1方法只能传入Animal及其子类的对象
        feedAnimal1(list02);
        feedAnimal1(list03);
        feedAnimal1(list04);

        feedAnimal2(list01);
        feedAnimal2(list02);
        //feedAnimal2(list03);//下面两行报错，是因为2方法只能传入Animal及其父类对象
        //feedAnimal2(list04);

    }

    public static void feedAnimal2(ArrayList<? super Animal> list){
        for (int i = 0; i < list.size(); i++) {
            Object obj = list.get(i);//这里的Object是因为在是最上面的父类，使用父类来接之类获取的对象是可以的 就是多态。
            //Animal a = (Animal) list.get(i); //如果需要使用到子类需要强转 不然无放使用。
            //a.eat();
        }
    }

    public static void feedAnimal1(ArrayList<? extends Animal> list){
        for (int i = 0; i < list.size(); i++) {
            Animal a = list.get(i);
            a.eat();
        }
    }

}
