package services;

import java.util.List;

public interface ObjectService<T> {


    T findById(int id);
    List findall();
    T update(T cd);
    T create(T cd);
    void delete(int id);

}
