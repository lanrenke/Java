package code.BaseTest;
/**
 求出指定数组 int[] arr = {1,2,3,4,5,6,7,8,9} 中,所有的偶数和
 */
public class Test02 {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i%2 == 0){
                count += i;
            }
        }
        System.out.println("所有的偶数和的值为:"+count);
    }

}
