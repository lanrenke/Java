package basecode._10斗地主案例;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 斗地主案例效果演示
 */
public class Demo12 {
    public static void main(String[] args){
        // 定义集合保存牌
        ArrayList<Poker> pokers = new ArrayList<Poker>();
        // 添加大小王
        pokers.add(new Poker("大王", ""));
        pokers.add(new Poker("小王", ""));

        // 定义花色数组
        String[] colors = {"♠", "♥", "♣", "♦"};
        // 定义牌号数组
        String[] numbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        for (String number : numbers) {
            // "2"
            for (String color : colors) {
                // "♠", "♥", "♣", "♦"
                Poker p = new Poker(number, color);
                // 将创建好的牌添加到集合中
                pokers.add(p);
            }
        }

        System.out.println("pokers: " + pokers);
        // Collections: 集合工具类,它里面的所有方法都是用来操作集合的
        // static void shuffle​(List<?> list) 使用默认的随机源随机排列指定的列表。
        Collections.shuffle(pokers); // new ArrayList<Poker>();

        // 发牌
        // 创建4个集合来存储牌
        ArrayList<Poker> player01 = new ArrayList<>();
        ArrayList<Poker> player02 = new ArrayList<>();
        ArrayList<Poker> player03 = new ArrayList<>();
        ArrayList<Poker> diPai = new ArrayList<>();

        // 发牌
        //  0    1   2    3   4    5    6   7    8  ....          51   52  53
        // [♣9, ♦J, ♣5, ♣4, ♣J, ♥Q, ♦10, ♦2, ♥7, ♣K, ♣3, ♦4, ♠7, ♦7, ♠6,]
        for (int i = 0; i < pokers.size(); i++) {
            // 玩家1:  0,3,6  -> 索引 % 3 == 0
            // 玩家2:  1,4,7  -> 索引 % 3 == 1
            // 玩家3:  2,5,8  -> 索引 % 3 == 2
            // 底牌:  51, 52, 53

            // 取出牌
            // i 是 索引
            // poker 是 一张牌
            Poker poker = pokers.get(i);
            // i = 51 52
            if (i >= 51) { // 底牌
                diPai.add(poker);
            } else if (i % 3 == 0) { // 玩家1
                player01.add(poker);
            } else if (i % 3 == 1) { // 玩家2
                player02.add(poker);
            } else if (i % 3 == 2) { // 玩家3
                player03.add(poker);
            }
        }

        // 看牌: 打印对应的集合集合
        System.out.println("玩家1: " + player01);
        System.out.println("玩家2: " + player02);
        System.out.println("玩家3: " + player03);
        System.out.println("底牌: " + diPai);
    }
}
