package homework.Test1;
/**
    增强for循环

    往int[]添加以下元素{11, 22, 33}使⽤增强for遍历数组中的元素

     1. 创建数组
     2. 使⽤增强for循环获取数组中的元素
 */
public class Test04 {

    public static void main(String[] args) {

        int[] arr ={11,22,33};

        for (int num : arr
             ) {
            System.out.println(num);
        }

    }

}
