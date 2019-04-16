package basecode._07泛型方法;

// 数组工具类
public class MyArrays<T>{
    /**
     * 不是泛型方法：反转数组元素
     */
    public void xxx(T[] arr) {
        for(int i = 0,j = arr.length - 1;i < j; i++,j--) {
            T temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    /**
     * 泛型方法：反转数组元素
     */
    public static <E> void reverse(E[] arr) {
        for(int i = 0,j = arr.length - 1;i < j; i++,j--) {
            E temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    /*public static void reverse(String[] arr) {
        for(int i = 0,j = arr.length - 1;i < j; i++,j--) {
            String temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static void reverse(Integer[] arr) {
        for(int i = 0,j = arr.length - 1;i < j; i++,j--) {
            Integer temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }*/
}
