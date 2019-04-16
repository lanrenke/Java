package basecode._11StringBuilder类;
/**
 目标：String和StringBuilder性能测试

 小结：
    StringBuilder在字符串拼接效率上远远高于String
 */
public class Demo122 {

    public static void main(String[] args) {

        test02();
        test01();


    }

    // StringBuilder进行字符串拼接测试
    private static void test02() {

        long startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            sb.append(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("StringBuilder进行字符串拼接测试,耗时: "+(endTime - startTime));

    }

    // String进行字符串拼接测试
    private static void test01() {

        long startTime = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < 100000; i++) {
            str += i;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("String进行字符串拼接测试，耗时: "+(endTime - startTime));

    }


}
