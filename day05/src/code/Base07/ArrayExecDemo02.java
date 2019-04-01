package code.Base07;
/**
 目标：求最大值。

 解题思想：
 （1）定义数组存储这些数据。
 （2）定义一个变量存储最大值，首先默认用数组的第一个元素作为最大值。
 （3）开始从数组的第二个元素遍历每个数据与最大值变量进行比较
 如果这个元素比最大值变量的当前值还大，替换最大值最大值变量的值为这个元素。
 （4）循环结束，输出最大值变量即可。

 */
public class ArrayExecDemo02 {

    public static void main(String[] args) {

        int[] beautifuls = { 5 , 15 , 2000 , 10000 , 100 , 4000 };
        int max = beautifuls[0];

        for (int i = 1; i < beautifuls.length; i++) {

            if (max < beautifuls[i]){
                max = beautifuls[i];
            }

        }
        System.out.println("最大值为:"+max);

    }

}
