package homework.Test1;

import java.util.LinkedList;

/**
    2. LinkedList基本使用
    练习LinkedList基本方法: add, set, get, remove, clear, size方法
*/
public class Test02 {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        System.out.println(list.size());

        list.set(0,3);
        System.out.println(list);

        System.out.println(list.get(1));

        System.out.println(list.remove(1));
        System.out.println(list);

        list.clear();

        System.out.println(list);



    }

}
