package HomeWork;
/**
 定义int类型变量保存长方形的长
 定义int类型变量保存长方形的宽
 定义int类型变量保存长方形的面积,面积=长*宽
 定义int类型变量保存长方形的周长,周长=(长+宽)*2
 使用输出语句输出面积和周长
*/
public class Test01
{
    public static void main(String[] args) {
        int a = 20;
        int b = 6;
        int c = a*b;
        int d = (a+b)*2;
        System.out.println("长方形的面积为:"+c+' '+"周长为:"+d);
    }
}
