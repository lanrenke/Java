package ck.test02;

public class Test02 {

    public static void main(String[] args) {

        int[] arr = {88,96,97,74,90,58,77,90,99};

        int count = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {

            count += arr[i];
            if (min > arr[i]){
                min = arr[i];
            }

        }
        System.out.println("总分为:"+count);
        System.out.println("最低分为:"+min);
        System.out.println("平均分为:"+(count-min)/(arr.length - 1));


    }

}
