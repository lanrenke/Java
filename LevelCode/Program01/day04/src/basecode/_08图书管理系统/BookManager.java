package basecode._08图书管理系统;

import java.util.*;

public class BookManager {

    //输入对象
    static Scanner sc = new Scanner(System.in);

    //建立Map集合
    static Map<String,ArrayList<Book>> map = new HashMap<>();

    public static void main(String[] args) {

        initBookInfo();

        while (true){

            /**
             *  主界面
             * */
            System.out.println("--------欢迎来到学生管理系统--------");
            System.out.println("1.查看所有书籍");
            System.out.println("2.添加书");
            System.out.println("3.删除书");
            System.out.println("4.修改书");
            System.out.println("5.退出");
            System.out.println("请输入你的选择：");
            Integer num = sc.nextInt();

            switch (num){
                case 1:
                    showBooks();
                    break;
                case 2:
                    addBooks();
                    break;
                case 3:
                    deletBooks();
                    break;
                case 4:
                    updateBooks();
                    break;
                case 5:
                    System.out.println("谢谢使用,欢迎下次光临!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("输入选项有误，请重新输入。");
                    break;
            }

        }

    }

    /**
     * 查看所有书籍
     * */
    private static void showBooks() {

        System.out.println("类型\t\t书名\t价格");
        Set<String> set = map.keySet();
        for (String str : set) {

            ArrayList<Book> books = map.get(str);
            System.out.println(str);

            for (Book book : books) {

                System.out.println("\t\t"+book);

            }
        }

    }


    /**
     * 添加书籍
     * */
    private static void addBooks() {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要添加的书籍类型:");

        String type = sc.nextLine();

        ArrayList<Book> book = map.get(type);

        if (book == null){
            //因为为空 就需要建立一个空的集合
            book = new ArrayList<Book>();
            map.put(type,book);
        }

        System.out.println("请输入要添加的书名:");
        String name = sc.nextLine();

        for (Book b : book) {
            if (b.getName().equals(name)){
                System.out.println(name+"书籍已存在");
                return;
            }
        }

        System.out.println("请输入要添加书的价格:");
        Double price = sc.nextDouble();

        book.add(new Book(name,price));
        System.out.println("添加"+name+"成功");

    }

    /**
     * 删除书
     */
    private static void deletBooks() {

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入要删除书籍的类型:");
        String type = sc.nextLine();

        ArrayList<Book> book = map.get(type);

        if (book == null){
            System.out.println("您删除的书籍类型不存在");
            return;
        }

        System.out.println("请输入要删除的书名:");
        String name = sc.nextLine();

        for (Book b : book) {
            if (b.getName().equals(name)){
                book.remove(b);
                System.out.println("删除"+name+"成功");
                return;
            }
        }

        System.out.println("没有找到"+name+"书籍");

    }

    /**
     *  修改书籍信息
     */
    private static void updateBooks() {

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入要修改的书籍类型:");
        String type = sc.nextLine();

        ArrayList<Book> book = map.get(type);

        if (book == null){
            System.out.println("你输入的类型不存在...");
            return;
        }

        System.out.println("请输入要修改的书名:");
        String name = sc.nextLine();

        for (int i = 0; i < book.size(); i++) {

            Book b = book.get(i);
            if (b.getName().equals(name)){

                System.out.println("请输入新的书名");
                String newName = sc.nextLine();

                while (isExist(book,newName)){

                    System.out.println("已有重名书籍，请重新输入:");
                    newName = sc.nextLine();

                }

                System.out.println("请输入新的价格:");
                Double price = sc.nextDouble();
                b.setName(newName);
                b.setPrice(price);
                System.out.println("修改成功");
                return;
            }

        }
        System.out.println("没有找到该书籍:"+name);

    }

    /**
     * 判断重名问题
     */
    private static boolean isExist(ArrayList<Book> list,String name){

        for (Book book : list) {
            if (book.getName().equals(name)){
                return true;
            }
        }

        return false;
    }


    /**
     * 初始化书籍信息
     */
    private static void initBookInfo() {
        // 创建集合存储名著
        ArrayList<Book> mz = new ArrayList<>();
        // 添加两本名著书籍到mz集合中
        mz.add(new Book("西游记",19.0));
        mz.add(new Book("水浒传",29.0));

        // 创建集合存储it书籍
        ArrayList<Book> it = new ArrayList<>();
        // 添加两本it书籍到集合中
        it.add(new Book("Java入门到精通",99));
        it.add(new Book("PHP入门到转Java",9.9));

        // 将ArrayList作为值添加到allBook集合中
        map.put("名著", mz);
        map.put("it书籍", it);
    }

}
