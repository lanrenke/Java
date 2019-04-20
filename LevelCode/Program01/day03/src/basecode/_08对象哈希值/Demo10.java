package basecode._08对象哈希值;
/**
 目标：要知道对象哈希值是什么，有什么作用

     讲解：
     1. 对象哈希值概述
         每一个对象都会有一个哈希值：默认就是对象在内存中的地址值
         哈希值就是一个十进制整数(可以理解为对象的唯一标识)

     2. 如何获得对象哈希值
         通过对象调用hashCode方法获得，方法如下：
         int	hashCode()：返回该对象的哈希码值。


     3. 对象哈希值获取演示
         1. 自定义对象的哈希值
         2. String的哈希值

     小结
         1. 对象哈希值默认和什么相同
            和对象地址值相同

         2. 哈希值的作用
            哈希值是对象存储到哈希表的重要依据
 */
public class Demo10 {

    public static void main(String[] args) {

        // 创建Person对象
        Person p1 = new Person("jack", 20);
        Person p2 = new Person("jack", 20);

        // 获得对象哈希值
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p1);//输出地址 地址值（内存中默认16进制）的10进制值和哈希值是一致的。

        System.out.println("---------------------");
        // String的哈希值
        // 结论1： 只要字符串内容相同，哈希值一定相同.
        // 结论2： 字符串内容不同，哈希值也可能相同.
        // 结论3： 只要哈希值不同，字符串内容肯定不同
        String str1 = new String("abc");
        String str2 = new String("abc");
        System.out.println(str1.hashCode()); // 96354 相同的原因是因为String中重写了hashCode方法，不再是输出地址值。
        System.out.println(str2.hashCode()); // 96354

        System.out.println("------------------");
        System.out.println("Aa".hashCode()); // 2112
        System.out.println("BB".hashCode()); // 2112

         /* 重写方法解析
        // abc  遍历每个字节。
         public static int hashCode(byte[] value) {
            int h = 0;
            for (byte v : value) { // v = 99
                h = 31 * h + v ;
                // h = 0 + 97 = 97;
                // h = 31 * 97 + 98 =  3105;
                // h = 31 * 3105 + 99 = 96354
            }
            return h; // 96354
          }
         */

    }

}
