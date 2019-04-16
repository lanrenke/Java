package basecode._08泛型接口;
/**
 实现接口时不指定泛型变量的具体数据类型，此时要将实现类定义为泛型类
 泛型变量的具体数据类型由使用者创建实现类对象时指定
 */
public class BaseDao<T> implements Dao<T> {
    @Override
    public void save(T t) {

    }

    @Override
    public void update(T t) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public T findById(int d) {
        return null;
    }
}
