package homework;
/**
 有一个编程比赛,有5个评委给选手打分.取消最高分和最低分后的平均分就是这个选手的最后得分,这5个评委的
 评分为:{99, 100, 98, 97, 96};

 开发提示：
 找出最高分和最低分
 计算出总分
 平均分 = (5个评委的分数-最高分-最低分) / 人数
 */
public class Test10 {

    public static void main(String[] args) {

        int[] point = {99, 100, 98, 97, 96};
        int max = point[0];
        int min = point[0];
        int count = point[0];

        for (int i = 1; i < point.length; i++) {

            count += point[i];
            if (max < point[i]){
                max = point[i];
            }
            if (min > point[i]){
                min = point[i];
            }

        }

       /* System.out.println(count);
        System.out.println(max);
        System.out.println(min);*/

        System.out.println("最终得分: "+(count - max - min)/(point.length - 2));

    }

}
