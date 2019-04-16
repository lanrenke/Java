package homework.Test2;
/**
 需求说明

 测试以下两个操作执行所消耗的时间

     1. 创建String对象，使用for循环对字符串进行拼接，计算执行10000次for循环花费的时间。
     2. 创建StringBuilder对象，使用for循环对字符串进行拼接，计算执行10000次for循环花费的时间。

 */
public class Test02 {

    public static void main(String[] args) {

        test01();
        test02();

    }

    //String
    private static void test01() {

        long startTime = System.currentTimeMillis();
        String count = "";
        for (int i = 0; i < 10000; i++) {
            count += i;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("String 方法耗时为:"+(endTime - startTime));

    }

    //StringBuilder
    private static void test02() {

        StringBuilder sb = new StringBuilder();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            sb.append(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("StringBuilder 方法耗时为:"+(endTime - startTime));

    }

}
