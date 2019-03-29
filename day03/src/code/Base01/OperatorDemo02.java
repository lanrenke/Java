package code.Base01;
/**三元运算符`
    是一个分支表达式。
    远远没有if语句强大。

    格式：
        条件表达式?值1:值2;
        执行流程：
        先执行条件表达式的结果，如果是true选择值1返回，如果是false ,选择值2返回。
 */
public class OperatorDemo02 {

    public static void main(String[] args) {

        // 判断一个人是否成年人 Java中字符串的类型是String
        int age = 9;
        String rs = age >= 18?"成年人":"未成年人";
        System.out.println(rs);

        // 练习题：请找出两个整数中的最大值输出
        int a = 10;
        int b = 20;
        int c = a > b?a:b;
        System.out.println(c);

    }

}
