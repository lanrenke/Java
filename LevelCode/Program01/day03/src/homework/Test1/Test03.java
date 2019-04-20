package homework.Test1;

import java.util.LinkedList;

/**
 LinkedList特有方法
 练习LinkedList特有方法: addFirst, addLast, getFirst, getLast, removeFirst, removeLast方法
 */
public class Test03 {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        list.addFirst(5);
        System.out.println(list);

        list.addLast(6);
        System.out.println(list);

        System.out.println(list.getFirst());

        System.out.println(list.getLast());

        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);

    }

}
