package code.Base05;

import java.util.Scanner;

/**
 目标：星期案例的交互式开发。

 能否接收程序员的键盘数据输入。

 */
public class SwitchDemo01 {

    public static void main(String[] args) {

        System.out.print("请输入您的星期数字:");
        Scanner num = new Scanner(System.in);

        int weekday = num.nextInt();

        switch (weekday){

            case 1:
                System.out.println("周一");
                break;
            case 2:
                System.out.println("周二");
                break;
            case 3:
                System.out.println("周三");
                break;
            case 4:
                System.out.println("周四");
                break;
            case 5:
                System.out.println("周五");
                break;
            case 6:
                System.out.println("周六");
                break;
            case 7:
                System.out.println("周日");
                break;
            default:
                System.out.println("日期数据异常!");

        }

    }

}
