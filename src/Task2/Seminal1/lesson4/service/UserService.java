package Task2.Seminal1.lesson4.service;

import java.util.List;
import Task2.Seminal1.lesson4.model.User;

public interface UserService<T extends User> {
    void create(String var1, Integer var2, String var3);

    List<T> getAll();

    List<T> getAllSortUsers();

    List<T> getAllSortUsersByFamilyName();

    List<T> getAllSortUsersByAge();

    void removeUser(String var1);
}
