package basecode._08泛型接口;
/**
 泛型接口
 */
public interface Dao<T> {

    void save(T t);
    void update(T t);
    void delete(int id);
    T findById(int d);

}
