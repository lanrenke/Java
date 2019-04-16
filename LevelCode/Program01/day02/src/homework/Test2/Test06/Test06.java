package homework.Test2.Test06;
/**
    1. 泛型⽅法

    编写⼀个泛形⽅法，接收⼀个任意类型数组，并将数组中的元素按照⼀定的格式打印.” [3, 6, 7, 1, 2] ”

     1. 定义泛型⽅法printArr，接收任意类型的数组
     2. 在printArr中,打印"["
     3. 使⽤for获取数组中的元素，打印 "元素,",最后⼀个元素打印 "元素 ] "
     4. 定义Integer数组
     5. 定义String数组
     6. 调⽤printArr打印数组
 */
public class Test06 {

    public static void main(String[] args) {

        String[] arr1 = {"a","b","c","d","e","f"};
        Integer[] arr2 = {1,2,3,4,5,6,7,8,9,10};
        printArr(arr1);
        printArr(arr2);

    }

    private static <T> void printArr(T[] t){

        System.out.print("[");

        for (int i = 0; i < t.length; i++) {

            if (i == (t.length - 1)){
                System.out.println(t[i]+"]");
            }else {
                System.out.print(t[i]);
            }

        }

    }

}
