package ck.basecode.day04.demo01;
/**比较两个整数是否相同，如何相等返回true,不相等返回false

 - **明确返回值**：比较整数，结果只有两种可能，相同或不同，因此结果是布尔类型。
 - **明确参数列表**：比较的两个整数不确定，所以默认定义两个int类型的参数。*/
public class Test10 {

    public static void main(String[] args) {

        boolean b = compare(40,41);
        System.out.println("40与41是否相同?:"+b);

    }

    public static boolean compare(int a,int b){

        if(a == b){
            return true;
        }else {
            return false;
        }

    }

}
