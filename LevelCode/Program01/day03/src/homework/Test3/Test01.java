package homework.Test3;

import java.util.HashSet;
import java.util.Random;

/**
     HashSet
     双色球规则：双色球每注投注号码由6个红色球号码和1个蓝色球号码组成。红色球号码从1—33中选择；蓝色球号
     码从1—16中选择.请随机生成一注双色球号码
 */
public class Test01 {

    public static void main(String[] args) {

        HashSet<Integer> intSet = new HashSet<>();
        Random random = new Random();
        while (intSet.size() < 6){
            int redBallNum = random.nextInt(33) + 1;
            intSet.add(redBallNum);
        }


        int buleBallNum = random.nextInt(16) + 1;

        String num ="";
        for (Integer integer : intSet) {
            num += integer+"-";
        }
        System.out.println("双色球号码为:"+num+"蓝色码为："+buleBallNum);

    }

}
