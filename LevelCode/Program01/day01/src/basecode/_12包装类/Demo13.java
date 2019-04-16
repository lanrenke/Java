package basecode._12包装类;
/**
     目标：能够说出8种基本类型对应的包装类名称

     讲解：
         为什么需要包装类?
             * 我们之前学过基本数据类型有 8 种.基本数据类型效率高,但是功能及其有限,
             只能做加减乘除运算，为了对基本数据类型进行更多的操作,
             Java为每种基本数据类型提供了对应的类(包装类)

             "100" ==> 100
             "0.85" ==> 0.85

         八种基本数据类型与对应的包装类名称
             byte                Byte
             short               Short
             int                 Integer
             long                Long
             float               Float
             double              Double
             char                Character
             boolean             Boolean

         基本数据类型的首字母大写,特别的2个Integer, Character

             包装类常用操作
                 1. 将字符串转换为对应的基本数据类型。
                 "100" ==> 100  int
                 "0.85" ==> 0.85 double

                 2. 将基本数据类型转换为字符串类型。

     小结：
         8种基本数据类型：byte short int long double float char boolean
         8种包装类类名： Byte  Short Integer Long Double Float Character Boolean
 */

public class Demo13 {

    public static void main(String[] args) {

        //  1. 将字符串转换为对应的基本数据类型。
        // String类的trim()方法：去除字符串两边的空格
        String price = " 100 ".trim(); // "100"
        String per = "0.85";

        // 将字符串转换基本数据类型：整型
        int price01 = Integer.parseInt(price);
        // 将小数字符串转换为基本数据类型：浮点型
        double per01 = Double.parseDouble(per);
        System.out.println(price01 * per01);

        // 2. 将基本数据类型转换为字符串类型。
        int num01 = 200;
        // 任何内容和字符串拼接都是字符串
        // String str02 = num01 + "";

        String str02 = Integer.toString(num01);
        System.out.println(str02+1);//因为转换成了字符串 所以+1是会变成字符串 2001 而不是201

    }

}
