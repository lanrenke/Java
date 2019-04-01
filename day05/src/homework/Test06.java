package homework;
/**判断数组中的元素是否对称.*/
public class Test06 {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,3,2,1};
        // 2.定义一个boolean类型变量isMirror,初始化值为true
        boolean isMirror = true;
        // 3.for循环初始化变量为:int start = 0, end = arr.length ‐1
        // 4.for循环布尔表达式(条件)为:start <= end
        // 5.for循环步进表达式为:start++, end‐‐
        for (int start = 0, end = (arr.length - 1);start <= end; start++,end--) {
        // 6.在for循环中判断,如果start索引的元素不等与end索引的元素就将isMirror变量设置为 false
            if (arr[start] != arr[end]) {
                isMirror = false;
                break;
            }
        }
        //7.按要求打印数组是否是对称的
        System.out.println("{1,2,3,4,3,2,1} 是否对称:" + isMirror);

    }

}
