package code._06API文档的使用;


import java.util.Scanner;

/**
    目标：Scanner类的使用。
    明确功能：扫描键盘输入。

    查看文档：
         包：java.util 需要先导入包。
         看方法：public int nextInt():扫描整数。实例方法
                public String next()：扫描一切信息为一个字符。实例方法
         看构造器：
         看例子：     Scanner sc = new Scanner(System.in);
                     int i = sc.nextInt();
    小结：
        静态方法用类名调用，实例方法创建对象来调用。

 */
public class APIDemo02 {
    public static void main(String[] args) {
        /**
         创建一个扫描器Scanner类的对象 sc
         默认扫描键盘输入：System.in：系统键盘输入
         */
        Scanner sc = new Scanner(System.in);
        // 提示用户输入
        System.out.println("请输入您的编号");
        // 开始接收:代码在这里暂停，直到按了回车键开始接收一个整数！
        //int code = sc.nextInt();
        // 开始接收:代码在这里暂停，直到按了回车键开始接收一个字符串信息！
        String code = sc.next();
        System.out.println("收到编号:"+code);
    }
}
