package code.Base03;
/**
 目标：break可以结束switch分支和当前所在循环。

     break的作用：
         a.结束switch
         b.直接结束break所在的当前循环的执行。
     小结：
         break只能switch分支或者循环中进行使用，否则毫无意义!!

 */
public class BreakDemo01 {

    public static void main(String[] args) {

        for (int i = 0; i < 6; i++) {

            System.out.println("I Love You!");
            if (i == 3){//第四句时中断
                break;
            }

        }

    }

}
