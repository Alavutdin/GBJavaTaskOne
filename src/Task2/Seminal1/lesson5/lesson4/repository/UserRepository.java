package Task2.Seminal1.lesson5.lesson4.repository;

import Task2.Seminal1.lesson5.lesson4.model.User;

import java.util.List;

public interface UserRepository<T extends User> {
    List<T> getAll();
    void add(T t);
    void remove(String name);
    Long getMaxId();
}
