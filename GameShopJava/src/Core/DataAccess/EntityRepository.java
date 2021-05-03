package Core.DataAccess;

import java.util.List;

public interface EntityRepository<T> {
    void add(T entity);
    void update(T entity);
    void delete(T entity);
    List<T> getAll();
    T get();
}
