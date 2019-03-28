package ck.basecode.demo;
/** 使用foreach遍历数组。foreach形式遍历既可以遍历集合也可以遍历数组。
    集合是后续我们会学到的另一个容器。foreach只是一个技术名称，是一种遍历方式，

    foreach遍历的格式:
     for(被遍历集合或者数组中元素的类型 变量 : 被遍历集合或者数组){
         System.out.println(变量);
     }

 */
public class Test05 {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5};

        //foreach 遍历
        for (int num : arr1
             ) {
            System.out.println(num);

        }

        System.out.println("------------------");

        String[] arr2 = {"a","b","c","d"};
        for (String name : arr2
             ) {
            System.out.println(name);
        }

    }

}
