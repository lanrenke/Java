package homework.Test2;

import java.util.HashSet;
import java.util.Scanner;

/**
     HashSet
     编写一个程序，键盘录入多个数字,直到录入-1结束.将录入的重复数据去除,计算这些不重复数据的总和和平均值

     1. 创建Scanner对象,用于键盘录入
     2. 创建HashSet.用于去除重复的数字
     3. 不停循环,让用户输入数字
     4. 调用Scanner的nextInt()方法,让用户输入一个数字
     5. 如果用户输入-1,跳出循环
     6. 不是-1将数字添加到HashSet
     7. 定义求和变量sum
     8. 使用增强for获取HashSet中的每个元素
     9. 将每个数字添加到sum中
     10. 输出求和的结果
     11. 输出平均值,平均值 = 总数 / 个数
 */
public class Test08 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        HashSet<Integer> intSet = new HashSet<>();

        while (true){
            System.out.println("请输入数字:");
            int num = sc.nextInt();
            if (num == -1){
                break;
            }
            intSet.add(num);

        }

        int sum = 0;
        for (Integer integer : intSet) {
            sum += integer;
        }

        System.out.println("求和:"+sum);
        System.out.println("平均值:"+sum/(intSet.size()));
    }

}
