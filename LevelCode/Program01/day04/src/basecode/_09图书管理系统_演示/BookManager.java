package basecode._09图书管理系统_演示;

import java.util.*;

public class BookManager {
    public static void main(String[] args){
        // 创建Map集合存储书籍信息
        Map<String,ArrayList<Book>> allBooks = new HashMap<>();
        // 初始化书籍信息
        initBookInfo(allBooks);

        // 创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        // 使用死循环保证程序不退出
        while(true){
            // 显示主界面信息
            System.out.println("--------欢迎来到学生管理系统--------");
            System.out.println("1.查看所有书籍");
            System.out.println("2.添加书");
            System.out.println("3.删除书");
            System.out.println("4.修改书");
            System.out.println("5.退出");
            System.out.println("请输入你的选择：");

            // 接收用户输入操作数
            int number = sc.nextInt();
            switch (number){
                case 1: // 查看所有书籍
                    showAllBook(allBooks);
                    break;
                case 2: // 添加书
                    addBook(allBooks);
                    break;
                case 3: // 删除书
                    deleteBook(allBooks);
                    break;
                case 4: // 修改书
                    editBook(allBooks);
                    break;
                case 5: // 退出
                    System.out.println("谢谢使用");
                    System.exit(0);
                    break;
                default:
                    System.out.println("你输入的数字有误，请重新输入...");
                    break;
            }
        }
    }

    /**
     * 修改书
     */
    private static void editBook(Map<String, ArrayList<Book>> allBooks) {
        // 1. 创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        // 2. 提示用户输入书籍的类型
        System.out.println("请输入要删除的书籍类型：");
        // 3. 接收用户输入的书籍类型
        String type = sc.nextLine();

        // 4. 判断类型是否存在，如果不存在则直接返回
        if(!allBooks.containsKey(type)){
            System.out.println("你输入的类型不存在...");
            return;
        }
        // 5. 提示用户输入要修改的书名
        System.out.println("请输入要修改的书名：");
        // 6. 接收书名
        String name = sc.nextLine();

        // 6.1 根据类型找到ArrayList集合
        ArrayList<Book> books = allBooks.get(type);

        for (Book book : books) {
            // 6.2 判断书名是否存在
            if (book.getName().equals(name)){
                // 7. 书名存在：则提示用户输入新的书名和价格
                System.out.println("请输入新的书名：");
                // 8. 接收新的书名和价格
                String newName = sc.nextLine();
                System.out.println("请输入新的价格：");
                double newPrice = sc.nextDouble();

                // 9. 修改Book的书名和价格
                book.setName(newName);
                book.setPrice(newPrice);

                // 10. 提示修改成功
                System.out.println("修改成功");
                return;
            }
        }

        // 11. 提示书名不存在
        System.out.println("没有找到该书籍："+ name);
    }

    /**
     * 删除书籍
     */
    private static void deleteBook(Map<String, ArrayList<Book>> allBooks) {
        // 1. 创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        // 2. 提示用户输入书籍的类型
        System.out.println("请输入要删除的书籍类型：");
        // 3. 接收用户输入的书籍类型
        String type = sc.nextLine();
        // 4. 判断类型是否存在
        if (!allBooks.containsKey(type)){
            // 4.1 如果类型不存在，则直接返回
            System.out.println("您删除的书籍类型不存在");
            return;
        }
        // 5. 提示用户输入要删除的书名
        System.out.println("请输入要删除的书名:");
        // 6. 接收用户输入的书名
        String name = sc.nextLine();

        // 7. 根据用户输入的类型获得ArrayList集合：书的集合
        ArrayList<Book> books = allBooks.get(type); // name = 水浒传
        // 8. 遍历书集合查找要删除的书名是否存在
        for (int index = 0; index < books.size();index ++) {
            // 8.1 根据索引获得Book对象
            Book book = books.get(index); // 西游记
            if (book.getName().equals(name)){
                // 8.2 存在，则将书从ArrayList中删除
                books.remove(index);
                System.out.println("删除"+name+"成功");
                return;
            }
        }
        // 不存在，则输出提示信息即可
        System.out.println("没有找到 "+name+" 书籍");
    }
    /**
     * 添加书
     */
    private static void addBook(Map<String, ArrayList<Book>> allBooks) {
        // 0. 创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        // 1. 提示输入添加书籍的类型
        System.out.println("请输入要添加的书籍类型：");
        // 2. 接收用户输入的书籍类型：
        String type = sc.nextLine();// 小说

        // 2.1 根据type获得对应ArrayList集合
        ArrayList<Book> books = allBooks.get(type); // null
        // 2.2 判断数据类型是否存在
        if (books == null){
            // 2.3 如果不存在，则创建一个新的ArrayList集合
            books = new ArrayList<>(); //
            // 2.2.1 添加一个新的类型到allBooks集合中
            allBooks.put(type, books); // 小说  books
        }
        // 3. 提示输入书名
        System.out.println("请输入要添加的书名：");
        // 4. 接收用户输入的书名
        String name = sc.nextLine();

        // 4.1 判断书名是否存在
        for (Book book : books) {
            if (book.getName().equals(name)){
                // 4.2 书名存在则输出提示信息
                System.out.println(name+"书籍已经存在");
                return;
            }
        }

        // 5. 提示输入书的价格
        System.out.println("请输入要添加书的价格：");
        // 6. 接收用户输入的价格
        double price = sc.nextDouble();
        // 7. 根据书名和价格创建Book对象
        Book book = new Book(name, price);
        // 8. 将Book添加到ArrayList集合中
        books.add(book);
        // 9. 提示添加成功
        System.out.println("添加"+name+"成功");
    }
    /**
     * 显示所有数据
     */
    public static void showAllBook(Map<String, ArrayList<Book>> allBooks) {
        System.out.println("类型\t\t书名\t价格");
        // 1. 遍历allBooks集合
        Set<String> keySet = allBooks.keySet();
        // 2. 遍历keySet集合获得类型
        for (String type : keySet) {
            // 3. 根据类型获得对应数据集合
            ArrayList<Book> books = allBooks.get(type);
            // 4. 输出类型
            System.out.println(type);
            // 5. 遍历books集合
            for (Book book : books) {
                System.out.println("\t\t"+book);
            }
        }
    }

    // 初始化数据信息
    public static void initBookInfo(Map<String,ArrayList<Book>> allBooks){
        // 1. 创建ArrayList集合存储  名著  数据信息
        ArrayList<Book> mzList = new ArrayList<>();
        // 2. 添加两本名著书籍
        mzList.add(new Book("西游记",19));
        mzList.add(new Book("水浒传",29));
        // 3. 添加到allBooks集合中
        allBooks.put("名著", mzList);

        // 4. 创建ArrayList集合存储  it书籍  数据信息
        ArrayList<Book> itList = new ArrayList<>();
        // 5. 添加两本 it 书籍
        itList.add(new Book("Java入门到精通",99));
        itList.add(new Book("PHP入门到转Java",9.9));
        // 6. 添加到allBooks集合中
        allBooks.put("it书籍", itList);
    }
}

