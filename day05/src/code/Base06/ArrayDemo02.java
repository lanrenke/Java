package code.Base06;
/**
 目标：foreach遍历数组。

 foreach遍历的核心点是：记住格式。

 foreach遍历格式：
     for(被遍历集合或者数组中元素的类型 变量 : 被遍历集合或者数组名称){

     }

 记住格式，无敌了！

 总结：
     for循环遍历代码较复杂，for循环的优点是可以知道遍历到了哪里了。for循环带了计数器索引。
     foreach遍历的代码非常简单，不知道自己遍历到了哪里了。
     只是为了遍历拿一下数据建议用foreach，如果还需要知道具体遍历的位置必须用for循环。
 */
public class ArrayDemo02 {

    public static void main(String[] args) {

        String[] names = {"赵敏","周芷若","殷素素"};
        for (String name : names
             ) {
            System.out.println(name);
        }

        System.out.println("-----------------------");
        int[] ages = new int[]{10 , 30 ,50};
        for (int age : ages
             ) {
            System.out.println(age);
        }

    }

}
