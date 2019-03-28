package ck.basecode.day04.demo01;
/**
 * 无返回值方法，之间调用方法输出内容
 */

public class Test01 {
    public static void main(String[] args) {
        int num = sum();
        System.out.println(num);
    }

    public static int sum(){
        int count = 0;
        for (int i = 1; i <= 100; i++){
            count += i;
        }
        return count;
    }
}
