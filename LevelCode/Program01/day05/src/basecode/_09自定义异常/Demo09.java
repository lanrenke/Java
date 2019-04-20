package basecode._09自定义异常;

import java.util.Scanner;

/**
 目标：能够自定义异常

     讲解：
         1. 为什么要自定义异常？
             JDK提供的异常虽然很多，但是不一定符合我们的需求，此时我们可以根据
             自己的业务来定义异常类。例如：年龄负数问题，考试成绩负数问题。

         2. 自定义异常步骤
             1. 创建一个类继承Exception或RunTimeException
             2. 提供两个构造方法
                 一个无参数构造
                 一个有参数构造

         3. 自定义异常示例
             模拟网站注册：用户输入用户名和年龄，判断年龄是否大于等于18，
             如果没有则抛出自定义异常。
     小结：
         1. 自定义异常的步骤
             1.创建类继承Exception或RuntimException
         2.定义两个构造方法
             无参数
             有参数：接收一个字符串
 */
public class Demo09 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入姓名：");
        String username = sc.nextLine();
        System.out.println("请输入年龄：");
        int age = sc.nextInt();

        try {
            register(username, age);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    /**
     * 执行注册功能，注册成功返回true，否则false
     */
    public static boolean register(String name,int age) throws AgeException {

        if (age < 18) {

            throw new AgeException("您未满18岁，请在家长陪同下进行未成年人账号注册");
            //抛出异常后 无放继续执行下面代码
        }

        return true;
    }

}
