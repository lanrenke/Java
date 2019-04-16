package basecode._07泛型方法;

import java.util.Arrays;

/**
     目标：能够定义和使用泛型方法

     讲解：
         1. 泛型类的缺点：创建类对象时确定类型之后，只能使用这种类型了。

         2. 泛型方法的概念
            在定义方法时定义了泛型变量的方法

         3. 泛型方法的定义格式
            修饰符 <泛型变量> 返回值类型 方法名(参数列表){ }

         4. 泛型方法的注意事项
             * 泛型方法泛型变量的具体数据类型由调用者传参决定：根据参数类型决定
             * 静态方法不能使用类上定义的泛型变量，如果静态方法中要使用泛型变量则要将该方法定义为泛型方法。

     小结：
         1.泛型方法的定义格式
             修饰符 <泛型变量> 返回值类型 方法名(参数列表){
                在方法参数列表和方法体中可以将泛型变量当成一种数据类型使用
             }

         2.泛型方法的好处
            * 可以让同一个方法处理各种类型的数据，提高代码的灵活性和复用性。
 */
public class Demo08 {

    public static void main(String[] args) {

        // 创建数组
        String[] strs  = {"a","b","c"};
        Integer[] ins = {1,2,3};

        // 反转数组
        MyArrays.reverse(strs);//因为是泛型方法，所以会自动根据传入参数的类型来定义了对应泛型的类型
        MyArrays.reverse(ins);

        System.out.println(Arrays.toString(strs));
        System.out.println(Arrays.toString(ins));

    }

}
