package code.Base04;
/**
 目标：Switch的穿透性:

 switch的穿透性:
     如果switch中的case代码块没有写break,一旦执行了这个case代码块，
     switch将不会结束，直接进入下一个case块执行代码（而且不会进行任何匹配），直到遇到break才跳出分支
     这就是switch的穿透性。

 小结：
     如果不想用穿透性，注意不要丢失break.

 */
public class SwitchDemo01 {

    public static void main(String[] args) {

        int weekday = 4;
        switch (weekday){

            case 0:
                System.out.println("周日");
                break;
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
               // break; //因为没有写break 会一直执行到有break才会停止执行
            case 5:
                System.out.println("周五");
               // break;
            case 6:
                System.out.println("周六");
                break;
            default:
                System.out.println("错误日期数");
        }
    }

}
