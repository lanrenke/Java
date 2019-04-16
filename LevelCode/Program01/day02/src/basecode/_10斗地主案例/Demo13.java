package basecode._10斗地主案例;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 斗地主案例实现步骤

     组牌
         1. 创建数组存储4种花色
         2. 创建数组存储13个数字
         3. 创建集合存储拼接好的牌：ArrayList<Poker>
         4. 遍历数字，然后遍历花色，将数字和花色进行组合创建Poker对象，添加到集合中
         5. 添加大小王

     洗牌
         将集合中牌顺序打乱
             1. 使用工具类Collections的方法进行洗牌：
             static void shuffle(List<?> list)
             对集合元素进行乱序

     发牌
         1. 创建四个集合用来存储玩家的牌和底牌
         2. 遍历牌的集合获得每一张牌的索引
         3. 判断索引是否大于等于51，是则将牌添加到底牌集合中
             如果小于51则对索引进行%3得到一个值
             如果值为0，则代表牌给玩家1
             如果值为1，则代表牌给玩家2
             如果值为2，则代表牌给玩家3

     看牌
        打印输出
 */
public class Demo13 {

    public static void main(String[] args) {

        //1. 创建数组存储4种花色
        String[] colors = {"黑桃","红桃","梅花","方块"};
        //2. 创建数组存储13个数字
        String[] nums = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        //3. 创建集合存储拼接好的牌：ArrayList<Poker>
        ArrayList<Poker> pokers = new ArrayList<>();
        //4. 遍历数字，然后遍历花色，将数字和花色进行组合创建Poker对象，添加到集合中
        for (String num : nums
             ) {
            for (String color : colors
                 ) {
                Poker poker = new Poker(num,color);
                pokers.add(poker);
            }
        }
        //5. 添加大小王
        pokers.add(new Poker("大王",""));
        pokers.add(new Poker("小王",""));

        System.out.println(pokers);

        System.out.println("--------------------打乱后------------------------");

        //将集合中牌顺序打乱
        //1. 使用工具类Collections的方法进行洗牌：
        //static void shuffle(List<?> list)
        //对集合元素进行乱序
        Collections.shuffle(pokers);
        System.out.println(pokers);

        //1. 创建四个集合用来存储玩家的牌和底牌
        ArrayList<Poker> play1 = new ArrayList<>();
        ArrayList<Poker> play2 = new ArrayList<>();
        ArrayList<Poker> play3 = new ArrayList<>();
        ArrayList<Poker> dp = new ArrayList<>();

        //2. 遍历牌的集合获得每一张牌的索引
        for (int i = 0; i < pokers.size(); i++) {

            //3. 判断索引是否大于等于51，是则将牌添加到底牌集合中
            if (i >=51){
                dp.add(pokers.get(i));
            }else if(i%3 == 0){//如果小于51则对索引进行%3得到一个值
                //如果值为0，则代表牌给玩家1
                play1.add(pokers.get(i));
            }else if(i%3 == 1){
                //如果值为1，则代表牌给玩家2
                play2.add(pokers.get(i));
            }else if(i%3 == 2){
                //如果值为2，则代表牌给玩家3
                play3.add(pokers.get(i));
            }

        }

        System.out.println("-----------------发牌后------------------");
        System.out.println("玩家1："+play1);
        System.out.println("玩家2："+play2);
        System.out.println("玩家3："+play3);
        System.out.println("底牌："+dp);
    }

}
