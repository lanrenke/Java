package homework;
/**
 * 定义round方法，接收一位小数，实现四舍五入运算，并返回结果。
 * 开发提示：
    round方法中，参数+0.5后，转换为int类型，并返回。
 * */
public class Test07 {

    public static void main(String[] args) {

        int num = round(23.5);
        System.out.println(num);

    }

    public static int round(double num){

        return (int)(num+0.5);

    }

}
