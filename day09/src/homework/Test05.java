package homework;

import java.util.ArrayList;

/**
 开发提示：
     定义购物车类。
     使用ArrayList作为成员变量，保存各种商品对象。
     提供添加商品，移除商品，计算总价的方法。
     定义商品类Goods，包含商品名称，id，价格等属性。
     定义电子商品类EGoods继承Goods。
     定义笔记本类Laptop继承电子商品EGoods类。
     定义手机类继承继承电子商品EGoods类类。
     定义水果类Fruit继承商品类。
 编写步骤
     1. 定义Goods商品类,包含商品编号id,商品名称name,商品价格price属性
     2. 定义EGoods继承Goods类
     3. 定义Phone继承EGoods类
     4. 定义Laptop继承EGoods类
     5. 定义Fruit继承Goods类
     6. 定义购物车类GouWuChe
     7. 在购物车类GouWuChe中定义ArrayList成员变量,用于保存购物车中的商品
     8. 在购物车类GouWuChe中定义addGoods方法,参数为(Goods goods).addGoods方法功能是将商品保存
     到ArrayList集合中
     9. 在购物车类GouWuChe中定义showGoods方法.showGoods方法功能是遍历ArrayList集合中的所有商品
     信息并打印
     10. 在购物车类GouWuChe中定义total方法.total方法功能是计算ArrayList集合中的所有商品的总价和折后
     价格,并输出
     11. 在main方法中创建GouWuChe对象gouWuChe
     12. 在main方法中创建商品Laptop,名称为:笔记本,id为:g10000,价格为:10000
     13. 在main方法中创建商品Phone,名称为:手机,id为:g10001,价格为:5000
     14. 在main方法中创建商品Fruit,名称为:苹果,id为:g20000,价格为:50
     15. 调用购物车的addGoods方法将3个商品添加到购物车中
 16. 调用购物车的showGoods方法,显示购物车中的商品信息17. 调用购物车的total方法,显示购物车中所有商品的价格
 */
public class Test05 {

    public static void main(String[] args) {

        // 11.在main方法中创建GouWuChe对象gouWuChe
        GouWuChe gouWuChe = new GouWuChe();
        // 12.在main方法中创建商品Laptop,名称为:笔记本,id为:g10000,价格为:10000
        Goods g1 = new Laptop( "g10000", "笔记本",10000);
        // 13.在main方法中创建商品Phone,名称为:手机,id为:g10001,价格为:5000
        Goods g2 = new Phone( "g10001","手机", 5000);
        // 14.在main方法中创建商品Fruit,名称为:苹果,id为:g20000,价格为:50
        Goods g3 = new Fruit("g20000", "苹果", 50);
        System.out.println("============添加商品=================");
        // 15.调用购物车的addGoods方法将3个商品添加到购物车中
        gouWuChe.addGoods(g1);
        gouWuChe.addGoods(g2);
        gouWuChe.addGoods(g3);
        System.out.println("============打印商品=================");
        // 16.调用购物车的showGoods方法,显示购物车中的商品信息
        gouWuChe.showGoods();
        // 17.调用购物车的total方法,显示购物车中所有商品的价格
        gouWuChe.total();

    }

}

class GouWuChe{

    ArrayList<Goods> list = new ArrayList<>();

    public void addGoods(Goods goods){

        System.out.println("加入 " + goods.getName() + " 成功");
        list.add(goods);

    }

    public void showGoods() {
        System.out.println("您选购的商品为:");
        for (int i = 0; i < list.size(); i++) {Goods goods = list.get(i);
            System.out.println("\t" + goods.getId() + "," + goods.getName() + "," + goods.getPrice());
        }
    }

    public void total() {
        double off = 0; // 折扣价
        double sum = 0; // 原价
        for (int i = 0; i < list.size(); i++) {
            Goods goods = list.get(i);
            double price = goods.getPrice();
            sum += price;
            // 如果商品为电子产品,就打折计算
            if (goods instanceof EGoods) {
                price *= 0.88;
            }
            off += price;
        }
        System.out.println("------------------");
        System.out.println("原 价为:" + sum + " 元");
        System.out.println("折后价为:" + off + " 元");
    }


    public GouWuChe() {
    }

    public GouWuChe(ArrayList<Goods> list) {
        this.list = list;
    }

}

class EGoods extends Goods{

    public EGoods(String id, String name, double price) {
        super(id, name, price);
    }

}

class Phone extends EGoods{

    public Phone(String id, String name, double price) {
        super(id, name, price);
    }

}

class Laptop extends EGoods{

    public Laptop(String id, String name, double price) {
        super(id, name, price);
    }

}

class Fruit extends Goods{

    public Fruit(String id, String name, double price) {
        super(id, name, price);
    }

}

class Goods{

    private String id;
    private String name;
    private double price;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Goods(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

}
