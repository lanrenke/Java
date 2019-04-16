package basecode._08泛型接口;
/**
 实现接口同时指定泛型变量的具体数据类型
 */
public class ProductDao implements Dao<Product> {

    @Override
    public void save(Product product) {
        System.out.println("保存产品");
    }

    @Override
    public void update(Product product) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Product findById(int d) {
        return null;
    }

}
