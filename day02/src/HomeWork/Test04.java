package HomeWork;
/**
 定义两个int类型变量a1和a2,分别赋值10,11,判断变量是否为偶数,拼接输出结果
 定义两个int类型变量b1和b2,分别赋值12,13,判断变量是否为奇数,拼接输出结果
 */
public class Test04 {

    public static void main(String[] args) {

        int a1 = 10;
        int a2 = 11;
        System.out.println("10是偶数?"+(a1%2==0));
        System.out.println("11是偶数?"+(a2%2==0));

        int b1 = 12;
        int b2 = 13;
        System.out.println("12是偶数?"+(b1%2==1));
        System.out.println("13是偶数?"+(b2%2==1));

    }

}
