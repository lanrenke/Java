package code.Base03;
/**
 目标：continue结束当前循环的当次执行。

 continue的作用：
 可以结束当前循环的当次执行，直接进入循环的下一次执行！

 案例：
     你老婆生气,罚你每天做三件事。
     （
     1.扫地
     2.喂奶
     3.跪搓衣板
     ）
     需要连续做6天。
     在第四天扫地后，觉得你表现的很好，剩下两件事不用做。
     第五天和第六天还是要继续的。

 小结：
    continue只能用在循环中，否则没有意义！
 */
public class ContinueDemo02 {

    public static void main(String[] args) {

        for (int i = 0; i < 6; i++) {
            System.out.println("扫地");
            if (i == 3){
                continue;
            }
            System.out.println("喂奶");
            System.out.println("跪搓衣板");
            System.out.println("---------------");
        }

    }

}
