package basecode._06泛型类;

/**
    处理数组的类
 */
public class MyArrays<T>{
    /**
     * 反转数组元素
     */
    public void reverse(T[] arr) {
        for(int i = 0,j = arr.length - 1;i < j; i++,j--) {
            T temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    /**
     * 将数组元素拼接成字符串
     */
    public String toString(T[] arr) {
        StringBuilder sb = new StringBuilder("[");
        for (T t : arr) {
            sb.append(t).append(",");
        }
        sb.deleteCharAt(sb.length()-1);
        sb.append("]");
        return sb.toString();
    }
}
