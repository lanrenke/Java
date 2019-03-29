package code.Base04;
/**
 目标：switch穿透性的应用场景。

 需求：
     1-2-3月     第一季度。
     4-5-6月     第二季度。
     7-8-9月     第三季度。
     10-11-12月  第四季度。

 小结：
    类似情况才使用！！

 */
public class SwitchDemo02 {

    public static void main(String[] args) {

        int month = 1;
        switch (month){

            case 1:
            case 2:
            case 3:
                System.out.println("第一季度");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("第二季度");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("第三季度");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("第四季度");
                break;
            default:
                System.out.println("月份数据有误！");
        }

    }

}
