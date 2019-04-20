package homework.Test2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

/**
     LinkedHashSet

     键盘录入一个字符串.去掉其中重复字符, 打印出不同的那些字符.必须保证顺序.例如输入:aaaabbbcccddd,打印结果为：abcd

     1. 创建Scanner对象,用于键盘录入
     2. 调用Scanner的nextLine()方法,让用户输入一个字符串
     3. 创建LinkedHashSet.用于去除重复的字符串,并保证迭代顺序
     4. 将字符串串转成char[]
     5. 使用增强for循环遍历每个字符
     6. 将每个字符添加到LinkedHashSet中
     7. 使用增强for打印LinkedHashSet中的内容
 */
public class Test07 {

    public static void main(String[] args) {

        System.out.println("请输入字符串：");
        Scanner scanner = new Scanner(System.in);
        String sc = scanner.nextLine();

        HashSet<Character> linkSet = new LinkedHashSet<>();//多态 注意使用对应的包装类
        char[] chars = sc.toCharArray();
        for (char c : chars) {
            linkSet.add(c);//集合不能存放重复数据 会自动过滤
        }

        for (Character character : linkSet) {
            System.out.print(character+" ");
        }

    }

}
