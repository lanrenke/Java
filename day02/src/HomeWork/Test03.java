package HomeWork;
/**
 定义 int类型变量i1 和 long类型变量l1
 定义变量add,保存i1和l1的和,并输出.
 定义 long类型变量l2 和 float类型变量f2
 定义变量add2,保存l2和f2的和,并输出.
 定义 int类型变量i3 和 double类型变量d3
 定义变量add3,保存i3和d3的和,并输出.
 */
public class Test03 {

    public static void main(String[] args) {

        int i1 = 100;
        long l1 = 200;
        long add = i1+l1;
        System.out.println("add的值:"+add);

        long l2 = 1000000;
        float f2 = 0.44f;
        float add2 = l2 + f2;
        //double add2 = l2 + f2; 如果使用double会损失精度，因为在赋值给f2的时候已经强制转换了格式。
        System.out.println("add2的值:"+add2);

        int i3 = 1000000;
        double d3 = 0.45;
        double add3 = i3 + d3;
        System.out.println("add3的值:"+add3);

    }

}
