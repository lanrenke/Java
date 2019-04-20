package homework.Test2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

/**
     HashSet
     编写一个程序，获取10个1至20的随机数，要求随机数不能重复。使用迭代器把最终的结果输出到控制台

     1. 创建HashSet用于保存随机数
     2. 创建Random用于产生随机数
     3. 使用while循环判断hs的size是否小于10
     4. hs的size小于10就生成一个随机数
     5. 将随机数添加到HashSet,重复的随机数HashSet不会添加6. 获取迭代器
     7. 使用迭代器循环判断是否有下一个元素
     8. 获取到下一个元素.打印出来
 */
public class Test06 {

    public static void main(String[] args) {

        HashSet<Integer> intSet = new HashSet<>();
        Random random = new Random();
        while (intSet.size() < 10) {
            intSet.add(random.nextInt(20) + 1);
        }
        Iterator<Integer> it = intSet.iterator();
        while (it.hasNext()){
            System.out.print(it.next()+" ");
        }

    }

}
