package basecode._08泛型接口;
/**
 实现接口同时指定泛型变量的具体数据类型
 */
public class StudentDao implements Dao<Student> {

    @Override
    public void save(Student student) {
        System.out.println("保存学生");
    }

    @Override
    public void update(Student student) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Student findById(int d) {
        return null;
    }

}
