package homework;
/**
 获取数组最小值.数组元素为{12, 33, 25, 6, 16}
 编写步骤：
 1. 定义一个int类型数组arr,元素为{12, 33, 25, 6, 16}
 2. 定义int类型变量min,用于保存最小值,min的初始化值为数组的第一个元素
 3. 遍历arr数组,获取数组的每个元素
 4. 判断遍历到的元素是否小于min
 5. 如果遍历到的元素小于min,将遍历到的元素赋值给min
 6. 按要求输出最小值
 */
public class Test01 {

    public static void main(String[] args) {

        int[] arr = {12,33,25,6,16};
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {

            if (min>arr[i]){
                min = arr[i];
            }

        }

        System.out.println("最小值为:" + min);

    }

}
