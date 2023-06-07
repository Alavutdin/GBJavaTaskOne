package Task2.Seminal1.lesson4.repository;

import java.util.List;
import Task2.Seminal1.lesson4.model.User;

public interface UserRepository<T extends User> {
    List<T> getAll();

    void add(T var1);

    void remove(String var1);

    Long getMaxId();
}
