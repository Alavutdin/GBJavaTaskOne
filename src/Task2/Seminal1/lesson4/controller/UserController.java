package Task2.Seminal1.lesson4.controller;

import java.util.List;
import Task2.Seminal1.lesson4.model.User;

public interface UserController<T extends User> {
    void create(String var1, Integer var2, String var3);

    List<T> getAllSortUsers();

    List<T> getAllSortUsersByFamilyName();

    boolean removeUser(String var1);

    List<T> getAll();

    List<T> getAllSortUsersByAge();
}