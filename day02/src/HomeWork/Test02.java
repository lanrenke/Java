package HomeWork;
/**
 定义两个byte类型变量b1,b2,并分别赋值为10和20.
 定义变量b3,保存b1和b2的和,并输出.
 定义两个short类型变量s1,s2,并分别赋值为1000和2000.
 定义变量s3,保存s1和s2的和,并输出

*/
public class Test02 {
    public static void main(String[] args) {
        byte b1 = 10;
        byte b2 = 20;
        int b3 = b1 + b2;
        System.out.println("byte类型b1和b2的和为:");
        System.out.println(b3);

        short s1 = 1000;
        short s2 = 2000;
        int s3 = s1 + s2;
        System.out.println("short类型s1和s2的和为:");
        System.out.println(s3);

    }
}
